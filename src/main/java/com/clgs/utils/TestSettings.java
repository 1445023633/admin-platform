package com.clgs.utils; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestSettings {
	private static int length = 4096;
	private static byte[] array = new byte[length];

	/**
	 * �������д���ļ�
	 * @param filePath �ļ�·�������ļ���
	 * @param output �����
	 */
	public static void outputFileStream(String filePath, OutputStream output) {

		try {
			int len = 0;
			int pos = 0;
			FileInputStream input;
			input = new FileInputStream(filePath);
			while ((len = input.read(array)) != -1) {
				output.write(array, 0, len);
				pos += len;
			}

			output.flush();
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�������:" + e.getMessage());
		} catch (IOException e) {
			System.out.println("�ļ�IO����:" + e.getMessage());
		}

	}

	/**
	 * 
	 * ��ָ�����ı�����д�뵽ָ��·�����ļ�
	 * 
	 * @param path
	 *            Ŀ���ļ�·��
	 * 
	 * @param content
	 *            ��Ҫд�������
	 * 
	 * @return д����
	 * 
	 */

	public static boolean writeToFile(String path, String content)

	{
		final int CACHE = 1024;
		boolean result = false;
		FileOutputStream outFile = null;
		FileChannel channel = null;
		// ���ַ���ת��Ϊ�ֽ�����
		final byte[] bt = content.getBytes();
		ByteBuffer buf = null;
		try {
			outFile = new FileOutputStream(path);
			channel = outFile.getChannel();
			// ��ָ���Ļ���ָ��ֽ����飬�õ��������
			int size = bt.length / CACHE;
			// �õ�������ָ���ʣ����ֽڸ���
			int mod = bt.length % CACHE;
			int start = 0;
			int end = 0;
			for (int i = 0; i < size + 1; i++) {
				if (i == size) {
					if (mod > 0) {
						// �����µ��ֽڻ�����
						buf = ByteBuffer.allocate(mod);
						start = end;
						end += mod;
					} else {
						break;
					}
				} else {
					// �����µ��ֽڻ�����
					buf = ByteBuffer.allocate(CACHE);
					start = end;
					end = (i + 1) * CACHE;
				}
				// ��ָ����ʼĩλ�û�ȡһ�������С���ֽ�
				byte[] bytes = getSubBytes(bt, start, end);
				for (int j = 0; j < bytes.length; j++) {
					buf.put(bytes[j]);
				}
				// ��ת��������Ϊͨ��д������׼��
				buf.flip();
				// ����ͨ��д���ļ�
				channel.write(buf);
				result = true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ر����д򿪵�IO��
			try {
				channel.close();
				outFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 
	 * ��ָ����ʼĩλ�ô��ֽ������л�ȡ��������
	 * 
	 * @param bt
	 *            ԭʼ�ֽ�����
	 * 
	 * @param start
	 *            ��ʼλ��
	 * 
	 * @param end
	 *            ����λ��
	 * 
	 * @return ���ֽ�����
	 * 
	 */

	private static byte[] getSubBytes(byte[] bt, int start, int end)

	{

		int size = end - start;

		byte[] result = new byte[size];

		for (int i = 0; i < size; i++)

		{

			result[i] = bt[i + start];

		}

		return result;

	}
}

