package cn.edu.xidian.behavior;

import java.util.Arrays;
/**
 * 模板方法模式
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
	 * 使用了快速排序
	 * @param arr 要排序的数组
	 * @param begin 开始位置
	 * @param end 结束位置
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