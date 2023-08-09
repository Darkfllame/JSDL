EXE=bin/JSDL.dll

CC=gcc
RM=rm -rf

all:
	$(CC) -shared -o $(EXE) src/*.c -Iinclude -Iinclude/win32 -Llib -lmingw32 -lSDL2

.PHONY: clean

clean:
	$(RM) objs/*.o