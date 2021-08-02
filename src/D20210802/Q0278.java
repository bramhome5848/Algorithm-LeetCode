package D20210802;

/**
 * 278. First Bad Version
 */
public class Q0278 extends VersionControl {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;
        int mid;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(isBadVersion(mid)) right = mid - 1;
            else if(!isBadVersion(mid)) left = mid + 1;
        }

        return left;
    }
}

class VersionControl {
    boolean isBadVersion(int version) {
        return true;
    }
}
