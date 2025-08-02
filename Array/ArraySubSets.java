public class ArraySubSets {
      public boolean isSubset(int a[], int b[]) {
        boolean[] visited = new boolean[a.length];

        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (!visited[j] && a[j] == b[i]) {
                    visited[j] = true;
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }

        return true;
    }
}
