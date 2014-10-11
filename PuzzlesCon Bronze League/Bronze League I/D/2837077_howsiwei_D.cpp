#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;

int main()
{
	vector<vector<int>> a = {
		{0, 0, 0},
		{1, 0, 0},
		{2, 0, 0},
		{3, 0, 0},
		{1, 1, 0},
		{0, 1, 0},
		{1, 1, 0},
		{2, 1, 0},
		{3, 1, 0},
		{1, 0, 1},
	};
	string cs = "ivxlc";
	vector<vector<int>> ans(100, vector<int>(5));
	for (int j = 0, n = 0; j < 10; j++) {
		for (int k = 0; k < 10; k++, n++) {
			if (n != 0) {
				ans[n] = ans[n-1];
			}
			for (int i = 0; i < 3; i++) {
				ans[n][i+2] += a[j][i];
			}
			for (int i = 0; i < 3; i++) {
				ans[n][i] += a[k][i];
			}
		}
	}
	int n;
	while (cin >> n) {
		if (n == 0) {
			break;
		}
		printf("%d: ", n);
		for (int i = 0; i < cs.size(); i++) {
			printf("%d %c%s", ans[n][i], cs[i], i < cs.size()-1 ? ", " : "\n");
		}
	}
	return 0;
}
