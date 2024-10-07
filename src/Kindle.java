import java.util.Scanner;
public class Kindle {

    int totalPages;
    int currentPage;

//================================================================================
public Kindle(int totalPages) {
    this.totalPages = totalPages;
    currentPage = 1;
}

public String toString() {
    return "Page " + currentPage + " of " + totalPages;

}

public void turnPages() {
    currentPage = currentPage + 1;
    if (currentPage > totalPages) {
        currentPage = totalPages;
        System.out.println("Turning a page would take you past the last page.");
    }
}

public void turnPages(int n) {
    currentPage = currentPage + n;
    if (currentPage > totalPages) {
        System.out.println("Turning " + n + " pages would take you past the last page.");
        currentPage = totalPages;
    }
}
}
