# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework

'''
Чтение
'''
class Reading:
	
    def __reade__(): 
        note = []
        with open('notelog.txt','r', encoding='utf-8') as Phone:
            for i in Phone.readlines():
                note.append(i.strip().split(',')) 	
        return (note)
    # note = reade()
    # print(reade()) 