#include <iostream>
#include <cstdio>
#include <vector>
#include <unordered_map>
using namespace std;

int main()
{
	int n;
	bool firstT = true;
	while (cin >> n) {
		if (!firstT) {
			puts("");
		}
		vector<string> names(n);
		for (int i = 0; i < n; i++) {
			cin >> names[i];
		}
		unordered_map<string,int> gains;
		for (int i = 0; i < n; i++) {
			string giver;
			cin >> giver;
			int money_give;
			cin >> money_give;
			int m;
			cin >> m;
			if (m == 0) continue;
			int money_receive = money_give/m;
			gains[giver] -= money_receive*m;
			for (int j = 0; j < m; j++) {
				string receiver;
				cin >> receiver;
				gains[receiver] += money_receive;
			}
		}
		for (int i = 0; i < n; i++) {
			printf("%s %d\n", names[i].c_str(), gains[names[i]]);
		}
		firstT = false;
	}
	return 0;
}
