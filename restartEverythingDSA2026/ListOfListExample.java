package restartEverythingDSA2026;


        import java.util.*;

        public class ListOfListExample {

            public static void main(String[] args) {

                // Step 1: Chhoti lists banao
                List<Integer> list1 = Arrays.asList(1, 2);
                List<Integer> list2 = Arrays.asList(3, 4, 5);
                List<Integer> list3 = Arrays.asList(6);
                List<Integer> list4 = Arrays.asList(9,9,9);

                // Step 2: Big list banao
                List<List<Integer>> bigList = new ArrayList<>();

                // Step 3: Chhoti lists ko big list me add karo
                bigList.add(list1);
                bigList.add(list2);
                bigList.add(list3);
                bigList.add(list4);

                // Step 4: Print using nested loop
                System.out.println("Printing List of List:");
                for (List<Integer> smallList : bigList) {
                    for (int num : smallList) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }

            }
        }

