# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework


'''
"Выйти/Продолжить"
'''
class Outlog:

    def __outlog__(self, picachu):
        picachu = input('\nПродолжить?\n1-да,\n2-нет\n: ')
        if picachu == '1': 
            start() # меню выбора действий
        elif picachu == '2':
            print('Пока!\n')
            exit() 
        else: 
            print('Введена не верная команда')
            outlog()