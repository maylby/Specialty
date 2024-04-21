# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework


'''
Редактор
'''

class Redactor:
    
    def __redact__(self, find, num):  
        list_1 = read()
        edit = input('Кого редактировать?\n: ')
        find = list(filter(lambda x: edit in x[0], list_1))
        if len(find) != 0:
            for i in find: 
                print(i)
        else: 
            print('ФИО нет в контактах')
            outlog()
        if len(find) == 1:
            for i in find: 
                change = input('Изменить ФИО-1, телефон-2\n: ')
                if change == '1':
                    list_1[list_1.index(i)][0] = input('ФИО: ') 
                elif change == '2':
                    list_1[list_1.index(i)][1] = input('Телефон: ')
                else: 
                    print('Введена неверная команда')
                    redact() 			
        choice = 0
        if len(find) > 1: 
            num = input('Введите номер телефона: ') 
            for j in find: 	
                # print(num, j[1])
                if num == j[1]:
                    change = input('Изменить: ФИО - 1, телефон - 2 ')
                    if change == '1':
                        list_1[list_1.index(j)][0] = input('ФИО: ')
                    elif change == '2':
                        list_1[list_1.index(j)][1] = input('Телефон: ')
                    else:
                        print('Введена неверная команда')
                        redact()
                else: choice += 1
            if len(find) == choice: 
                print('Такого номера нет')
        create(list_1)
        outlog()