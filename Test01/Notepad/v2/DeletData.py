# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework


'''
Удаление данных
'''
class DeletData:

    def __delete__(self, name, num):
        list_1 = read()
        name = input('Введите ФИО: ')
        len_list_1 = len(list_1)
        deletion = []
        for i in list_1:
            if name in i[0]:
                deletion.append(i)
        if len(deletion) != 0: print(*deletion, sep ='\n')		
        if len(deletion) == 1:
            list_1.remove(deletion[0])
            create(list_1)
            outlog()
        elif len(deletion) > 1:
            num = input('Введите номер телефона: ')
            for j in deletion:
                if num == j[1]:
                    list_1.remove(j)
                    create(list_1)
                    outlog()
            if len_list_1 == len(list_1):
                print('Нет номера')
                outlog()
        else: 
            print('Контакта нет') 
            outlog()