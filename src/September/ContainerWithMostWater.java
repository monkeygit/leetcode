package September;

public class ContainerWithMostWater {
	
	public int maxArea(int[] height){
		int len = height.length;
		int low = 0, high = len - 1;
		int maxArea = 0;
		while(low < high){
			maxArea = Math.max(maxArea, (high - low)*Math.min(height[low], height[high]));
			if(height[low] < height[high])
				low++;
			else
				high--;
		}
		return maxArea;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
