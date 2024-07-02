badwords = open('badwords.txt', 'r')
repopulate = open('repopulate.txt', 'a')

word = badwords.readline()
while word != '':
    word = word.rstrip('\n')
    repopulate.write(word + '", "')
    word = badwords.readline()
badwords.close()
repopulate.close()
