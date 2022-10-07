/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;
public interface Sortable{ 
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a){ 
        int n = a.length;
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
            Sortable temp = a[i];
            int j;
            for (j = i; j >= interval && a[j - interval].compare(temp) == 1; j -= interval) {
              a[j] = a[j - interval];
            }
            a[j] = temp;
        }   
      }
    }
}

