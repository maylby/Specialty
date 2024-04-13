# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework

'''
Добавить контакт 
'''
class AddContact:

    def __addName__(self, name, num):
        list_1 = reade()
        saves = input('Создать контакт?\nда-1\nнет-2\n ')
        list_2 =[]
        if saves == '1':
            name = input('Введите новое ФИO: ')
            list_2.append(name)
            num = input('Введите номер телефона: ')
            list_2.append(num)
            if len(list(filter(lambda x: list_2 == x, list_1))) > 0:
                print('Такой номер и ФИO уже есть')
            else:
                list_1.append(list_2)
                create(list_1)
                print('Контакт добавлен')
                outlog()
        elif saves == '2':
            outlog()
        else:
            print('Введена неверная команда')
            outlog()
        # print(list_1)