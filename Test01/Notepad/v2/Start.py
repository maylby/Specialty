# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework

'''
Mеню пуск
'''
class Start:

    def __start__():  

        data = input("\nВыбрать действие:\n"
                    "1. Показать список контактов\n"
                    "2. Hайти контакт\n"
                    "3. Добавить контакт\n"
                    "4. Редактировать контакт\n"
                    "5. Удалить\n") 
        
        if data == '1': 
            # reade() # прямая ссылка на функцию работает криво
            note = read()
            print(*note, sep ='\n')
            outlog()
        elif data == '2': 
            find_name()
        elif data == '3': 
            add_name()
        elif data == '4': 
            redact()
        elif data == '5': 
            delete()

    # start()