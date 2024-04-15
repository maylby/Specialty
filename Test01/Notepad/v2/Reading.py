# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework

'''
Чтение
'''
class Reading:
	
    def __reade__(): 
        spros = []
        with open('phonebook.txt','r', encoding='utf-8') as Phone:
            for i in Phone.readlines():
                spros.append(i.strip().split(',')) 	
        return (spros)
    # spros = reade()
    # print(reade())