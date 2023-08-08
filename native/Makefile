EXE=bin/JSDL.dll

CC=gcc
RM=rm -rf

all:
	$(CC) -o $(EXE) src/*.c -Iinclude -Llib -lmingw32 -lSDL2

.PHONY: clean

clean:
	$(RM) objs/*.o