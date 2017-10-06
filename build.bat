@echo off
setlocal
set DIR=.
if "%TARGET%" == "" set TARGET=mingw
rem Requires default mingw64 install path yet.
set MINGW=\msys64\mingw64

set "CFLAGS=-I%MINGW%\include\SDL2"
set "LFLAGS=%DIR%\bin\Tetris.res -L%MINGW%\lib -lSDL2 -mwindows"

mkdir bin
copy src\main\resources\tetris_all.bmp bin\tetris_all.bmp
REM copy %MINGW%\bin\SDL2.dll bin\SDL2.dll

call cinterop -def "%DIR%\src\main\c_interop\sdl.def" -compilerOpts "%CFLAGS%" -target "%TARGET%" -o bin/sdl || exit /b
rem Windows build requires Windows Resource Compiler in paths.
call windres "%DIR%\src\main\resources\Tetris.rc" -O coff -o "%DIR%\bin\Tetris.res" || exit /b
call konanc -target "%TARGET%" "%DIR%\src\main\kotlin\main.kt" "%DIR%\src\main\kotlin\Tetris.kt" -library bin/sdl -linkerOpts "%LFLAGS%" -opt -o bin\Tetris || exit /b

