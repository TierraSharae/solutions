class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
    
    List<Integer> retList = new ArrayList<Integer>(); 

    for (int i : grades) {
        if (i < 38) {
            retList.add(i);
        } else if ((i+2) % 5 == 0){
            retList.add(i+2);
        } else if ((i+1) % 5 == 0){
            retList.add(i+1);
        } else {
            retList.add(i);
        }
    }
    return retList;
    }
}
