package cn.itcast.fileDemo;

import java.io.File;

/*
 *  java.io.File
 *    ������ϵͳ�е�,�ļ�,Ŀ¼(�ļ���),·��,��װ��File����
 *    �ṩ����,����ϵͳ�е�����
 *    File��ϵͳ�޹ص���
 *    �ļ� file
 *    Ŀ¼ directory
 *    ·�� path
 */
public class FileDemo {

	public static void main(String[] args) {
		//File�ྲ̬��Ա����
		//��ϵͳ�йص�·���ָ���
		System.out.println(File.pathSeparator);
		//�������� ; ·���ָ�����Ŀ¼�ָ��� LINUX�ָ����� : 
		
		//��ϵͳ�йص�Ĭ�����Ʒָ���
		System.out.println(File.separator);//���� \  Ŀ¼���Ʒָ�  Linux /
	}
}
