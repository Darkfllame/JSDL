#include <native/com_darkfllame_jsdl_NativeBindings.h>
#include <SDL2/SDL.h>

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1Init(JNIEnv* env, jclass clazz, jint flags) {
    return SDL_Init(flags);
}

void Java_com_darkfllame_jsdl_NativeBindings_SDL_1Quit(JNIEnv* env, jclass clazz) {
    SDL_Quit();
}

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1InitSubSystem(JNIEnv* env, jclass clazz, jint flags) {
    return SDL_InitSubSystem(flags);
}

void Java_com_darkfllame_jsdl_NativeBindings_SDL_1QuitSubSystem(JNIEnv* env, jclass clazz, jint flags) {
    SDL_QuitSubSystem(flags);
}

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1WasInit(JNIEnv* env, jclass clazz, jint flags) {
    return SDL_WasInit(flags);
}

jstring Java_com_darkfllame_jsdl_NativeBindings_SDL_1GetError(JNIEnv* env, jclass clazz) {
    return (*env)->NewStringUTF(env, SDL_GetError());
}

void Java_com_darkfllame_jsdl_NativeBindings_SDL_1SetError(JNIEnv* env, jclass clazz, jstring error) {
    SDL_SetError((*env)->GetStringUTFChars(env, error, NULL));
}

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1PollEvent(JNIEnv* env, jclass clazz, jobject obj) {
    if (obj == NULL)
        return 0;

    SDL_Event e = {0};
    int toProcess = SDL_PollEvent(&e);

    clazz = (*env)->GetObjectClass(env, obj);

    jfieldID type_fid = (*env)->GetFieldID(env, clazz, "type", "I");
    jfieldID timestamp_fid = (*env)->GetFieldID(env, clazz, "timestamp", "I");
    jfieldID window_fid = (*env)->GetFieldID(env, clazz, "window", "J");
    jfieldID event_fid = (*env)->GetFieldID(env, clazz, "event", "I");
    jfieldID state_fid = (*env)->GetFieldID(env, clazz, "state", "I");
    jfieldID mx_fid = (*env)->GetFieldID(env, clazz, "mx", "I");
    jfieldID my_fid = (*env)->GetFieldID(env, clazz, "my", "I");
    jfieldID x_fid = (*env)->GetFieldID(env, clazz, "x", "I");
    jfieldID y_fid = (*env)->GetFieldID(env, clazz, "y", "I");
    jfieldID preciseX_fid = (*env)->GetFieldID(env, clazz, "preciseX", "F");
    jfieldID preciseY_fid = (*env)->GetFieldID(env, clazz, "preciseY", "F");
    jfieldID xrel_fid = (*env)->GetFieldID(env, clazz, "xrel", "I");
    jfieldID yrel_fid = (*env)->GetFieldID(env, clazz, "yrel", "I");
    jfieldID key_fid = (*env)->GetFieldID(env, clazz, "key", "I");
    jfieldID scancode_fid = (*env)->GetFieldID(env, clazz, "scancode", "I");

    (*env)->SetIntField(env, obj, type_fid, e.type);
    (*env)->SetIntField(env, obj, timestamp_fid, e.common.timestamp);
    (*env)->SetLongField(env, obj, window_fid, (jlong)SDL_GetWindowFromID(e.window.windowID));
    (*env)->SetIntField(env, obj, event_fid, e.window.event);
    (*env)->SetIntField(env, obj, state_fid, e.key.state);
    (*env)->SetIntField(env, obj, mx_fid, e.motion.x);
    (*env)->SetIntField(env, obj, my_fid, e.motion.y);
    (*env)->SetIntField(env, obj, x_fid, e.wheel.x);
    (*env)->SetIntField(env, obj, y_fid, e.wheel.y);
    (*env)->SetIntField(env, obj, preciseX_fid, e.wheel.preciseX);
    (*env)->SetIntField(env, obj, preciseY_fid, e.wheel.preciseY);
    (*env)->SetIntField(env, obj, xrel_fid, e.motion.xrel);
    (*env)->SetIntField(env, obj, yrel_fid, e.motion.yrel);
    (*env)->SetIntField(env, obj, key_fid, e.key.keysym.sym);
    (*env)->SetIntField(env, obj, scancode_fid, e.key.keysym.scancode);

    return toProcess;
}

jlong Java_com_darkfllame_jsdl_NativeBindings_SDL_1CreateWindow(JNIEnv* env, jclass clazz, jstring title, jint x, jint y, jint width, jint height, jint flags) {
    return (jlong)SDL_CreateWindow((*env)->GetStringUTFChars(env, title, NULL), x, y, width, height, flags);
}

void Java_com_darkfllame_jsdl_NativeBindings_SDL_1DestroyWindow(JNIEnv* env, jclass clazz, jlong window) {
    if (window == 0)
        return;
    SDL_DestroyWindow((SDL_Window*)window);
}

jstring Java_com_darkfllame_jsdl_NativeBindings_SDL_1GetWindowTitle(JNIEnv* env, jclass clazz, jlong window) {
    return (*env)->NewStringUTF(env, SDL_GetWindowTitle((SDL_Window*)window));
}

void Java_com_darkfllame_jsdl_NativeBindings_SDL_1SetWindowTitle(JNIEnv* env, jclass clazz, jlong window, jstring title) {
    SDL_SetWindowTitle((SDL_Window*)window, (*env)->GetStringUTFChars(env, title, NULL));
}

jintArray Java_com_darkfllame_jsdl_NativeBindings_SDL_1GetWindowSize(JNIEnv* env, jclass clazz, jlong window) {
    if (window == 0)
        return NULL;
    jintArray arr = (*env)->NewIntArray(env, 2);
    int buf[2] = {0};
    SDL_GetWindowSize((SDL_Window*)window, &buf[0], &buf[1]);
    (*env)->SetIntArrayRegion(env, arr, 0, 2, (jint*)buf);
    return arr;
}

void Java_com_darkfllame_jsdl_NativeBindings_SDL_1SetWindowSize(JNIEnv* env, jclass clazz, jlong window, jint width, jint height) {
    SDL_SetWindowSize((SDL_Window*)window, width, height);
}

jintArray Java_com_darkfllame_jsdl_NativeBindings_SDL_1GetWindowPosition(JNIEnv* env, jclass clazz, jlong window) {
    if (window == 0)
        return NULL;
    jintArray arr = (*env)->NewIntArray(env, 2);
    int buf[2] = {0};
    SDL_GetWindowPosition((SDL_Window*)window, &buf[0], &buf[1]);
    (*env)->SetIntArrayRegion(env, arr, 0, 2, (jint*)buf);
    return arr;
}

void Java_com_darkfllame_jsdl_NativeBindings_SDL_1SetWindowPosition(JNIEnv* env, jclass clazz, jlong window, jint x, jint y) {
    SDL_SetWindowPosition((SDL_Window*)window, x, y);
}

void Java_com_darkfllame_jsdl_NativeBindings_SDL_1SetWindowResizable(JNIEnv* env, jclass clazz, jlong window, jboolean resizable) {
    SDL_SetWindowResizable((SDL_Window*)window, resizable);
}

jlong Java_com_darkfllame_jsdl_NativeBindings_SDL_1GetRenderer(JNIEnv* env, jclass clazz, jlong window) {
    return (jlong)SDL_GetRenderer((SDL_Window*)window);
}

jlong Java_com_darkfllame_jsdl_NativeBindings_SDL_1RenderGetWindow(JNIEnv* env, jclass clazz, jlong renderer) {
    return (jlong)SDL_RenderGetWindow((SDL_Renderer*)renderer);
}

jlong Java_com_darkfllame_jsdl_NativeBindings_SDL_1CreateRenderer(JNIEnv* env, jclass clazz, jlong window, jint index, jint flags) {
    return (jlong)SDL_CreateRenderer((SDL_Window*)window, index, flags);
}

void Java_com_darkfllame_jsdl_NativeBindings_SDL_1DestroyRenderer(JNIEnv* env, jclass clazz, jlong renderer) {
    if (renderer == 0)
        return;
    SDL_DestroyRenderer((SDL_Renderer*)renderer);
}

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1SetRenderTarget(JNIEnv* env, jclass clazz, jlong renderer, jlong texture) {
    return SDL_SetRenderTarget((SDL_Renderer*)renderer, (SDL_Texture*)texture);
}

jlong Java_com_darkfllame_jsdl_NativeBindings_SDL_1GetRenderTarget(JNIEnv* env, jclass clazz, jlong renderer) {
    return (jlong)SDL_GetRenderTarget((SDL_Renderer*)renderer);
}

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1SetRenderDrawColor(JNIEnv* env, jclass clazz, jlong renderer, jint r, jint g, jint b, jint a) {
    SDL_SetRenderDrawColor((SDL_Renderer*)renderer, SDL_clamp(r, 0, 255), SDL_clamp(g, 0, 255), SDL_clamp(b, 0, 255), SDL_clamp(a, 0, 255));
}

jintArray Java_com_darkfllame_jsdl_NativeBindings_SDL_1GetRenderDrawColor(JNIEnv* env, jclass clazz, jlong renderer) {
    jintArray arr = (*env)->NewIntArray(env, 4);
    int buf[4] = {0};
    if (SDL_GetRenderDrawColor((SDL_Renderer*)renderer, (Uint8*)&buf[0], (Uint8*)&buf[1], (Uint8*)&buf[2], (Uint8*)&buf[3]) < 0)
        return NULL;
    (*env)->SetIntArrayRegion(env, arr, 0, 2, (jint*)buf);
    return arr;
}

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1RenderClear(JNIEnv* env, jclass clazz, jlong renderer) {
    return SDL_RenderClear((SDL_Renderer*)renderer);
}

void Java_com_darkfllame_jsdl_NativeBindings_SDL_1RenderPresent(JNIEnv* env, jclass clazz, jlong renderer) {
    SDL_RenderPresent((SDL_Renderer*)renderer);
}

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1RenderDrawRect(JNIEnv* env, jclass clazz, jlong renderer, jint x, jint y, jint w, jint h) {
    SDL_Rect r = {x, y, w, h};
    return SDL_RenderDrawRect((SDL_Renderer*)renderer, &r);
}

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1RenderDrawRectF(JNIEnv* env, jclass clazz, jlong renderer, jfloat x, jfloat y, jfloat w, jfloat h) {
    SDL_FRect r = {x, y, w, h};
    return SDL_RenderDrawRectF((SDL_Renderer*)renderer, &r);
}

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1RenderFillRect(JNIEnv* env, jclass clazz, jlong renderer, jint x, jint y, jint w, jint h) {
    SDL_Rect r = {x, y, w, h};
    return SDL_RenderFillRect((SDL_Renderer*)renderer, &r);
}

jint Java_com_darkfllame_jsdl_NativeBindings_SDL_1RenderFillRectF(JNIEnv* env, jclass clazz, jlong renderer, jfloat x, jfloat y, jfloat w, jfloat h) {
    SDL_FRect r = {x, y, w, h};
    return SDL_RenderFillRectF((SDL_Renderer*)renderer, &r);
}