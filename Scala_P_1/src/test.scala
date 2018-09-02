

object test {
  
  
  def main(args: Array[String]) {

		var ln = readLine().split(" ").map(_.toInt)
		var flag:Boolean = false;

		for(i<-ln(0) to ln(1)){	  
			flag =  func(i) || flag;
		}
		
		if (!flag){   
			println(-1)
		}

  }


		def func(args: Int)  :Boolean= {
				var nums =args.toString().toArray;
				if (nums.distinct.size != nums.size){
					return false  
				}

				var num_1=new Array[Int](nums.length)
				for(i<- 0 to nums.length-1){
				  num_1(i)=nums(i)-'0';			  
				}
				var visited =new Array[Int](num_1.length);
				var index=0;		
			for(i<- 0 to nums.length-1)
			{
				index=(index+num_1(index))%num_1.length;
				visited(index)=1;	
			}
					for( i<-visited){
						if(i==0){
							return false;
						}
					}
					System.out.print(args + " ");
					return true;	
		}

		
	

		
}