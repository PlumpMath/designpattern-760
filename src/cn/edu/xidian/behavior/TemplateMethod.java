package cn.edu.xidian.behavior;

import java.util.Arrays;
/**
 * ģ�巽��ģʽ
 * @author WangPeng 
 * @version 1.0   
 * @since JDK 1.7
 */
abstract class TemplateMethod {
	
	public abstract void sort(int[] arr) ;
	
	public void display(int[] arr){
		sort(arr) ;
		System.out.println(Arrays.toString(arr));
	}
}

class ConcreteClass extends TemplateMethod{
	public void sort(int[] arr){
		fastSort(arr,0,arr.length-1) ;
	}
	/**
	 * ʹ���˿�������
	 * @param arr Ҫ���������
	 * @param begin ��ʼλ��
	 * @param end ����λ��
	 */
	public void fastSort(int[] arr,int begin,int end){
		int pivot = partition(arr,begin,end) ;
		if(begin < pivot){
			fastSort(arr,begin,pivot-1) ;
		}
		if(pivot < end){
			fastSort(arr,pivot+1,end) ;
		}
	}
	public int partition(int[] arr, int begin, int end){
		int pivotKey = arr[begin] ;
		while(begin<end){
			while(begin<end && arr[end]>=pivotKey){
				end-- ; 
			}
			if(arr[end] < pivotKey){
				arr[begin] = arr[end] ;
			}
			while(begin<end && arr[begin]<=pivotKey){
				begin++ ;
			}
			if(arr[begin] > pivotKey){
				arr[end] = arr[begin] ;
			}
		}
		arr[begin] = pivotKey ;
		return begin ;
	}
}