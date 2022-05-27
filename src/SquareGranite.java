import java.util.HashMap;

class Fastpower {




        static int[] getIndicesOfItemWeights(int[] arr, int limit) {
            int[] ans = new int[2];
            int[] em = new int[0];
            Integer complementindex = null;
            HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
            if(arr.length==1) return em;

            for(int index=0;index<arr.length;index++){
                int w = arr[index];
                complementindex = m.get(limit-w);

                if(complementindex != null){

                    ans[0]=index;
                    ans[1]=complementindex;
                    return ans;
                }
                else{
                    m.put(w,index);
                }
            }
            return ans;

        }

        public static void main(String[] args) {

        int[] arr={4,6,10,15,16};
        int limit=21;
            getIndicesOfItemWeights(arr,limit);

        }

    }

