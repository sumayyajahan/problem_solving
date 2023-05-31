public class Index {

    public static void main(String[] args) {

        int a[] = {70, 72, 73, 75, 76, 79, 80};
        int mark = 80;
        int position = 0;

        // linear search
        for(int i=0; i<a.length; i++){

             if(a[i] == mark){
                 position = a.length-i;
             }

        }

        System.out.println(position);

    }
}
