#include <vector>
#include <iostream>
#include <algorithm>

int main() {
    int n; std::cin >> n;
    std::vector<int> v;
    v.reserve(n);
    while(n--){
        int x; std::cin >> x;
        v.push_back(x);
    }
    auto v_sorted = v;
    std::sort(v_sorted.begin(),v_sorted.end());

    auto mismatch_1 = std::mismatch(v.begin(),v.end(),
                                    v_sorted.begin());
    auto mismatch_2 = std::mismatch(std::next(mismatch_1.first),v.end(),
                                    std::next(mismatch_1.second));
    auto mismatch_3 = std::mismatch(v.rbegin(),v.rend(),
                                    v_sorted.rbegin());

    if (std::prev(mismatch_3.first.base()) == mismatch_2.first) {
        if (*std::prev(mismatch_2.first)<=*mismatch_1.first) {
           std::cout 
               << "yes\n" << "swap " 
               << std::distance(v.begin(),mismatch_1.first) + 1
               << " "
               << std::distance(v.begin(),mismatch_2.first) + 1;
        }
    }
    else {
       std::reverse(mismatch_1.first,mismatch_3.first.base());
       if (std::equal(mismatch_1.first,std::prev(mismatch_3.first.base()),mismatch_1.second)) {
           std::cout
               << "yes\n" << "reverse "
               << std::distance(v.begin(),mismatch_1.first) + 1
               << " "
               << std::distance(v.begin(),std::prev(mismatch_3.first.base())) + 1;
       }
       else {
           std::cout << "no";
       }
    }

    return 0;
}
