
dic = {
	'e':'q',
	'd':'a',
	'c':'z',
	'r':'w',
	'f':'s',
	'v':'x',
	't':'e',
	'g':'d',
	'b':'c',
	'y':'r',
	'h':'f',
	'n':'v',
	'u':'t',
	'j':'g',
	'm':'b',
	'i':'y',
	'k':'h',
	',':'n',
	'<':'n',
	'o':'u',
	'l':'j',
	'.':'m',
	'>':'m',
	'p':'i',
	':':'k',
	';':'k',
	'[':'o',
	'{':'o',
	"'":'l',
	'"':'l',
	']':'p',
	'}':'p'
}

def map(character):
	character = character.lower()
	return dic[character]

s = ''
try:
	while True:
		cc = input()
		s += cc
except EOFError:
	for c in s:
		if c == ' ':
			print(' ',end='')
		elif c == '\n':
			print()
		else:
			print(map(c),end='')
	print()