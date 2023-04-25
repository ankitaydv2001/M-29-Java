//Program to demonstrate on nested for loop
package org.tnsif.looping;

public class LabeledForLoopProgram {
	public static void main(String[] args) {
		//label
		outer:
			for(int i=1;i<=5;i++)
			{
				System.out.println();
				//label
				inner:
					for(int j=1;j<=5;j++)
					{
						
						if(j==4)
							//it will skip 4 if we use continue in place of break
							break;
						System.out.print(j+" ");
					}
			}
	}

}
