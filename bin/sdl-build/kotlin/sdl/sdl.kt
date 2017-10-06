@file:Suppress("UNUSED_EXPRESSION", "UNUSED_VARIABLE")
package sdl

import konan.SymbolName
import kotlinx.cinterop.*

fun SDL_GetPlatform(): CPointer<ByteVar>? {
    val res = kni_SDL_GetPlatform()
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetPlatform")
private external fun kni_SDL_GetPlatform(): NativePtr

fun SDL_malloc(size: size_t): COpaquePointer? {
    val _size = size
    val res = kni_SDL_malloc(_size)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_SDL_malloc")
private external fun kni_SDL_malloc(size: Long): NativePtr

fun SDL_calloc(nmemb: size_t, size: size_t): COpaquePointer? {
    val _nmemb = nmemb
    val _size = size
    val res = kni_SDL_calloc(_nmemb, _size)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_SDL_calloc")
private external fun kni_SDL_calloc(nmemb: Long, size: Long): NativePtr

fun SDL_realloc(mem: COpaquePointer?, size: size_t): COpaquePointer? {
    val _mem = mem.rawValue
    val _size = size
    val res = kni_SDL_realloc(_mem, _size)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_SDL_realloc")
private external fun kni_SDL_realloc(mem: NativePtr, size: Long): NativePtr

fun SDL_free(mem: COpaquePointer?): Unit {
    val _mem = mem.rawValue
    val res = kni_SDL_free(_mem)
    return res
}

@SymbolName("sdl_kni_SDL_free")
private external fun kni_SDL_free(mem: NativePtr): Unit

fun SDL_getenv(name: String?): CPointer<ByteVar>? {
    return memScoped {
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_getenv(_name)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_getenv")
private external fun kni_SDL_getenv(name: NativePtr): NativePtr

fun SDL_setenv(name: String?, value: String?, overwrite: Int): Int {
    return memScoped {
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _value = value?.cstr?.getPointer(memScope).rawValue
        val _overwrite = overwrite
        val res = kni_SDL_setenv(_name, _value, _overwrite)
        res
    }
}

@SymbolName("sdl_kni_SDL_setenv")
private external fun kni_SDL_setenv(name: NativePtr, value: NativePtr, overwrite: Int): Int

fun SDL_qsort(base: COpaquePointer?, nmemb: size_t, size: size_t, compare: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Int>>?): Unit {
    val _base = base.rawValue
    val _nmemb = nmemb
    val _size = size
    val _compare = compare.rawValue
    val res = kni_SDL_qsort(_base, _nmemb, _size, _compare)
    return res
}

@SymbolName("sdl_kni_SDL_qsort")
private external fun kni_SDL_qsort(base: NativePtr, nmemb: Long, size: Long, compare: NativePtr): Unit

fun SDL_abs(x: Int): Int {
    val _x = x
    val res = kni_SDL_abs(_x)
    return res
}

@SymbolName("sdl_kni_SDL_abs")
private external fun kni_SDL_abs(x: Int): Int

fun SDL_isdigit(x: Int): Int {
    val _x = x
    val res = kni_SDL_isdigit(_x)
    return res
}

@SymbolName("sdl_kni_SDL_isdigit")
private external fun kni_SDL_isdigit(x: Int): Int

fun SDL_isspace(x: Int): Int {
    val _x = x
    val res = kni_SDL_isspace(_x)
    return res
}

@SymbolName("sdl_kni_SDL_isspace")
private external fun kni_SDL_isspace(x: Int): Int

fun SDL_toupper(x: Int): Int {
    val _x = x
    val res = kni_SDL_toupper(_x)
    return res
}

@SymbolName("sdl_kni_SDL_toupper")
private external fun kni_SDL_toupper(x: Int): Int

fun SDL_tolower(x: Int): Int {
    val _x = x
    val res = kni_SDL_tolower(_x)
    return res
}

@SymbolName("sdl_kni_SDL_tolower")
private external fun kni_SDL_tolower(x: Int): Int

fun SDL_memset(dst: COpaquePointer?, c: Int, len: size_t): COpaquePointer? {
    val _dst = dst.rawValue
    val _c = c
    val _len = len
    val res = kni_SDL_memset(_dst, _c, _len)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_SDL_memset")
private external fun kni_SDL_memset(dst: NativePtr, c: Int, len: Long): NativePtr

fun SDL_memset4(dst: COpaquePointer?, `val`: Uint32, dwords: size_t): Unit {
    val _dst = dst.rawValue
    val _val = `val`
    val _dwords = dwords
    val res = kni_SDL_memset4(_dst, _val, _dwords)
    return res
}

@SymbolName("sdl_kni_SDL_memset4")
private external fun kni_SDL_memset4(dst: NativePtr, `val`: Int, dwords: Long): Unit

fun SDL_memcpy(dst: COpaquePointer?, src: COpaquePointer?, len: size_t): COpaquePointer? {
    val _dst = dst.rawValue
    val _src = src.rawValue
    val _len = len
    val res = kni_SDL_memcpy(_dst, _src, _len)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_SDL_memcpy")
private external fun kni_SDL_memcpy(dst: NativePtr, src: NativePtr, len: Long): NativePtr

fun SDL_memmove(dst: COpaquePointer?, src: COpaquePointer?, len: size_t): COpaquePointer? {
    val _dst = dst.rawValue
    val _src = src.rawValue
    val _len = len
    val res = kni_SDL_memmove(_dst, _src, _len)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_SDL_memmove")
private external fun kni_SDL_memmove(dst: NativePtr, src: NativePtr, len: Long): NativePtr

fun SDL_memcmp(s1: COpaquePointer?, s2: COpaquePointer?, len: size_t): Int {
    val _s1 = s1.rawValue
    val _s2 = s2.rawValue
    val _len = len
    val res = kni_SDL_memcmp(_s1, _s2, _len)
    return res
}

@SymbolName("sdl_kni_SDL_memcmp")
private external fun kni_SDL_memcmp(s1: NativePtr, s2: NativePtr, len: Long): Int

fun SDL_wcslen(wstr: CValuesRef<wchar_tVar>?): size_t {
    return memScoped {
        val _wstr = wstr?.getPointer(memScope).rawValue
        val res = kni_SDL_wcslen(_wstr)
        res
    }
}

@SymbolName("sdl_kni_SDL_wcslen")
private external fun kni_SDL_wcslen(wstr: NativePtr): Long

fun SDL_wcslcpy(dst: CValuesRef<wchar_tVar>?, src: CValuesRef<wchar_tVar>?, maxlen: size_t): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _src = src?.getPointer(memScope).rawValue
        val _maxlen = maxlen
        val res = kni_SDL_wcslcpy(_dst, _src, _maxlen)
        res
    }
}

@SymbolName("sdl_kni_SDL_wcslcpy")
private external fun kni_SDL_wcslcpy(dst: NativePtr, src: NativePtr, maxlen: Long): Long

fun SDL_wcslcat(dst: CValuesRef<wchar_tVar>?, src: CValuesRef<wchar_tVar>?, maxlen: size_t): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _src = src?.getPointer(memScope).rawValue
        val _maxlen = maxlen
        val res = kni_SDL_wcslcat(_dst, _src, _maxlen)
        res
    }
}

@SymbolName("sdl_kni_SDL_wcslcat")
private external fun kni_SDL_wcslcat(dst: NativePtr, src: NativePtr, maxlen: Long): Long

fun SDL_wcscmp(str1: CValuesRef<wchar_tVar>?, str2: CValuesRef<wchar_tVar>?): Int {
    return memScoped {
        val _str1 = str1?.getPointer(memScope).rawValue
        val _str2 = str2?.getPointer(memScope).rawValue
        val res = kni_SDL_wcscmp(_str1, _str2)
        res
    }
}

@SymbolName("sdl_kni_SDL_wcscmp")
private external fun kni_SDL_wcscmp(str1: NativePtr, str2: NativePtr): Int

fun SDL_strlen(str: String?): size_t {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_strlen(_str)
        res
    }
}

@SymbolName("sdl_kni_SDL_strlen")
private external fun kni_SDL_strlen(str: NativePtr): Long

fun SDL_strlcpy(dst: CValuesRef<ByteVar>?, src: String?, maxlen: size_t): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _src = src?.cstr?.getPointer(memScope).rawValue
        val _maxlen = maxlen
        val res = kni_SDL_strlcpy(_dst, _src, _maxlen)
        res
    }
}

@SymbolName("sdl_kni_SDL_strlcpy")
private external fun kni_SDL_strlcpy(dst: NativePtr, src: NativePtr, maxlen: Long): Long

fun SDL_utf8strlcpy(dst: CValuesRef<ByteVar>?, src: String?, dst_bytes: size_t): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _src = src?.cstr?.getPointer(memScope).rawValue
        val _dst_bytes = dst_bytes
        val res = kni_SDL_utf8strlcpy(_dst, _src, _dst_bytes)
        res
    }
}

@SymbolName("sdl_kni_SDL_utf8strlcpy")
private external fun kni_SDL_utf8strlcpy(dst: NativePtr, src: NativePtr, dst_bytes: Long): Long

fun SDL_strlcat(dst: CValuesRef<ByteVar>?, src: String?, maxlen: size_t): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _src = src?.cstr?.getPointer(memScope).rawValue
        val _maxlen = maxlen
        val res = kni_SDL_strlcat(_dst, _src, _maxlen)
        res
    }
}

@SymbolName("sdl_kni_SDL_strlcat")
private external fun kni_SDL_strlcat(dst: NativePtr, src: NativePtr, maxlen: Long): Long

fun SDL_strdup(str: String?): CPointer<ByteVar>? {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_strdup(_str)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_strdup")
private external fun kni_SDL_strdup(str: NativePtr): NativePtr

fun SDL_strrev(str: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _str = str?.getPointer(memScope).rawValue
        val res = kni_SDL_strrev(_str)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_strrev")
private external fun kni_SDL_strrev(str: NativePtr): NativePtr

fun SDL_strupr(str: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _str = str?.getPointer(memScope).rawValue
        val res = kni_SDL_strupr(_str)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_strupr")
private external fun kni_SDL_strupr(str: NativePtr): NativePtr

fun SDL_strlwr(str: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _str = str?.getPointer(memScope).rawValue
        val res = kni_SDL_strlwr(_str)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_strlwr")
private external fun kni_SDL_strlwr(str: NativePtr): NativePtr

fun SDL_strchr(str: String?, c: Int): CPointer<ByteVar>? {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val _c = c
        val res = kni_SDL_strchr(_str, _c)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_strchr")
private external fun kni_SDL_strchr(str: NativePtr, c: Int): NativePtr

fun SDL_strrchr(str: String?, c: Int): CPointer<ByteVar>? {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val _c = c
        val res = kni_SDL_strrchr(_str, _c)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_strrchr")
private external fun kni_SDL_strrchr(str: NativePtr, c: Int): NativePtr

fun SDL_strstr(haystack: String?, needle: String?): CPointer<ByteVar>? {
    return memScoped {
        val _haystack = haystack?.cstr?.getPointer(memScope).rawValue
        val _needle = needle?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_strstr(_haystack, _needle)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_strstr")
private external fun kni_SDL_strstr(haystack: NativePtr, needle: NativePtr): NativePtr

fun SDL_utf8strlen(str: String?): size_t {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_utf8strlen(_str)
        res
    }
}

@SymbolName("sdl_kni_SDL_utf8strlen")
private external fun kni_SDL_utf8strlen(str: NativePtr): Long

fun SDL_itoa(value: Int, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val _value = value
        val _str = str?.getPointer(memScope).rawValue
        val _radix = radix
        val res = kni_SDL_itoa(_value, _str, _radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_itoa")
private external fun kni_SDL_itoa(value: Int, str: NativePtr, radix: Int): NativePtr

fun SDL_uitoa(value: Int, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val _value = value
        val _str = str?.getPointer(memScope).rawValue
        val _radix = radix
        val res = kni_SDL_uitoa(_value, _str, _radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_uitoa")
private external fun kni_SDL_uitoa(value: Int, str: NativePtr, radix: Int): NativePtr

fun SDL_ltoa(value: Int, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val _value = value
        val _str = str?.getPointer(memScope).rawValue
        val _radix = radix
        val res = kni_SDL_ltoa(_value, _str, _radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_ltoa")
private external fun kni_SDL_ltoa(value: Int, str: NativePtr, radix: Int): NativePtr

fun SDL_ultoa(value: Int, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val _value = value
        val _str = str?.getPointer(memScope).rawValue
        val _radix = radix
        val res = kni_SDL_ultoa(_value, _str, _radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_ultoa")
private external fun kni_SDL_ultoa(value: Int, str: NativePtr, radix: Int): NativePtr

fun SDL_lltoa(value: Sint64, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val _value = value
        val _str = str?.getPointer(memScope).rawValue
        val _radix = radix
        val res = kni_SDL_lltoa(_value, _str, _radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_lltoa")
private external fun kni_SDL_lltoa(value: Long, str: NativePtr, radix: Int): NativePtr

fun SDL_ulltoa(value: Uint64, str: CValuesRef<ByteVar>?, radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val _value = value
        val _str = str?.getPointer(memScope).rawValue
        val _radix = radix
        val res = kni_SDL_ulltoa(_value, _str, _radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_ulltoa")
private external fun kni_SDL_ulltoa(value: Long, str: NativePtr, radix: Int): NativePtr

fun SDL_atoi(str: String?): Int {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_atoi(_str)
        res
    }
}

@SymbolName("sdl_kni_SDL_atoi")
private external fun kni_SDL_atoi(str: NativePtr): Int

fun SDL_atof(str: String?): Double {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_atof(_str)
        res
    }
}

@SymbolName("sdl_kni_SDL_atof")
private external fun kni_SDL_atof(str: NativePtr): Double

fun SDL_strtol(str: String?, endp: CValuesRef<CPointerVar<ByteVar>>?, base: Int): Int {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val _endp = endp?.getPointer(memScope).rawValue
        val _base = base
        val res = kni_SDL_strtol(_str, _endp, _base)
        res
    }
}

@SymbolName("sdl_kni_SDL_strtol")
private external fun kni_SDL_strtol(str: NativePtr, endp: NativePtr, base: Int): Int

fun SDL_strtoul(str: String?, endp: CValuesRef<CPointerVar<ByteVar>>?, base: Int): Int {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val _endp = endp?.getPointer(memScope).rawValue
        val _base = base
        val res = kni_SDL_strtoul(_str, _endp, _base)
        res
    }
}

@SymbolName("sdl_kni_SDL_strtoul")
private external fun kni_SDL_strtoul(str: NativePtr, endp: NativePtr, base: Int): Int

fun SDL_strtoll(str: String?, endp: CValuesRef<CPointerVar<ByteVar>>?, base: Int): Sint64 {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val _endp = endp?.getPointer(memScope).rawValue
        val _base = base
        val res = kni_SDL_strtoll(_str, _endp, _base)
        res
    }
}

@SymbolName("sdl_kni_SDL_strtoll")
private external fun kni_SDL_strtoll(str: NativePtr, endp: NativePtr, base: Int): Long

fun SDL_strtoull(str: String?, endp: CValuesRef<CPointerVar<ByteVar>>?, base: Int): Uint64 {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val _endp = endp?.getPointer(memScope).rawValue
        val _base = base
        val res = kni_SDL_strtoull(_str, _endp, _base)
        res
    }
}

@SymbolName("sdl_kni_SDL_strtoull")
private external fun kni_SDL_strtoull(str: NativePtr, endp: NativePtr, base: Int): Long

fun SDL_strtod(str: String?, endp: CValuesRef<CPointerVar<ByteVar>>?): Double {
    return memScoped {
        val _str = str?.cstr?.getPointer(memScope).rawValue
        val _endp = endp?.getPointer(memScope).rawValue
        val res = kni_SDL_strtod(_str, _endp)
        res
    }
}

@SymbolName("sdl_kni_SDL_strtod")
private external fun kni_SDL_strtod(str: NativePtr, endp: NativePtr): Double

fun SDL_strcmp(str1: String?, str2: String?): Int {
    return memScoped {
        val _str1 = str1?.cstr?.getPointer(memScope).rawValue
        val _str2 = str2?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_strcmp(_str1, _str2)
        res
    }
}

@SymbolName("sdl_kni_SDL_strcmp")
private external fun kni_SDL_strcmp(str1: NativePtr, str2: NativePtr): Int

fun SDL_strncmp(str1: String?, str2: String?, maxlen: size_t): Int {
    return memScoped {
        val _str1 = str1?.cstr?.getPointer(memScope).rawValue
        val _str2 = str2?.cstr?.getPointer(memScope).rawValue
        val _maxlen = maxlen
        val res = kni_SDL_strncmp(_str1, _str2, _maxlen)
        res
    }
}

@SymbolName("sdl_kni_SDL_strncmp")
private external fun kni_SDL_strncmp(str1: NativePtr, str2: NativePtr, maxlen: Long): Int

fun SDL_strcasecmp(str1: String?, str2: String?): Int {
    return memScoped {
        val _str1 = str1?.cstr?.getPointer(memScope).rawValue
        val _str2 = str2?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_strcasecmp(_str1, _str2)
        res
    }
}

@SymbolName("sdl_kni_SDL_strcasecmp")
private external fun kni_SDL_strcasecmp(str1: NativePtr, str2: NativePtr): Int

fun SDL_strncasecmp(str1: String?, str2: String?, len: size_t): Int {
    return memScoped {
        val _str1 = str1?.cstr?.getPointer(memScope).rawValue
        val _str2 = str2?.cstr?.getPointer(memScope).rawValue
        val _len = len
        val res = kni_SDL_strncasecmp(_str1, _str2, _len)
        res
    }
}

@SymbolName("sdl_kni_SDL_strncasecmp")
private external fun kni_SDL_strncasecmp(str1: NativePtr, str2: NativePtr, len: Long): Int

fun SDL_sscanf(text: String?, fmt: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_SDL_sscanf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(text, fmt), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("sdl_kni_SDL_sscanf")
private external fun kni_SDL_sscanf(): NativePtr

fun SDL_snprintf(text: CValuesRef<ByteVar>?, maxlen: size_t, fmt: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_SDL_snprintf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(text, maxlen, fmt), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("sdl_kni_SDL_snprintf")
private external fun kni_SDL_snprintf(): NativePtr

fun SDL_acos(x: Double): Double {
    val _x = x
    val res = kni_SDL_acos(_x)
    return res
}

@SymbolName("sdl_kni_SDL_acos")
private external fun kni_SDL_acos(x: Double): Double

fun SDL_asin(x: Double): Double {
    val _x = x
    val res = kni_SDL_asin(_x)
    return res
}

@SymbolName("sdl_kni_SDL_asin")
private external fun kni_SDL_asin(x: Double): Double

fun SDL_atan(x: Double): Double {
    val _x = x
    val res = kni_SDL_atan(_x)
    return res
}

@SymbolName("sdl_kni_SDL_atan")
private external fun kni_SDL_atan(x: Double): Double

fun SDL_atan2(x: Double, y: Double): Double {
    val _x = x
    val _y = y
    val res = kni_SDL_atan2(_x, _y)
    return res
}

@SymbolName("sdl_kni_SDL_atan2")
private external fun kni_SDL_atan2(x: Double, y: Double): Double

fun SDL_ceil(x: Double): Double {
    val _x = x
    val res = kni_SDL_ceil(_x)
    return res
}

@SymbolName("sdl_kni_SDL_ceil")
private external fun kni_SDL_ceil(x: Double): Double

fun SDL_copysign(x: Double, y: Double): Double {
    val _x = x
    val _y = y
    val res = kni_SDL_copysign(_x, _y)
    return res
}

@SymbolName("sdl_kni_SDL_copysign")
private external fun kni_SDL_copysign(x: Double, y: Double): Double

fun SDL_cos(x: Double): Double {
    val _x = x
    val res = kni_SDL_cos(_x)
    return res
}

@SymbolName("sdl_kni_SDL_cos")
private external fun kni_SDL_cos(x: Double): Double

fun SDL_cosf(x: Float): Float {
    val _x = x
    val res = kni_SDL_cosf(_x)
    return res
}

@SymbolName("sdl_kni_SDL_cosf")
private external fun kni_SDL_cosf(x: Float): Float

fun SDL_fabs(x: Double): Double {
    val _x = x
    val res = kni_SDL_fabs(_x)
    return res
}

@SymbolName("sdl_kni_SDL_fabs")
private external fun kni_SDL_fabs(x: Double): Double

fun SDL_floor(x: Double): Double {
    val _x = x
    val res = kni_SDL_floor(_x)
    return res
}

@SymbolName("sdl_kni_SDL_floor")
private external fun kni_SDL_floor(x: Double): Double

fun SDL_log(x: Double): Double {
    val _x = x
    val res = kni_SDL_log(_x)
    return res
}

@SymbolName("sdl_kni_SDL_log")
private external fun kni_SDL_log(x: Double): Double

fun SDL_pow(x: Double, y: Double): Double {
    val _x = x
    val _y = y
    val res = kni_SDL_pow(_x, _y)
    return res
}

@SymbolName("sdl_kni_SDL_pow")
private external fun kni_SDL_pow(x: Double, y: Double): Double

fun SDL_scalbn(x: Double, n: Int): Double {
    val _x = x
    val _n = n
    val res = kni_SDL_scalbn(_x, _n)
    return res
}

@SymbolName("sdl_kni_SDL_scalbn")
private external fun kni_SDL_scalbn(x: Double, n: Int): Double

fun SDL_sin(x: Double): Double {
    val _x = x
    val res = kni_SDL_sin(_x)
    return res
}

@SymbolName("sdl_kni_SDL_sin")
private external fun kni_SDL_sin(x: Double): Double

fun SDL_sinf(x: Float): Float {
    val _x = x
    val res = kni_SDL_sinf(_x)
    return res
}

@SymbolName("sdl_kni_SDL_sinf")
private external fun kni_SDL_sinf(x: Float): Float

fun SDL_sqrt(x: Double): Double {
    val _x = x
    val res = kni_SDL_sqrt(_x)
    return res
}

@SymbolName("sdl_kni_SDL_sqrt")
private external fun kni_SDL_sqrt(x: Double): Double

fun SDL_sqrtf(x: Float): Float {
    val _x = x
    val res = kni_SDL_sqrtf(_x)
    return res
}

@SymbolName("sdl_kni_SDL_sqrtf")
private external fun kni_SDL_sqrtf(x: Float): Float

fun SDL_tan(x: Double): Double {
    val _x = x
    val res = kni_SDL_tan(_x)
    return res
}

@SymbolName("sdl_kni_SDL_tan")
private external fun kni_SDL_tan(x: Double): Double

fun SDL_tanf(x: Float): Float {
    val _x = x
    val res = kni_SDL_tanf(_x)
    return res
}

@SymbolName("sdl_kni_SDL_tanf")
private external fun kni_SDL_tanf(x: Float): Float

fun SDL_iconv_open(tocode: String?, fromcode: String?): SDL_iconv_t? {
    return memScoped {
        val _tocode = tocode?.cstr?.getPointer(memScope).rawValue
        val _fromcode = fromcode?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_iconv_open(_tocode, _fromcode)
        interpretCPointer<_SDL_iconv_t>(res)
    }
}

@SymbolName("sdl_kni_SDL_iconv_open")
private external fun kni_SDL_iconv_open(tocode: NativePtr, fromcode: NativePtr): NativePtr

fun SDL_iconv_close(cd: SDL_iconv_t?): Int {
    val _cd = cd.rawValue
    val res = kni_SDL_iconv_close(_cd)
    return res
}

@SymbolName("sdl_kni_SDL_iconv_close")
private external fun kni_SDL_iconv_close(cd: NativePtr): Int

fun SDL_iconv(cd: SDL_iconv_t?, inbuf: CValuesRef<CPointerVar<ByteVar>>?, inbytesleft: CValuesRef<size_tVar>?, outbuf: CValuesRef<CPointerVar<ByteVar>>?, outbytesleft: CValuesRef<size_tVar>?): size_t {
    return memScoped {
        val _cd = cd.rawValue
        val _inbuf = inbuf?.getPointer(memScope).rawValue
        val _inbytesleft = inbytesleft?.getPointer(memScope).rawValue
        val _outbuf = outbuf?.getPointer(memScope).rawValue
        val _outbytesleft = outbytesleft?.getPointer(memScope).rawValue
        val res = kni_SDL_iconv(_cd, _inbuf, _inbytesleft, _outbuf, _outbytesleft)
        res
    }
}

@SymbolName("sdl_kni_SDL_iconv")
private external fun kni_SDL_iconv(cd: NativePtr, inbuf: NativePtr, inbytesleft: NativePtr, outbuf: NativePtr, outbytesleft: NativePtr): Long

fun SDL_iconv_string(tocode: String?, fromcode: String?, inbuf: String?, inbytesleft: size_t): CPointer<ByteVar>? {
    return memScoped {
        val _tocode = tocode?.cstr?.getPointer(memScope).rawValue
        val _fromcode = fromcode?.cstr?.getPointer(memScope).rawValue
        val _inbuf = inbuf?.cstr?.getPointer(memScope).rawValue
        val _inbytesleft = inbytesleft
        val res = kni_SDL_iconv_string(_tocode, _fromcode, _inbuf, _inbytesleft)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_iconv_string")
private external fun kni_SDL_iconv_string(tocode: NativePtr, fromcode: NativePtr, inbuf: NativePtr, inbytesleft: Long): NativePtr

fun SDL_memcpy4(dst: COpaquePointer?, src: COpaquePointer?, dwords: size_t): COpaquePointer? {
    val _dst = dst.rawValue
    val _src = src.rawValue
    val _dwords = dwords
    val res = kni_SDL_memcpy4(_dst, _src, _dwords)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_SDL_memcpy4")
private external fun kni_SDL_memcpy4(dst: NativePtr, src: NativePtr, dwords: Long): NativePtr

fun SDL_main(argc: Int, argv: CValuesRef<CPointerVar<ByteVar>>?): Int {
    return memScoped {
        val _argc = argc
        val _argv = argv?.getPointer(memScope).rawValue
        val res = kni_SDL_main(_argc, _argv)
        res
    }
}

@SymbolName("sdl_kni_SDL_main")
private external fun kni_SDL_main(argc: Int, argv: NativePtr): Int

fun SDL_SetMainReady(): Unit {
    val res = kni_SDL_SetMainReady()
    return res
}

@SymbolName("sdl_kni_SDL_SetMainReady")
private external fun kni_SDL_SetMainReady(): Unit

fun SDL_RegisterApp(name: CValuesRef<ByteVar>?, style: Uint32, hInst: COpaquePointer?): Int {
    return memScoped {
        val _name = name?.getPointer(memScope).rawValue
        val _style = style
        val _hInst = hInst.rawValue
        val res = kni_SDL_RegisterApp(_name, _style, _hInst)
        res
    }
}

@SymbolName("sdl_kni_SDL_RegisterApp")
private external fun kni_SDL_RegisterApp(name: NativePtr, style: Int, hInst: NativePtr): Int

fun SDL_UnregisterApp(): Unit {
    val res = kni_SDL_UnregisterApp()
    return res
}

@SymbolName("sdl_kni_SDL_UnregisterApp")
private external fun kni_SDL_UnregisterApp(): Unit

fun SDL_ReportAssertion(arg0: CValuesRef<SDL_AssertData>?, arg1: String?, arg2: String?, arg3: Int): SDL_AssertState {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.cstr?.getPointer(memScope).rawValue
        val _arg2 = arg2?.cstr?.getPointer(memScope).rawValue
        val _arg3 = arg3
        val res = kni_SDL_ReportAssertion(_arg0, _arg1, _arg2, _arg3)
        SDL_AssertState.byValue(res)
    }
}

@SymbolName("sdl_kni_SDL_ReportAssertion")
private external fun kni_SDL_ReportAssertion(arg0: NativePtr, arg1: NativePtr, arg2: NativePtr, arg3: Int): Int

fun SDL_SetAssertionHandler(handler: SDL_AssertionHandler?, userdata: COpaquePointer?): Unit {
    val _handler = handler.rawValue
    val _userdata = userdata.rawValue
    val res = kni_SDL_SetAssertionHandler(_handler, _userdata)
    return res
}

@SymbolName("sdl_kni_SDL_SetAssertionHandler")
private external fun kni_SDL_SetAssertionHandler(handler: NativePtr, userdata: NativePtr): Unit

fun SDL_GetDefaultAssertionHandler(): SDL_AssertionHandler? {
    val res = kni_SDL_GetDefaultAssertionHandler()
    return interpretCPointer<CFunction<(CPointer<SDL_AssertData>?, COpaquePointer?) -> SDL_AssertState>>(res)
}

@SymbolName("sdl_kni_SDL_GetDefaultAssertionHandler")
private external fun kni_SDL_GetDefaultAssertionHandler(): NativePtr

fun SDL_GetAssertionHandler(puserdata: CValuesRef<COpaquePointerVar>?): SDL_AssertionHandler? {
    return memScoped {
        val _puserdata = puserdata?.getPointer(memScope).rawValue
        val res = kni_SDL_GetAssertionHandler(_puserdata)
        interpretCPointer<CFunction<(CPointer<SDL_AssertData>?, COpaquePointer?) -> SDL_AssertState>>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetAssertionHandler")
private external fun kni_SDL_GetAssertionHandler(puserdata: NativePtr): NativePtr

fun SDL_GetAssertionReport(): CPointer<SDL_AssertData>? {
    val res = kni_SDL_GetAssertionReport()
    return interpretCPointer<SDL_AssertData>(res)
}

@SymbolName("sdl_kni_SDL_GetAssertionReport")
private external fun kni_SDL_GetAssertionReport(): NativePtr

fun SDL_ResetAssertionReport(): Unit {
    val res = kni_SDL_ResetAssertionReport()
    return res
}

@SymbolName("sdl_kni_SDL_ResetAssertionReport")
private external fun kni_SDL_ResetAssertionReport(): Unit

fun SDL_AtomicTryLock(lock: CValuesRef<SDL_SpinLockVar>?): SDL_bool {
    return memScoped {
        val _lock = lock?.getPointer(memScope).rawValue
        val res = kni_SDL_AtomicTryLock(_lock)
        res
    }
}

@SymbolName("sdl_kni_SDL_AtomicTryLock")
private external fun kni_SDL_AtomicTryLock(lock: NativePtr): Int

fun SDL_AtomicLock(lock: CValuesRef<SDL_SpinLockVar>?): Unit {
    return memScoped {
        val _lock = lock?.getPointer(memScope).rawValue
        val res = kni_SDL_AtomicLock(_lock)
        res
    }
}

@SymbolName("sdl_kni_SDL_AtomicLock")
private external fun kni_SDL_AtomicLock(lock: NativePtr): Unit

fun SDL_AtomicUnlock(lock: CValuesRef<SDL_SpinLockVar>?): Unit {
    return memScoped {
        val _lock = lock?.getPointer(memScope).rawValue
        val res = kni_SDL_AtomicUnlock(_lock)
        res
    }
}

@SymbolName("sdl_kni_SDL_AtomicUnlock")
private external fun kni_SDL_AtomicUnlock(lock: NativePtr): Unit

fun SDL_MemoryBarrierReleaseFunction(): Unit {
    val res = kni_SDL_MemoryBarrierReleaseFunction()
    return res
}

@SymbolName("sdl_kni_SDL_MemoryBarrierReleaseFunction")
private external fun kni_SDL_MemoryBarrierReleaseFunction(): Unit

fun SDL_MemoryBarrierAcquireFunction(): Unit {
    val res = kni_SDL_MemoryBarrierAcquireFunction()
    return res
}

@SymbolName("sdl_kni_SDL_MemoryBarrierAcquireFunction")
private external fun kni_SDL_MemoryBarrierAcquireFunction(): Unit

fun SDL_AtomicCAS(a: CValuesRef<SDL_atomic_t>?, oldval: Int, newval: Int): SDL_bool {
    return memScoped {
        val _a = a?.getPointer(memScope).rawValue
        val _oldval = oldval
        val _newval = newval
        val res = kni_SDL_AtomicCAS(_a, _oldval, _newval)
        res
    }
}

@SymbolName("sdl_kni_SDL_AtomicCAS")
private external fun kni_SDL_AtomicCAS(a: NativePtr, oldval: Int, newval: Int): Int

fun SDL_AtomicSet(a: CValuesRef<SDL_atomic_t>?, v: Int): Int {
    return memScoped {
        val _a = a?.getPointer(memScope).rawValue
        val _v = v
        val res = kni_SDL_AtomicSet(_a, _v)
        res
    }
}

@SymbolName("sdl_kni_SDL_AtomicSet")
private external fun kni_SDL_AtomicSet(a: NativePtr, v: Int): Int

fun SDL_AtomicGet(a: CValuesRef<SDL_atomic_t>?): Int {
    return memScoped {
        val _a = a?.getPointer(memScope).rawValue
        val res = kni_SDL_AtomicGet(_a)
        res
    }
}

@SymbolName("sdl_kni_SDL_AtomicGet")
private external fun kni_SDL_AtomicGet(a: NativePtr): Int

fun SDL_AtomicAdd(a: CValuesRef<SDL_atomic_t>?, v: Int): Int {
    return memScoped {
        val _a = a?.getPointer(memScope).rawValue
        val _v = v
        val res = kni_SDL_AtomicAdd(_a, _v)
        res
    }
}

@SymbolName("sdl_kni_SDL_AtomicAdd")
private external fun kni_SDL_AtomicAdd(a: NativePtr, v: Int): Int

fun SDL_AtomicCASPtr(a: CValuesRef<COpaquePointerVar>?, oldval: COpaquePointer?, newval: COpaquePointer?): SDL_bool {
    return memScoped {
        val _a = a?.getPointer(memScope).rawValue
        val _oldval = oldval.rawValue
        val _newval = newval.rawValue
        val res = kni_SDL_AtomicCASPtr(_a, _oldval, _newval)
        res
    }
}

@SymbolName("sdl_kni_SDL_AtomicCASPtr")
private external fun kni_SDL_AtomicCASPtr(a: NativePtr, oldval: NativePtr, newval: NativePtr): Int

fun SDL_AtomicSetPtr(a: CValuesRef<COpaquePointerVar>?, v: COpaquePointer?): COpaquePointer? {
    return memScoped {
        val _a = a?.getPointer(memScope).rawValue
        val _v = v.rawValue
        val res = kni_SDL_AtomicSetPtr(_a, _v)
        interpretCPointer<COpaque>(res)
    }
}

@SymbolName("sdl_kni_SDL_AtomicSetPtr")
private external fun kni_SDL_AtomicSetPtr(a: NativePtr, v: NativePtr): NativePtr

fun SDL_AtomicGetPtr(a: CValuesRef<COpaquePointerVar>?): COpaquePointer? {
    return memScoped {
        val _a = a?.getPointer(memScope).rawValue
        val res = kni_SDL_AtomicGetPtr(_a)
        interpretCPointer<COpaque>(res)
    }
}

@SymbolName("sdl_kni_SDL_AtomicGetPtr")
private external fun kni_SDL_AtomicGetPtr(a: NativePtr): NativePtr

fun SDL_SetError(fmt: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_SDL_SetError(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(fmt), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("sdl_kni_SDL_SetError")
private external fun kni_SDL_SetError(): NativePtr

fun SDL_GetError(): CPointer<ByteVar>? {
    val res = kni_SDL_GetError()
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetError")
private external fun kni_SDL_GetError(): NativePtr

fun SDL_ClearError(): Unit {
    val res = kni_SDL_ClearError()
    return res
}

@SymbolName("sdl_kni_SDL_ClearError")
private external fun kni_SDL_ClearError(): Unit

fun SDL_Error(code: SDL_errorcode): Int {
    val _code = code.value
    val res = kni_SDL_Error(_code)
    return res
}

@SymbolName("sdl_kni_SDL_Error")
private external fun kni_SDL_Error(code: Int): Int

fun SDL_Swap16(x: Uint16): Uint16 {
    val _x = x
    val res = kni_SDL_Swap16(_x)
    return res
}

@SymbolName("sdl_kni_SDL_Swap16")
private external fun kni_SDL_Swap16(x: Short): Short

fun SDL_Swap32(x: Uint32): Uint32 {
    val _x = x
    val res = kni_SDL_Swap32(_x)
    return res
}

@SymbolName("sdl_kni_SDL_Swap32")
private external fun kni_SDL_Swap32(x: Int): Int

fun SDL_Swap64(x: Uint64): Uint64 {
    val _x = x
    val res = kni_SDL_Swap64(_x)
    return res
}

@SymbolName("sdl_kni_SDL_Swap64")
private external fun kni_SDL_Swap64(x: Long): Long

fun SDL_SwapFloat(x: Float): Float {
    val _x = x
    val res = kni_SDL_SwapFloat(_x)
    return res
}

@SymbolName("sdl_kni_SDL_SwapFloat")
private external fun kni_SDL_SwapFloat(x: Float): Float

fun SDL_CreateMutex(): CPointer<SDL_mutex>? {
    val res = kni_SDL_CreateMutex()
    return interpretCPointer<SDL_mutex>(res)
}

@SymbolName("sdl_kni_SDL_CreateMutex")
private external fun kni_SDL_CreateMutex(): NativePtr

fun SDL_LockMutex(mutex: CValuesRef<SDL_mutex>?): Int {
    return memScoped {
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_SDL_LockMutex(_mutex)
        res
    }
}

@SymbolName("sdl_kni_SDL_LockMutex")
private external fun kni_SDL_LockMutex(mutex: NativePtr): Int

fun SDL_TryLockMutex(mutex: CValuesRef<SDL_mutex>?): Int {
    return memScoped {
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_SDL_TryLockMutex(_mutex)
        res
    }
}

@SymbolName("sdl_kni_SDL_TryLockMutex")
private external fun kni_SDL_TryLockMutex(mutex: NativePtr): Int

fun SDL_UnlockMutex(mutex: CValuesRef<SDL_mutex>?): Int {
    return memScoped {
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_SDL_UnlockMutex(_mutex)
        res
    }
}

@SymbolName("sdl_kni_SDL_UnlockMutex")
private external fun kni_SDL_UnlockMutex(mutex: NativePtr): Int

fun SDL_DestroyMutex(mutex: CValuesRef<SDL_mutex>?): Unit {
    return memScoped {
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_SDL_DestroyMutex(_mutex)
        res
    }
}

@SymbolName("sdl_kni_SDL_DestroyMutex")
private external fun kni_SDL_DestroyMutex(mutex: NativePtr): Unit

fun SDL_CreateSemaphore(initial_value: Uint32): CPointer<SDL_sem>? {
    val _initial_value = initial_value
    val res = kni_SDL_CreateSemaphore(_initial_value)
    return interpretCPointer<SDL_sem>(res)
}

@SymbolName("sdl_kni_SDL_CreateSemaphore")
private external fun kni_SDL_CreateSemaphore(initial_value: Int): NativePtr

fun SDL_DestroySemaphore(sem: CValuesRef<SDL_sem>?): Unit {
    return memScoped {
        val _sem = sem?.getPointer(memScope).rawValue
        val res = kni_SDL_DestroySemaphore(_sem)
        res
    }
}

@SymbolName("sdl_kni_SDL_DestroySemaphore")
private external fun kni_SDL_DestroySemaphore(sem: NativePtr): Unit

fun SDL_SemWait(sem: CValuesRef<SDL_sem>?): Int {
    return memScoped {
        val _sem = sem?.getPointer(memScope).rawValue
        val res = kni_SDL_SemWait(_sem)
        res
    }
}

@SymbolName("sdl_kni_SDL_SemWait")
private external fun kni_SDL_SemWait(sem: NativePtr): Int

fun SDL_SemTryWait(sem: CValuesRef<SDL_sem>?): Int {
    return memScoped {
        val _sem = sem?.getPointer(memScope).rawValue
        val res = kni_SDL_SemTryWait(_sem)
        res
    }
}

@SymbolName("sdl_kni_SDL_SemTryWait")
private external fun kni_SDL_SemTryWait(sem: NativePtr): Int

fun SDL_SemWaitTimeout(sem: CValuesRef<SDL_sem>?, ms: Uint32): Int {
    return memScoped {
        val _sem = sem?.getPointer(memScope).rawValue
        val _ms = ms
        val res = kni_SDL_SemWaitTimeout(_sem, _ms)
        res
    }
}

@SymbolName("sdl_kni_SDL_SemWaitTimeout")
private external fun kni_SDL_SemWaitTimeout(sem: NativePtr, ms: Int): Int

fun SDL_SemPost(sem: CValuesRef<SDL_sem>?): Int {
    return memScoped {
        val _sem = sem?.getPointer(memScope).rawValue
        val res = kni_SDL_SemPost(_sem)
        res
    }
}

@SymbolName("sdl_kni_SDL_SemPost")
private external fun kni_SDL_SemPost(sem: NativePtr): Int

fun SDL_SemValue(sem: CValuesRef<SDL_sem>?): Uint32 {
    return memScoped {
        val _sem = sem?.getPointer(memScope).rawValue
        val res = kni_SDL_SemValue(_sem)
        res
    }
}

@SymbolName("sdl_kni_SDL_SemValue")
private external fun kni_SDL_SemValue(sem: NativePtr): Int

fun SDL_CreateCond(): CPointer<SDL_cond>? {
    val res = kni_SDL_CreateCond()
    return interpretCPointer<SDL_cond>(res)
}

@SymbolName("sdl_kni_SDL_CreateCond")
private external fun kni_SDL_CreateCond(): NativePtr

fun SDL_DestroyCond(cond: CValuesRef<SDL_cond>?): Unit {
    return memScoped {
        val _cond = cond?.getPointer(memScope).rawValue
        val res = kni_SDL_DestroyCond(_cond)
        res
    }
}

@SymbolName("sdl_kni_SDL_DestroyCond")
private external fun kni_SDL_DestroyCond(cond: NativePtr): Unit

fun SDL_CondSignal(cond: CValuesRef<SDL_cond>?): Int {
    return memScoped {
        val _cond = cond?.getPointer(memScope).rawValue
        val res = kni_SDL_CondSignal(_cond)
        res
    }
}

@SymbolName("sdl_kni_SDL_CondSignal")
private external fun kni_SDL_CondSignal(cond: NativePtr): Int

fun SDL_CondBroadcast(cond: CValuesRef<SDL_cond>?): Int {
    return memScoped {
        val _cond = cond?.getPointer(memScope).rawValue
        val res = kni_SDL_CondBroadcast(_cond)
        res
    }
}

@SymbolName("sdl_kni_SDL_CondBroadcast")
private external fun kni_SDL_CondBroadcast(cond: NativePtr): Int

fun SDL_CondWait(cond: CValuesRef<SDL_cond>?, mutex: CValuesRef<SDL_mutex>?): Int {
    return memScoped {
        val _cond = cond?.getPointer(memScope).rawValue
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_SDL_CondWait(_cond, _mutex)
        res
    }
}

@SymbolName("sdl_kni_SDL_CondWait")
private external fun kni_SDL_CondWait(cond: NativePtr, mutex: NativePtr): Int

fun SDL_CondWaitTimeout(cond: CValuesRef<SDL_cond>?, mutex: CValuesRef<SDL_mutex>?, ms: Uint32): Int {
    return memScoped {
        val _cond = cond?.getPointer(memScope).rawValue
        val _mutex = mutex?.getPointer(memScope).rawValue
        val _ms = ms
        val res = kni_SDL_CondWaitTimeout(_cond, _mutex, _ms)
        res
    }
}

@SymbolName("sdl_kni_SDL_CondWaitTimeout")
private external fun kni_SDL_CondWaitTimeout(cond: NativePtr, mutex: NativePtr, ms: Int): Int

fun SDL_GetThreadName(thread: CValuesRef<SDL_Thread>?): CPointer<ByteVar>? {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_SDL_GetThreadName(_thread)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetThreadName")
private external fun kni_SDL_GetThreadName(thread: NativePtr): NativePtr

fun SDL_ThreadID(): SDL_threadID {
    val res = kni_SDL_ThreadID()
    return res
}

@SymbolName("sdl_kni_SDL_ThreadID")
private external fun kni_SDL_ThreadID(): Int

fun SDL_GetThreadID(thread: CValuesRef<SDL_Thread>?): SDL_threadID {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_SDL_GetThreadID(_thread)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetThreadID")
private external fun kni_SDL_GetThreadID(thread: NativePtr): Int

fun SDL_SetThreadPriority(priority: SDL_ThreadPriority): Int {
    val _priority = priority.value
    val res = kni_SDL_SetThreadPriority(_priority)
    return res
}

@SymbolName("sdl_kni_SDL_SetThreadPriority")
private external fun kni_SDL_SetThreadPriority(priority: Int): Int

fun SDL_WaitThread(thread: CValuesRef<SDL_Thread>?, status: CValuesRef<IntVar>?): Unit {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val _status = status?.getPointer(memScope).rawValue
        val res = kni_SDL_WaitThread(_thread, _status)
        res
    }
}

@SymbolName("sdl_kni_SDL_WaitThread")
private external fun kni_SDL_WaitThread(thread: NativePtr, status: NativePtr): Unit

fun SDL_DetachThread(thread: CValuesRef<SDL_Thread>?): Unit {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_SDL_DetachThread(_thread)
        res
    }
}

@SymbolName("sdl_kni_SDL_DetachThread")
private external fun kni_SDL_DetachThread(thread: NativePtr): Unit

fun SDL_TLSCreate(): SDL_TLSID {
    val res = kni_SDL_TLSCreate()
    return res
}

@SymbolName("sdl_kni_SDL_TLSCreate")
private external fun kni_SDL_TLSCreate(): Int

fun SDL_TLSGet(id: SDL_TLSID): COpaquePointer? {
    val _id = id
    val res = kni_SDL_TLSGet(_id)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_SDL_TLSGet")
private external fun kni_SDL_TLSGet(id: Int): NativePtr

fun SDL_TLSSet(id: SDL_TLSID, value: COpaquePointer?, destructor: CPointer<CFunction<(COpaquePointer?) -> Unit>>?): Int {
    val _id = id
    val _value = value.rawValue
    val _destructor = destructor.rawValue
    val res = kni_SDL_TLSSet(_id, _value, _destructor)
    return res
}

@SymbolName("sdl_kni_SDL_TLSSet")
private external fun kni_SDL_TLSSet(id: Int, value: NativePtr, destructor: NativePtr): Int

fun SDL_RWFromFile(file: String?, mode: String?): CPointer<SDL_RWops>? {
    return memScoped {
        val _file = file?.cstr?.getPointer(memScope).rawValue
        val _mode = mode?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_RWFromFile(_file, _mode)
        interpretCPointer<SDL_RWops>(res)
    }
}

@SymbolName("sdl_kni_SDL_RWFromFile")
private external fun kni_SDL_RWFromFile(file: NativePtr, mode: NativePtr): NativePtr

fun SDL_RWFromFP(fp: COpaquePointer?, autoclose: SDL_bool): CPointer<SDL_RWops>? {
    val _fp = fp.rawValue
    val _autoclose = autoclose
    val res = kni_SDL_RWFromFP(_fp, _autoclose)
    return interpretCPointer<SDL_RWops>(res)
}

@SymbolName("sdl_kni_SDL_RWFromFP")
private external fun kni_SDL_RWFromFP(fp: NativePtr, autoclose: Int): NativePtr

fun SDL_RWFromMem(mem: COpaquePointer?, size: Int): CPointer<SDL_RWops>? {
    val _mem = mem.rawValue
    val _size = size
    val res = kni_SDL_RWFromMem(_mem, _size)
    return interpretCPointer<SDL_RWops>(res)
}

@SymbolName("sdl_kni_SDL_RWFromMem")
private external fun kni_SDL_RWFromMem(mem: NativePtr, size: Int): NativePtr

fun SDL_RWFromConstMem(mem: COpaquePointer?, size: Int): CPointer<SDL_RWops>? {
    val _mem = mem.rawValue
    val _size = size
    val res = kni_SDL_RWFromConstMem(_mem, _size)
    return interpretCPointer<SDL_RWops>(res)
}

@SymbolName("sdl_kni_SDL_RWFromConstMem")
private external fun kni_SDL_RWFromConstMem(mem: NativePtr, size: Int): NativePtr

fun SDL_AllocRW(): CPointer<SDL_RWops>? {
    val res = kni_SDL_AllocRW()
    return interpretCPointer<SDL_RWops>(res)
}

@SymbolName("sdl_kni_SDL_AllocRW")
private external fun kni_SDL_AllocRW(): NativePtr

fun SDL_FreeRW(area: CValuesRef<SDL_RWops>?): Unit {
    return memScoped {
        val _area = area?.getPointer(memScope).rawValue
        val res = kni_SDL_FreeRW(_area)
        res
    }
}

@SymbolName("sdl_kni_SDL_FreeRW")
private external fun kni_SDL_FreeRW(area: NativePtr): Unit

fun SDL_LoadFile_RW(src: CValuesRef<SDL_RWops>?, datasize: CValuesRef<size_tVar>?, freesrc: Int): COpaquePointer? {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val _datasize = datasize?.getPointer(memScope).rawValue
        val _freesrc = freesrc
        val res = kni_SDL_LoadFile_RW(_src, _datasize, _freesrc)
        interpretCPointer<COpaque>(res)
    }
}

@SymbolName("sdl_kni_SDL_LoadFile_RW")
private external fun kni_SDL_LoadFile_RW(src: NativePtr, datasize: NativePtr, freesrc: Int): NativePtr

fun SDL_ReadU8(src: CValuesRef<SDL_RWops>?): Uint8 {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val res = kni_SDL_ReadU8(_src)
        res
    }
}

@SymbolName("sdl_kni_SDL_ReadU8")
private external fun kni_SDL_ReadU8(src: NativePtr): Byte

fun SDL_ReadLE16(src: CValuesRef<SDL_RWops>?): Uint16 {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val res = kni_SDL_ReadLE16(_src)
        res
    }
}

@SymbolName("sdl_kni_SDL_ReadLE16")
private external fun kni_SDL_ReadLE16(src: NativePtr): Short

fun SDL_ReadBE16(src: CValuesRef<SDL_RWops>?): Uint16 {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val res = kni_SDL_ReadBE16(_src)
        res
    }
}

@SymbolName("sdl_kni_SDL_ReadBE16")
private external fun kni_SDL_ReadBE16(src: NativePtr): Short

fun SDL_ReadLE32(src: CValuesRef<SDL_RWops>?): Uint32 {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val res = kni_SDL_ReadLE32(_src)
        res
    }
}

@SymbolName("sdl_kni_SDL_ReadLE32")
private external fun kni_SDL_ReadLE32(src: NativePtr): Int

fun SDL_ReadBE32(src: CValuesRef<SDL_RWops>?): Uint32 {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val res = kni_SDL_ReadBE32(_src)
        res
    }
}

@SymbolName("sdl_kni_SDL_ReadBE32")
private external fun kni_SDL_ReadBE32(src: NativePtr): Int

fun SDL_ReadLE64(src: CValuesRef<SDL_RWops>?): Uint64 {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val res = kni_SDL_ReadLE64(_src)
        res
    }
}

@SymbolName("sdl_kni_SDL_ReadLE64")
private external fun kni_SDL_ReadLE64(src: NativePtr): Long

fun SDL_ReadBE64(src: CValuesRef<SDL_RWops>?): Uint64 {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val res = kni_SDL_ReadBE64(_src)
        res
    }
}

@SymbolName("sdl_kni_SDL_ReadBE64")
private external fun kni_SDL_ReadBE64(src: NativePtr): Long

fun SDL_WriteU8(dst: CValuesRef<SDL_RWops>?, value: Uint8): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _value = value
        val res = kni_SDL_WriteU8(_dst, _value)
        res
    }
}

@SymbolName("sdl_kni_SDL_WriteU8")
private external fun kni_SDL_WriteU8(dst: NativePtr, value: Byte): Long

fun SDL_WriteLE16(dst: CValuesRef<SDL_RWops>?, value: Uint16): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _value = value
        val res = kni_SDL_WriteLE16(_dst, _value)
        res
    }
}

@SymbolName("sdl_kni_SDL_WriteLE16")
private external fun kni_SDL_WriteLE16(dst: NativePtr, value: Short): Long

fun SDL_WriteBE16(dst: CValuesRef<SDL_RWops>?, value: Uint16): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _value = value
        val res = kni_SDL_WriteBE16(_dst, _value)
        res
    }
}

@SymbolName("sdl_kni_SDL_WriteBE16")
private external fun kni_SDL_WriteBE16(dst: NativePtr, value: Short): Long

fun SDL_WriteLE32(dst: CValuesRef<SDL_RWops>?, value: Uint32): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _value = value
        val res = kni_SDL_WriteLE32(_dst, _value)
        res
    }
}

@SymbolName("sdl_kni_SDL_WriteLE32")
private external fun kni_SDL_WriteLE32(dst: NativePtr, value: Int): Long

fun SDL_WriteBE32(dst: CValuesRef<SDL_RWops>?, value: Uint32): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _value = value
        val res = kni_SDL_WriteBE32(_dst, _value)
        res
    }
}

@SymbolName("sdl_kni_SDL_WriteBE32")
private external fun kni_SDL_WriteBE32(dst: NativePtr, value: Int): Long

fun SDL_WriteLE64(dst: CValuesRef<SDL_RWops>?, value: Uint64): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _value = value
        val res = kni_SDL_WriteLE64(_dst, _value)
        res
    }
}

@SymbolName("sdl_kni_SDL_WriteLE64")
private external fun kni_SDL_WriteLE64(dst: NativePtr, value: Long): Long

fun SDL_WriteBE64(dst: CValuesRef<SDL_RWops>?, value: Uint64): size_t {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _value = value
        val res = kni_SDL_WriteBE64(_dst, _value)
        res
    }
}

@SymbolName("sdl_kni_SDL_WriteBE64")
private external fun kni_SDL_WriteBE64(dst: NativePtr, value: Long): Long

fun SDL_GetNumAudioDrivers(): Int {
    val res = kni_SDL_GetNumAudioDrivers()
    return res
}

@SymbolName("sdl_kni_SDL_GetNumAudioDrivers")
private external fun kni_SDL_GetNumAudioDrivers(): Int

fun SDL_GetAudioDriver(index: Int): CPointer<ByteVar>? {
    val _index = index
    val res = kni_SDL_GetAudioDriver(_index)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetAudioDriver")
private external fun kni_SDL_GetAudioDriver(index: Int): NativePtr

fun SDL_AudioInit(driver_name: String?): Int {
    return memScoped {
        val _driver_name = driver_name?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_AudioInit(_driver_name)
        res
    }
}

@SymbolName("sdl_kni_SDL_AudioInit")
private external fun kni_SDL_AudioInit(driver_name: NativePtr): Int

fun SDL_AudioQuit(): Unit {
    val res = kni_SDL_AudioQuit()
    return res
}

@SymbolName("sdl_kni_SDL_AudioQuit")
private external fun kni_SDL_AudioQuit(): Unit

fun SDL_GetCurrentAudioDriver(): CPointer<ByteVar>? {
    val res = kni_SDL_GetCurrentAudioDriver()
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetCurrentAudioDriver")
private external fun kni_SDL_GetCurrentAudioDriver(): NativePtr

fun SDL_OpenAudio(desired: CValuesRef<SDL_AudioSpec>?, obtained: CValuesRef<SDL_AudioSpec>?): Int {
    return memScoped {
        val _desired = desired?.getPointer(memScope).rawValue
        val _obtained = obtained?.getPointer(memScope).rawValue
        val res = kni_SDL_OpenAudio(_desired, _obtained)
        res
    }
}

@SymbolName("sdl_kni_SDL_OpenAudio")
private external fun kni_SDL_OpenAudio(desired: NativePtr, obtained: NativePtr): Int

fun SDL_GetNumAudioDevices(iscapture: Int): Int {
    val _iscapture = iscapture
    val res = kni_SDL_GetNumAudioDevices(_iscapture)
    return res
}

@SymbolName("sdl_kni_SDL_GetNumAudioDevices")
private external fun kni_SDL_GetNumAudioDevices(iscapture: Int): Int

fun SDL_GetAudioDeviceName(index: Int, iscapture: Int): CPointer<ByteVar>? {
    val _index = index
    val _iscapture = iscapture
    val res = kni_SDL_GetAudioDeviceName(_index, _iscapture)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetAudioDeviceName")
private external fun kni_SDL_GetAudioDeviceName(index: Int, iscapture: Int): NativePtr

fun SDL_OpenAudioDevice(device: String?, iscapture: Int, desired: CValuesRef<SDL_AudioSpec>?, obtained: CValuesRef<SDL_AudioSpec>?, allowed_changes: Int): SDL_AudioDeviceID {
    return memScoped {
        val _device = device?.cstr?.getPointer(memScope).rawValue
        val _iscapture = iscapture
        val _desired = desired?.getPointer(memScope).rawValue
        val _obtained = obtained?.getPointer(memScope).rawValue
        val _allowed_changes = allowed_changes
        val res = kni_SDL_OpenAudioDevice(_device, _iscapture, _desired, _obtained, _allowed_changes)
        res
    }
}

@SymbolName("sdl_kni_SDL_OpenAudioDevice")
private external fun kni_SDL_OpenAudioDevice(device: NativePtr, iscapture: Int, desired: NativePtr, obtained: NativePtr, allowed_changes: Int): Int

fun SDL_GetAudioStatus(): SDL_AudioStatus {
    val res = kni_SDL_GetAudioStatus()
    return res
}

@SymbolName("sdl_kni_SDL_GetAudioStatus")
private external fun kni_SDL_GetAudioStatus(): Int

fun SDL_GetAudioDeviceStatus(dev: SDL_AudioDeviceID): SDL_AudioStatus {
    val _dev = dev
    val res = kni_SDL_GetAudioDeviceStatus(_dev)
    return res
}

@SymbolName("sdl_kni_SDL_GetAudioDeviceStatus")
private external fun kni_SDL_GetAudioDeviceStatus(dev: Int): Int

fun SDL_PauseAudio(pause_on: Int): Unit {
    val _pause_on = pause_on
    val res = kni_SDL_PauseAudio(_pause_on)
    return res
}

@SymbolName("sdl_kni_SDL_PauseAudio")
private external fun kni_SDL_PauseAudio(pause_on: Int): Unit

fun SDL_PauseAudioDevice(dev: SDL_AudioDeviceID, pause_on: Int): Unit {
    val _dev = dev
    val _pause_on = pause_on
    val res = kni_SDL_PauseAudioDevice(_dev, _pause_on)
    return res
}

@SymbolName("sdl_kni_SDL_PauseAudioDevice")
private external fun kni_SDL_PauseAudioDevice(dev: Int, pause_on: Int): Unit

fun SDL_LoadWAV_RW(src: CValuesRef<SDL_RWops>?, freesrc: Int, spec: CValuesRef<SDL_AudioSpec>?, audio_buf: CValuesRef<CPointerVar<Uint8Var>>?, audio_len: CValuesRef<Uint32Var>?): CPointer<SDL_AudioSpec>? {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val _freesrc = freesrc
        val _spec = spec?.getPointer(memScope).rawValue
        val _audio_buf = audio_buf?.getPointer(memScope).rawValue
        val _audio_len = audio_len?.getPointer(memScope).rawValue
        val res = kni_SDL_LoadWAV_RW(_src, _freesrc, _spec, _audio_buf, _audio_len)
        interpretCPointer<SDL_AudioSpec>(res)
    }
}

@SymbolName("sdl_kni_SDL_LoadWAV_RW")
private external fun kni_SDL_LoadWAV_RW(src: NativePtr, freesrc: Int, spec: NativePtr, audio_buf: NativePtr, audio_len: NativePtr): NativePtr

fun SDL_FreeWAV(audio_buf: CValuesRef<Uint8Var>?): Unit {
    return memScoped {
        val _audio_buf = audio_buf?.getPointer(memScope).rawValue
        val res = kni_SDL_FreeWAV(_audio_buf)
        res
    }
}

@SymbolName("sdl_kni_SDL_FreeWAV")
private external fun kni_SDL_FreeWAV(audio_buf: NativePtr): Unit

fun SDL_BuildAudioCVT(cvt: CValuesRef<SDL_AudioCVT>?, src_format: SDL_AudioFormat, src_channels: Uint8, src_rate: Int, dst_format: SDL_AudioFormat, dst_channels: Uint8, dst_rate: Int): Int {
    return memScoped {
        val _cvt = cvt?.getPointer(memScope).rawValue
        val _src_format = src_format
        val _src_channels = src_channels
        val _src_rate = src_rate
        val _dst_format = dst_format
        val _dst_channels = dst_channels
        val _dst_rate = dst_rate
        val res = kni_SDL_BuildAudioCVT(_cvt, _src_format, _src_channels, _src_rate, _dst_format, _dst_channels, _dst_rate)
        res
    }
}

@SymbolName("sdl_kni_SDL_BuildAudioCVT")
private external fun kni_SDL_BuildAudioCVT(cvt: NativePtr, src_format: Short, src_channels: Byte, src_rate: Int, dst_format: Short, dst_channels: Byte, dst_rate: Int): Int

fun SDL_ConvertAudio(cvt: CValuesRef<SDL_AudioCVT>?): Int {
    return memScoped {
        val _cvt = cvt?.getPointer(memScope).rawValue
        val res = kni_SDL_ConvertAudio(_cvt)
        res
    }
}

@SymbolName("sdl_kni_SDL_ConvertAudio")
private external fun kni_SDL_ConvertAudio(cvt: NativePtr): Int

fun SDL_MixAudio(dst: CValuesRef<Uint8Var>?, src: CValuesRef<Uint8Var>?, len: Uint32, volume: Int): Unit {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _src = src?.getPointer(memScope).rawValue
        val _len = len
        val _volume = volume
        val res = kni_SDL_MixAudio(_dst, _src, _len, _volume)
        res
    }
}

@SymbolName("sdl_kni_SDL_MixAudio")
private external fun kni_SDL_MixAudio(dst: NativePtr, src: NativePtr, len: Int, volume: Int): Unit

fun SDL_MixAudioFormat(dst: CValuesRef<Uint8Var>?, src: CValuesRef<Uint8Var>?, format: SDL_AudioFormat, len: Uint32, volume: Int): Unit {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _src = src?.getPointer(memScope).rawValue
        val _format = format
        val _len = len
        val _volume = volume
        val res = kni_SDL_MixAudioFormat(_dst, _src, _format, _len, _volume)
        res
    }
}

@SymbolName("sdl_kni_SDL_MixAudioFormat")
private external fun kni_SDL_MixAudioFormat(dst: NativePtr, src: NativePtr, format: Short, len: Int, volume: Int): Unit

fun SDL_QueueAudio(dev: SDL_AudioDeviceID, data: COpaquePointer?, len: Uint32): Int {
    val _dev = dev
    val _data = data.rawValue
    val _len = len
    val res = kni_SDL_QueueAudio(_dev, _data, _len)
    return res
}

@SymbolName("sdl_kni_SDL_QueueAudio")
private external fun kni_SDL_QueueAudio(dev: Int, data: NativePtr, len: Int): Int

fun SDL_DequeueAudio(dev: SDL_AudioDeviceID, data: COpaquePointer?, len: Uint32): Uint32 {
    val _dev = dev
    val _data = data.rawValue
    val _len = len
    val res = kni_SDL_DequeueAudio(_dev, _data, _len)
    return res
}

@SymbolName("sdl_kni_SDL_DequeueAudio")
private external fun kni_SDL_DequeueAudio(dev: Int, data: NativePtr, len: Int): Int

fun SDL_GetQueuedAudioSize(dev: SDL_AudioDeviceID): Uint32 {
    val _dev = dev
    val res = kni_SDL_GetQueuedAudioSize(_dev)
    return res
}

@SymbolName("sdl_kni_SDL_GetQueuedAudioSize")
private external fun kni_SDL_GetQueuedAudioSize(dev: Int): Int

fun SDL_ClearQueuedAudio(dev: SDL_AudioDeviceID): Unit {
    val _dev = dev
    val res = kni_SDL_ClearQueuedAudio(_dev)
    return res
}

@SymbolName("sdl_kni_SDL_ClearQueuedAudio")
private external fun kni_SDL_ClearQueuedAudio(dev: Int): Unit

fun SDL_LockAudio(): Unit {
    val res = kni_SDL_LockAudio()
    return res
}

@SymbolName("sdl_kni_SDL_LockAudio")
private external fun kni_SDL_LockAudio(): Unit

fun SDL_LockAudioDevice(dev: SDL_AudioDeviceID): Unit {
    val _dev = dev
    val res = kni_SDL_LockAudioDevice(_dev)
    return res
}

@SymbolName("sdl_kni_SDL_LockAudioDevice")
private external fun kni_SDL_LockAudioDevice(dev: Int): Unit

fun SDL_UnlockAudio(): Unit {
    val res = kni_SDL_UnlockAudio()
    return res
}

@SymbolName("sdl_kni_SDL_UnlockAudio")
private external fun kni_SDL_UnlockAudio(): Unit

fun SDL_UnlockAudioDevice(dev: SDL_AudioDeviceID): Unit {
    val _dev = dev
    val res = kni_SDL_UnlockAudioDevice(_dev)
    return res
}

@SymbolName("sdl_kni_SDL_UnlockAudioDevice")
private external fun kni_SDL_UnlockAudioDevice(dev: Int): Unit

fun SDL_CloseAudio(): Unit {
    val res = kni_SDL_CloseAudio()
    return res
}

@SymbolName("sdl_kni_SDL_CloseAudio")
private external fun kni_SDL_CloseAudio(): Unit

fun SDL_CloseAudioDevice(dev: SDL_AudioDeviceID): Unit {
    val _dev = dev
    val res = kni_SDL_CloseAudioDevice(_dev)
    return res
}

@SymbolName("sdl_kni_SDL_CloseAudioDevice")
private external fun kni_SDL_CloseAudioDevice(dev: Int): Unit

fun SDL_SetClipboardText(text: String?): Int {
    return memScoped {
        val _text = text?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_SetClipboardText(_text)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetClipboardText")
private external fun kni_SDL_SetClipboardText(text: NativePtr): Int

fun SDL_GetClipboardText(): CPointer<ByteVar>? {
    val res = kni_SDL_GetClipboardText()
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetClipboardText")
private external fun kni_SDL_GetClipboardText(): NativePtr

fun SDL_HasClipboardText(): SDL_bool {
    val res = kni_SDL_HasClipboardText()
    return res
}

@SymbolName("sdl_kni_SDL_HasClipboardText")
private external fun kni_SDL_HasClipboardText(): Int

fun _set_purecall_handler(_Handler: _purecall_handler?): _purecall_handler? {
    val __Handler = _Handler.rawValue
    val res = kni__set_purecall_handler(__Handler)
    return interpretCPointer<CFunction<() -> Unit>>(res)
}

@SymbolName("sdl_kni__set_purecall_handler")
private external fun kni__set_purecall_handler(_Handler: NativePtr): NativePtr

fun _get_purecall_handler(): _purecall_handler? {
    val res = kni__get_purecall_handler()
    return interpretCPointer<CFunction<() -> Unit>>(res)
}

@SymbolName("sdl_kni__get_purecall_handler")
private external fun kni__get_purecall_handler(): NativePtr

fun _set_invalid_parameter_handler(_Handler: _invalid_parameter_handler?): _invalid_parameter_handler? {
    val __Handler = _Handler.rawValue
    val res = kni__set_invalid_parameter_handler(__Handler)
    return interpretCPointer<CFunction<(CPointer<wchar_tVar>?, CPointer<wchar_tVar>?, CPointer<wchar_tVar>?, Int, uintptr_t) -> Unit>>(res)
}

@SymbolName("sdl_kni__set_invalid_parameter_handler")
private external fun kni__set_invalid_parameter_handler(_Handler: NativePtr): NativePtr

fun _get_invalid_parameter_handler(): _invalid_parameter_handler? {
    val res = kni__get_invalid_parameter_handler()
    return interpretCPointer<CFunction<(CPointer<wchar_tVar>?, CPointer<wchar_tVar>?, CPointer<wchar_tVar>?, Int, uintptr_t) -> Unit>>(res)
}

@SymbolName("sdl_kni__get_invalid_parameter_handler")
private external fun kni__get_invalid_parameter_handler(): NativePtr

fun _errno(): CPointer<IntVar>? {
    val res = kni__errno()
    return interpretCPointer<IntVar>(res)
}

@SymbolName("sdl_kni__errno")
private external fun kni__errno(): NativePtr

fun _set_errno(_Value: Int): errno_t {
    val __Value = _Value
    val res = kni__set_errno(__Value)
    return res
}

@SymbolName("sdl_kni__set_errno")
private external fun kni__set_errno(_Value: Int): Int

fun _get_errno(_Value: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __Value = _Value?.getPointer(memScope).rawValue
        val res = kni__get_errno(__Value)
        res
    }
}

@SymbolName("sdl_kni__get_errno")
private external fun kni__get_errno(_Value: NativePtr): Int

fun __doserrno(): CPointer<IntVar>? {
    val res = kni___doserrno()
    return interpretCPointer<IntVar>(res)
}

@SymbolName("sdl_kni___doserrno")
private external fun kni___doserrno(): NativePtr

fun _set_doserrno(_Value: Int): errno_t {
    val __Value = _Value
    val res = kni__set_doserrno(__Value)
    return res
}

@SymbolName("sdl_kni__set_doserrno")
private external fun kni__set_doserrno(_Value: Int): Int

fun _get_doserrno(_Value: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __Value = _Value?.getPointer(memScope).rawValue
        val res = kni__get_doserrno(__Value)
        res
    }
}

@SymbolName("sdl_kni__get_doserrno")
private external fun kni__get_doserrno(_Value: NativePtr): Int

fun _get_pgmptr(_Value: CValuesRef<CPointerVar<ByteVar>>?): errno_t {
    return memScoped {
        val __Value = _Value?.getPointer(memScope).rawValue
        val res = kni__get_pgmptr(__Value)
        res
    }
}

@SymbolName("sdl_kni__get_pgmptr")
private external fun kni__get_pgmptr(_Value: NativePtr): Int

fun _get_wpgmptr(_Value: CValuesRef<CPointerVar<wchar_tVar>>?): errno_t {
    return memScoped {
        val __Value = _Value?.getPointer(memScope).rawValue
        val res = kni__get_wpgmptr(__Value)
        res
    }
}

@SymbolName("sdl_kni__get_wpgmptr")
private external fun kni__get_wpgmptr(_Value: NativePtr): Int

fun _set_fmode(_Mode: Int): errno_t {
    val __Mode = _Mode
    val res = kni__set_fmode(__Mode)
    return res
}

@SymbolName("sdl_kni__set_fmode")
private external fun kni__set_fmode(_Mode: Int): Int

fun _get_fmode(_PMode: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __PMode = _PMode?.getPointer(memScope).rawValue
        val res = kni__get_fmode(__PMode)
        res
    }
}

@SymbolName("sdl_kni__get_fmode")
private external fun kni__get_fmode(_PMode: NativePtr): Int

fun _get_osplatform(_Value: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __Value = _Value?.getPointer(memScope).rawValue
        val res = kni__get_osplatform(__Value)
        res
    }
}

@SymbolName("sdl_kni__get_osplatform")
private external fun kni__get_osplatform(_Value: NativePtr): Int

fun _get_osver(_Value: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __Value = _Value?.getPointer(memScope).rawValue
        val res = kni__get_osver(__Value)
        res
    }
}

@SymbolName("sdl_kni__get_osver")
private external fun kni__get_osver(_Value: NativePtr): Int

fun _get_winver(_Value: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __Value = _Value?.getPointer(memScope).rawValue
        val res = kni__get_winver(__Value)
        res
    }
}

@SymbolName("sdl_kni__get_winver")
private external fun kni__get_winver(_Value: NativePtr): Int

fun _get_winmajor(_Value: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __Value = _Value?.getPointer(memScope).rawValue
        val res = kni__get_winmajor(__Value)
        res
    }
}

@SymbolName("sdl_kni__get_winmajor")
private external fun kni__get_winmajor(_Value: NativePtr): Int

fun _get_winminor(_Value: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __Value = _Value?.getPointer(memScope).rawValue
        val res = kni__get_winminor(__Value)
        res
    }
}

@SymbolName("sdl_kni__get_winminor")
private external fun kni__get_winminor(_Value: NativePtr): Int

fun _set_abort_behavior(_Flags: Int, _Mask: Int): Int {
    val __Flags = _Flags
    val __Mask = _Mask
    val res = kni__set_abort_behavior(__Flags, __Mask)
    return res
}

@SymbolName("sdl_kni__set_abort_behavior")
private external fun kni__set_abort_behavior(_Flags: Int, _Mask: Int): Int

fun abs(_X: Int): Int {
    val __X = _X
    val res = kni_abs(__X)
    return res
}

@SymbolName("sdl_kni_abs")
private external fun kni_abs(_X: Int): Int

fun labs(_X: Int): Int {
    val __X = _X
    val res = kni_labs(__X)
    return res
}

@SymbolName("sdl_kni_labs")
private external fun kni_labs(_X: Int): Int

fun _abs64(x: Long): Long {
    val _x = x
    val res = kni__abs64(_x)
    return res
}

@SymbolName("sdl_kni__abs64")
private external fun kni__abs64(x: Long): Long

fun atexit(arg0: CPointer<CFunction<() -> Unit>>?): Int {
    val _arg0 = arg0.rawValue
    val res = kni_atexit(_arg0)
    return res
}

@SymbolName("sdl_kni_atexit")
private external fun kni_atexit(arg0: NativePtr): Int

fun atof(_String: String?): Double {
    return memScoped {
        val __String = _String?.cstr?.getPointer(memScope).rawValue
        val res = kni_atof(__String)
        res
    }
}

@SymbolName("sdl_kni_atof")
private external fun kni_atof(_String: NativePtr): Double

fun _atof_l(_String: String?, _Locale: _locale_t?): Double {
    return memScoped {
        val __String = _String?.cstr?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__atof_l(__String, __Locale)
        res
    }
}

@SymbolName("sdl_kni__atof_l")
private external fun kni__atof_l(_String: NativePtr, _Locale: NativePtr): Double

fun atoi(_Str: String?): Int {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val res = kni_atoi(__Str)
        res
    }
}

@SymbolName("sdl_kni_atoi")
private external fun kni_atoi(_Str: NativePtr): Int

fun _atoi_l(_Str: String?, _Locale: _locale_t?): Int {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__atoi_l(__Str, __Locale)
        res
    }
}

@SymbolName("sdl_kni__atoi_l")
private external fun kni__atoi_l(_Str: NativePtr, _Locale: NativePtr): Int

fun atol(_Str: String?): Int {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val res = kni_atol(__Str)
        res
    }
}

@SymbolName("sdl_kni_atol")
private external fun kni_atol(_Str: NativePtr): Int

fun _atol_l(_Str: String?, _Locale: _locale_t?): Int {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__atol_l(__Str, __Locale)
        res
    }
}

@SymbolName("sdl_kni__atol_l")
private external fun kni__atol_l(_Str: NativePtr, _Locale: NativePtr): Int

fun bsearch(_Key: COpaquePointer?, _Base: COpaquePointer?, _NumOfElements: size_t, _SizeOfElements: size_t, _PtFuncCompare: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Int>>?): COpaquePointer? {
    val __Key = _Key.rawValue
    val __Base = _Base.rawValue
    val __NumOfElements = _NumOfElements
    val __SizeOfElements = _SizeOfElements
    val __PtFuncCompare = _PtFuncCompare.rawValue
    val res = kni_bsearch(__Key, __Base, __NumOfElements, __SizeOfElements, __PtFuncCompare)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_bsearch")
private external fun kni_bsearch(_Key: NativePtr, _Base: NativePtr, _NumOfElements: Long, _SizeOfElements: Long, _PtFuncCompare: NativePtr): NativePtr

fun qsort(_Base: COpaquePointer?, _NumOfElements: size_t, _SizeOfElements: size_t, _PtFuncCompare: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Int>>?): Unit {
    val __Base = _Base.rawValue
    val __NumOfElements = _NumOfElements
    val __SizeOfElements = _SizeOfElements
    val __PtFuncCompare = _PtFuncCompare.rawValue
    val res = kni_qsort(__Base, __NumOfElements, __SizeOfElements, __PtFuncCompare)
    return res
}

@SymbolName("sdl_kni_qsort")
private external fun kni_qsort(_Base: NativePtr, _NumOfElements: Long, _SizeOfElements: Long, _PtFuncCompare: NativePtr): Unit

fun _byteswap_ushort(_Short: Short): Short {
    val __Short = _Short
    val res = kni__byteswap_ushort(__Short)
    return res
}

@SymbolName("sdl_kni__byteswap_ushort")
private external fun kni__byteswap_ushort(_Short: Short): Short

fun _byteswap_ulong(_Long: Int): Int {
    val __Long = _Long
    val res = kni__byteswap_ulong(__Long)
    return res
}

@SymbolName("sdl_kni__byteswap_ulong")
private external fun kni__byteswap_ulong(_Long: Int): Int

fun _byteswap_uint64(_Int64: Long): Long {
    val __Int64 = _Int64
    val res = kni__byteswap_uint64(__Int64)
    return res
}

@SymbolName("sdl_kni__byteswap_uint64")
private external fun kni__byteswap_uint64(_Int64: Long): Long

fun div(_Numerator: Int, _Denominator: Int): CValue<div_t> {
    return memScoped {
        val __Numerator = _Numerator
        val __Denominator = _Denominator
        val res = kni_div(__Numerator, __Denominator, alloc<div_t>().rawPtr)
        interpretPointed<div_t>(res).readValue()
    }
}

@SymbolName("sdl_kni_div")
private external fun kni_div(_Numerator: Int, _Denominator: Int, retValPlacement: NativePtr): NativePtr

fun getenv(_VarName: String?): CPointer<ByteVar>? {
    return memScoped {
        val __VarName = _VarName?.cstr?.getPointer(memScope).rawValue
        val res = kni_getenv(__VarName)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_getenv")
private external fun kni_getenv(_VarName: NativePtr): NativePtr

fun _itoa(_Value: Int, _Dest: CValuesRef<ByteVar>?, _Radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val __Value = _Value
        val __Dest = _Dest?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__itoa(__Value, __Dest, __Radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__itoa")
private external fun kni__itoa(_Value: Int, _Dest: NativePtr, _Radix: Int): NativePtr

fun _i64toa(_Val: Long, _DstBuf: CValuesRef<ByteVar>?, _Radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __DstBuf = _DstBuf?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__i64toa(__Val, __DstBuf, __Radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__i64toa")
private external fun kni__i64toa(_Val: Long, _DstBuf: NativePtr, _Radix: Int): NativePtr

fun _ui64toa(_Val: Long, _DstBuf: CValuesRef<ByteVar>?, _Radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __DstBuf = _DstBuf?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__ui64toa(__Val, __DstBuf, __Radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__ui64toa")
private external fun kni__ui64toa(_Val: Long, _DstBuf: NativePtr, _Radix: Int): NativePtr

fun _atoi64(_String: String?): Long {
    return memScoped {
        val __String = _String?.cstr?.getPointer(memScope).rawValue
        val res = kni__atoi64(__String)
        res
    }
}

@SymbolName("sdl_kni__atoi64")
private external fun kni__atoi64(_String: NativePtr): Long

fun _atoi64_l(_String: String?, _Locale: _locale_t?): Long {
    return memScoped {
        val __String = _String?.cstr?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__atoi64_l(__String, __Locale)
        res
    }
}

@SymbolName("sdl_kni__atoi64_l")
private external fun kni__atoi64_l(_String: NativePtr, _Locale: NativePtr): Long

fun _strtoi64(_String: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?, _Radix: Int): Long {
    return memScoped {
        val __String = _String?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__strtoi64(__String, __EndPtr, __Radix)
        res
    }
}

@SymbolName("sdl_kni__strtoi64")
private external fun kni__strtoi64(_String: NativePtr, _EndPtr: NativePtr, _Radix: Int): Long

fun _strtoi64_l(_String: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?, _Radix: Int, _Locale: _locale_t?): Long {
    return memScoped {
        val __String = _String?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val __Locale = _Locale.rawValue
        val res = kni__strtoi64_l(__String, __EndPtr, __Radix, __Locale)
        res
    }
}

@SymbolName("sdl_kni__strtoi64_l")
private external fun kni__strtoi64_l(_String: NativePtr, _EndPtr: NativePtr, _Radix: Int, _Locale: NativePtr): Long

fun _strtoui64(_String: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?, _Radix: Int): Long {
    return memScoped {
        val __String = _String?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__strtoui64(__String, __EndPtr, __Radix)
        res
    }
}

@SymbolName("sdl_kni__strtoui64")
private external fun kni__strtoui64(_String: NativePtr, _EndPtr: NativePtr, _Radix: Int): Long

fun _strtoui64_l(_String: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?, _Radix: Int, _Locale: _locale_t?): Long {
    return memScoped {
        val __String = _String?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val __Locale = _Locale.rawValue
        val res = kni__strtoui64_l(__String, __EndPtr, __Radix, __Locale)
        res
    }
}

@SymbolName("sdl_kni__strtoui64_l")
private external fun kni__strtoui64_l(_String: NativePtr, _EndPtr: NativePtr, _Radix: Int, _Locale: NativePtr): Long

fun ldiv(_Numerator: Int, _Denominator: Int): CValue<ldiv_t> {
    return memScoped {
        val __Numerator = _Numerator
        val __Denominator = _Denominator
        val res = kni_ldiv(__Numerator, __Denominator, alloc<ldiv_t>().rawPtr)
        interpretPointed<ldiv_t>(res).readValue()
    }
}

@SymbolName("sdl_kni_ldiv")
private external fun kni_ldiv(_Numerator: Int, _Denominator: Int, retValPlacement: NativePtr): NativePtr

fun _ltoa(_Value: Int, _Dest: CValuesRef<ByteVar>?, _Radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val __Value = _Value
        val __Dest = _Dest?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__ltoa(__Value, __Dest, __Radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__ltoa")
private external fun kni__ltoa(_Value: Int, _Dest: NativePtr, _Radix: Int): NativePtr

fun mblen(_Ch: String?, _MaxCount: size_t): Int {
    return memScoped {
        val __Ch = _Ch?.cstr?.getPointer(memScope).rawValue
        val __MaxCount = _MaxCount
        val res = kni_mblen(__Ch, __MaxCount)
        res
    }
}

@SymbolName("sdl_kni_mblen")
private external fun kni_mblen(_Ch: NativePtr, _MaxCount: Long): Int

fun _mblen_l(_Ch: String?, _MaxCount: size_t, _Locale: _locale_t?): Int {
    return memScoped {
        val __Ch = _Ch?.cstr?.getPointer(memScope).rawValue
        val __MaxCount = _MaxCount
        val __Locale = _Locale.rawValue
        val res = kni__mblen_l(__Ch, __MaxCount, __Locale)
        res
    }
}

@SymbolName("sdl_kni__mblen_l")
private external fun kni__mblen_l(_Ch: NativePtr, _MaxCount: Long, _Locale: NativePtr): Int

fun _mbstrlen(_Str: String?): size_t {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val res = kni__mbstrlen(__Str)
        res
    }
}

@SymbolName("sdl_kni__mbstrlen")
private external fun kni__mbstrlen(_Str: NativePtr): Long

fun _mbstrlen_l(_Str: String?, _Locale: _locale_t?): size_t {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__mbstrlen_l(__Str, __Locale)
        res
    }
}

@SymbolName("sdl_kni__mbstrlen_l")
private external fun kni__mbstrlen_l(_Str: NativePtr, _Locale: NativePtr): Long

fun _mbstrnlen(_Str: String?, _MaxCount: size_t): size_t {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __MaxCount = _MaxCount
        val res = kni__mbstrnlen(__Str, __MaxCount)
        res
    }
}

@SymbolName("sdl_kni__mbstrnlen")
private external fun kni__mbstrnlen(_Str: NativePtr, _MaxCount: Long): Long

fun _mbstrnlen_l(_Str: String?, _MaxCount: size_t, _Locale: _locale_t?): size_t {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __MaxCount = _MaxCount
        val __Locale = _Locale.rawValue
        val res = kni__mbstrnlen_l(__Str, __MaxCount, __Locale)
        res
    }
}

@SymbolName("sdl_kni__mbstrnlen_l")
private external fun kni__mbstrnlen_l(_Str: NativePtr, _MaxCount: Long, _Locale: NativePtr): Long

fun mbtowc(_DstCh: CValuesRef<wchar_tVar>?, _SrcCh: String?, _SrcSizeInBytes: size_t): Int {
    return memScoped {
        val __DstCh = _DstCh?.getPointer(memScope).rawValue
        val __SrcCh = _SrcCh?.cstr?.getPointer(memScope).rawValue
        val __SrcSizeInBytes = _SrcSizeInBytes
        val res = kni_mbtowc(__DstCh, __SrcCh, __SrcSizeInBytes)
        res
    }
}

@SymbolName("sdl_kni_mbtowc")
private external fun kni_mbtowc(_DstCh: NativePtr, _SrcCh: NativePtr, _SrcSizeInBytes: Long): Int

fun _mbtowc_l(_DstCh: CValuesRef<wchar_tVar>?, _SrcCh: String?, _SrcSizeInBytes: size_t, _Locale: _locale_t?): Int {
    return memScoped {
        val __DstCh = _DstCh?.getPointer(memScope).rawValue
        val __SrcCh = _SrcCh?.cstr?.getPointer(memScope).rawValue
        val __SrcSizeInBytes = _SrcSizeInBytes
        val __Locale = _Locale.rawValue
        val res = kni__mbtowc_l(__DstCh, __SrcCh, __SrcSizeInBytes, __Locale)
        res
    }
}

@SymbolName("sdl_kni__mbtowc_l")
private external fun kni__mbtowc_l(_DstCh: NativePtr, _SrcCh: NativePtr, _SrcSizeInBytes: Long, _Locale: NativePtr): Int

fun mbstowcs(_Dest: CValuesRef<wchar_tVar>?, _Source: String?, _MaxCount: size_t): size_t {
    return memScoped {
        val __Dest = _Dest?.getPointer(memScope).rawValue
        val __Source = _Source?.cstr?.getPointer(memScope).rawValue
        val __MaxCount = _MaxCount
        val res = kni_mbstowcs(__Dest, __Source, __MaxCount)
        res
    }
}

@SymbolName("sdl_kni_mbstowcs")
private external fun kni_mbstowcs(_Dest: NativePtr, _Source: NativePtr, _MaxCount: Long): Long

fun _mbstowcs_l(_Dest: CValuesRef<wchar_tVar>?, _Source: String?, _MaxCount: size_t, _Locale: _locale_t?): size_t {
    return memScoped {
        val __Dest = _Dest?.getPointer(memScope).rawValue
        val __Source = _Source?.cstr?.getPointer(memScope).rawValue
        val __MaxCount = _MaxCount
        val __Locale = _Locale.rawValue
        val res = kni__mbstowcs_l(__Dest, __Source, __MaxCount, __Locale)
        res
    }
}

@SymbolName("sdl_kni__mbstowcs_l")
private external fun kni__mbstowcs_l(_Dest: NativePtr, _Source: NativePtr, _MaxCount: Long, _Locale: NativePtr): Long

fun mkstemp(template_name: CValuesRef<ByteVar>?): Int {
    return memScoped {
        val _template_name = template_name?.getPointer(memScope).rawValue
        val res = kni_mkstemp(_template_name)
        res
    }
}

@SymbolName("sdl_kni_mkstemp")
private external fun kni_mkstemp(template_name: NativePtr): Int

fun rand(): Int {
    val res = kni_rand()
    return res
}

@SymbolName("sdl_kni_rand")
private external fun kni_rand(): Int

fun _set_error_mode(_Mode: Int): Int {
    val __Mode = _Mode
    val res = kni__set_error_mode(__Mode)
    return res
}

@SymbolName("sdl_kni__set_error_mode")
private external fun kni__set_error_mode(_Mode: Int): Int

fun srand(_Seed: Int): Unit {
    val __Seed = _Seed
    val res = kni_srand(__Seed)
    return res
}

@SymbolName("sdl_kni_srand")
private external fun kni_srand(_Seed: Int): Unit

fun strtod(_Str: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?): Double {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val res = kni_strtod(__Str, __EndPtr)
        res
    }
}

@SymbolName("sdl_kni_strtod")
private external fun kni_strtod(_Str: NativePtr, _EndPtr: NativePtr): Double

fun __mingw_strtod(arg0: String?, arg1: CValuesRef<CPointerVar<ByteVar>>?): Double {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni___mingw_strtod(_arg0, _arg1)
        res
    }
}

@SymbolName("sdl_kni___mingw_strtod")
private external fun kni___mingw_strtod(arg0: NativePtr, arg1: NativePtr): Double

fun strtof(_Str: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?): Float {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val res = kni_strtof(__Str, __EndPtr)
        res
    }
}

@SymbolName("sdl_kni_strtof")
private external fun kni_strtof(_Str: NativePtr, _EndPtr: NativePtr): Float

fun __mingw_strtof(arg0: String?, arg1: CValuesRef<CPointerVar<ByteVar>>?): Float {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni___mingw_strtof(_arg0, _arg1)
        res
    }
}

@SymbolName("sdl_kni___mingw_strtof")
private external fun kni___mingw_strtof(arg0: NativePtr, arg1: NativePtr): Float

fun __strtod(arg0: String?, arg1: CValuesRef<CPointerVar<ByteVar>>?): Double {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni___strtod(_arg0, _arg1)
        res
    }
}

@SymbolName("sdl_kni___strtod")
private external fun kni___strtod(arg0: NativePtr, arg1: NativePtr): Double

fun _strtod_l(_Str: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?, _Locale: _locale_t?): Double {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__strtod_l(__Str, __EndPtr, __Locale)
        res
    }
}

@SymbolName("sdl_kni__strtod_l")
private external fun kni__strtod_l(_Str: NativePtr, _EndPtr: NativePtr, _Locale: NativePtr): Double

fun strtol(_Str: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?, _Radix: Int): Int {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni_strtol(__Str, __EndPtr, __Radix)
        res
    }
}

@SymbolName("sdl_kni_strtol")
private external fun kni_strtol(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int): Int

fun _strtol_l(_Str: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?, _Radix: Int, _Locale: _locale_t?): Int {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val __Locale = _Locale.rawValue
        val res = kni__strtol_l(__Str, __EndPtr, __Radix, __Locale)
        res
    }
}

@SymbolName("sdl_kni__strtol_l")
private external fun kni__strtol_l(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int, _Locale: NativePtr): Int

fun strtoul(_Str: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?, _Radix: Int): Int {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni_strtoul(__Str, __EndPtr, __Radix)
        res
    }
}

@SymbolName("sdl_kni_strtoul")
private external fun kni_strtoul(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int): Int

fun _strtoul_l(_Str: String?, _EndPtr: CValuesRef<CPointerVar<ByteVar>>?, _Radix: Int, _Locale: _locale_t?): Int {
    return memScoped {
        val __Str = _Str?.cstr?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val __Locale = _Locale.rawValue
        val res = kni__strtoul_l(__Str, __EndPtr, __Radix, __Locale)
        res
    }
}

@SymbolName("sdl_kni__strtoul_l")
private external fun kni__strtoul_l(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int, _Locale: NativePtr): Int

fun _ultoa(_Value: Int, _Dest: CValuesRef<ByteVar>?, _Radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val __Value = _Value
        val __Dest = _Dest?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__ultoa(__Value, __Dest, __Radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__ultoa")
private external fun kni__ultoa(_Value: Int, _Dest: NativePtr, _Radix: Int): NativePtr

fun wctomb(_MbCh: CValuesRef<ByteVar>?, _WCh: wchar_t): Int {
    return memScoped {
        val __MbCh = _MbCh?.getPointer(memScope).rawValue
        val __WCh = _WCh
        val res = kni_wctomb(__MbCh, __WCh)
        res
    }
}

@SymbolName("sdl_kni_wctomb")
private external fun kni_wctomb(_MbCh: NativePtr, _WCh: Short): Int

fun _wctomb_l(_MbCh: CValuesRef<ByteVar>?, _WCh: wchar_t, _Locale: _locale_t?): Int {
    return memScoped {
        val __MbCh = _MbCh?.getPointer(memScope).rawValue
        val __WCh = _WCh
        val __Locale = _Locale.rawValue
        val res = kni__wctomb_l(__MbCh, __WCh, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wctomb_l")
private external fun kni__wctomb_l(_MbCh: NativePtr, _WCh: Short, _Locale: NativePtr): Int

fun wcstombs(_Dest: CValuesRef<ByteVar>?, _Source: CValuesRef<wchar_tVar>?, _MaxCount: size_t): size_t {
    return memScoped {
        val __Dest = _Dest?.getPointer(memScope).rawValue
        val __Source = _Source?.getPointer(memScope).rawValue
        val __MaxCount = _MaxCount
        val res = kni_wcstombs(__Dest, __Source, __MaxCount)
        res
    }
}

@SymbolName("sdl_kni_wcstombs")
private external fun kni_wcstombs(_Dest: NativePtr, _Source: NativePtr, _MaxCount: Long): Long

fun _wcstombs_l(_Dest: CValuesRef<ByteVar>?, _Source: CValuesRef<wchar_tVar>?, _MaxCount: size_t, _Locale: _locale_t?): size_t {
    return memScoped {
        val __Dest = _Dest?.getPointer(memScope).rawValue
        val __Source = _Source?.getPointer(memScope).rawValue
        val __MaxCount = _MaxCount
        val __Locale = _Locale.rawValue
        val res = kni__wcstombs_l(__Dest, __Source, __MaxCount, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wcstombs_l")
private external fun kni__wcstombs_l(_Dest: NativePtr, _Source: NativePtr, _MaxCount: Long, _Locale: NativePtr): Long

fun calloc(_NumOfElements: size_t, _SizeOfElements: size_t): COpaquePointer? {
    val __NumOfElements = _NumOfElements
    val __SizeOfElements = _SizeOfElements
    val res = kni_calloc(__NumOfElements, __SizeOfElements)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_calloc")
private external fun kni_calloc(_NumOfElements: Long, _SizeOfElements: Long): NativePtr

fun free(_Memory: COpaquePointer?): Unit {
    val __Memory = _Memory.rawValue
    val res = kni_free(__Memory)
    return res
}

@SymbolName("sdl_kni_free")
private external fun kni_free(_Memory: NativePtr): Unit

fun malloc(_Size: size_t): COpaquePointer? {
    val __Size = _Size
    val res = kni_malloc(__Size)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_malloc")
private external fun kni_malloc(_Size: Long): NativePtr

fun realloc(_Memory: COpaquePointer?, _NewSize: size_t): COpaquePointer? {
    val __Memory = _Memory.rawValue
    val __NewSize = _NewSize
    val res = kni_realloc(__Memory, __NewSize)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_realloc")
private external fun kni_realloc(_Memory: NativePtr, _NewSize: Long): NativePtr

fun _recalloc(_Memory: COpaquePointer?, _Count: size_t, _Size: size_t): COpaquePointer? {
    val __Memory = _Memory.rawValue
    val __Count = _Count
    val __Size = _Size
    val res = kni__recalloc(__Memory, __Count, __Size)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni__recalloc")
private external fun kni__recalloc(_Memory: NativePtr, _Count: Long, _Size: Long): NativePtr

fun _aligned_offset_malloc(_Size: size_t, _Alignment: size_t, _Offset: size_t): COpaquePointer? {
    val __Size = _Size
    val __Alignment = _Alignment
    val __Offset = _Offset
    val res = kni__aligned_offset_malloc(__Size, __Alignment, __Offset)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni__aligned_offset_malloc")
private external fun kni__aligned_offset_malloc(_Size: Long, _Alignment: Long, _Offset: Long): NativePtr

fun _aligned_realloc(_Memory: COpaquePointer?, _Size: size_t, _Alignment: size_t): COpaquePointer? {
    val __Memory = _Memory.rawValue
    val __Size = _Size
    val __Alignment = _Alignment
    val res = kni__aligned_realloc(__Memory, __Size, __Alignment)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni__aligned_realloc")
private external fun kni__aligned_realloc(_Memory: NativePtr, _Size: Long, _Alignment: Long): NativePtr

fun _aligned_recalloc(_Memory: COpaquePointer?, _Count: size_t, _Size: size_t, _Alignment: size_t): COpaquePointer? {
    val __Memory = _Memory.rawValue
    val __Count = _Count
    val __Size = _Size
    val __Alignment = _Alignment
    val res = kni__aligned_recalloc(__Memory, __Count, __Size, __Alignment)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni__aligned_recalloc")
private external fun kni__aligned_recalloc(_Memory: NativePtr, _Count: Long, _Size: Long, _Alignment: Long): NativePtr

fun _aligned_offset_realloc(_Memory: COpaquePointer?, _Size: size_t, _Alignment: size_t, _Offset: size_t): COpaquePointer? {
    val __Memory = _Memory.rawValue
    val __Size = _Size
    val __Alignment = _Alignment
    val __Offset = _Offset
    val res = kni__aligned_offset_realloc(__Memory, __Size, __Alignment, __Offset)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni__aligned_offset_realloc")
private external fun kni__aligned_offset_realloc(_Memory: NativePtr, _Size: Long, _Alignment: Long, _Offset: Long): NativePtr

fun _aligned_offset_recalloc(_Memory: COpaquePointer?, _Count: size_t, _Size: size_t, _Alignment: size_t, _Offset: size_t): COpaquePointer? {
    val __Memory = _Memory.rawValue
    val __Count = _Count
    val __Size = _Size
    val __Alignment = _Alignment
    val __Offset = _Offset
    val res = kni__aligned_offset_recalloc(__Memory, __Count, __Size, __Alignment, __Offset)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni__aligned_offset_recalloc")
private external fun kni__aligned_offset_recalloc(_Memory: NativePtr, _Count: Long, _Size: Long, _Alignment: Long, _Offset: Long): NativePtr

fun _itow(_Value: Int, _Dest: CValuesRef<wchar_tVar>?, _Radix: Int): CPointer<wchar_tVar>? {
    return memScoped {
        val __Value = _Value
        val __Dest = _Dest?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__itow(__Value, __Dest, __Radix)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__itow")
private external fun kni__itow(_Value: Int, _Dest: NativePtr, _Radix: Int): NativePtr

fun _ltow(_Value: Int, _Dest: CValuesRef<wchar_tVar>?, _Radix: Int): CPointer<wchar_tVar>? {
    return memScoped {
        val __Value = _Value
        val __Dest = _Dest?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__ltow(__Value, __Dest, __Radix)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__ltow")
private external fun kni__ltow(_Value: Int, _Dest: NativePtr, _Radix: Int): NativePtr

fun _ultow(_Value: Int, _Dest: CValuesRef<wchar_tVar>?, _Radix: Int): CPointer<wchar_tVar>? {
    return memScoped {
        val __Value = _Value
        val __Dest = _Dest?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__ultow(__Value, __Dest, __Radix)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__ultow")
private external fun kni__ultow(_Value: Int, _Dest: NativePtr, _Radix: Int): NativePtr

fun __mingw_wcstod(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?): Double {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val res = kni___mingw_wcstod(__Str, __EndPtr)
        res
    }
}

@SymbolName("sdl_kni___mingw_wcstod")
private external fun kni___mingw_wcstod(_Str: NativePtr, _EndPtr: NativePtr): Double

fun __mingw_wcstof(nptr: CValuesRef<wchar_tVar>?, endptr: CValuesRef<CPointerVar<wchar_tVar>>?): Float {
    return memScoped {
        val _nptr = nptr?.getPointer(memScope).rawValue
        val _endptr = endptr?.getPointer(memScope).rawValue
        val res = kni___mingw_wcstof(_nptr, _endptr)
        res
    }
}

@SymbolName("sdl_kni___mingw_wcstof")
private external fun kni___mingw_wcstof(nptr: NativePtr, endptr: NativePtr): Float

fun wcstod(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?): Double {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val res = kni_wcstod(__Str, __EndPtr)
        res
    }
}

@SymbolName("sdl_kni_wcstod")
private external fun kni_wcstod(_Str: NativePtr, _EndPtr: NativePtr): Double

fun wcstof(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?): Float {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val res = kni_wcstof(__Str, __EndPtr)
        res
    }
}

@SymbolName("sdl_kni_wcstof")
private external fun kni_wcstof(_Str: NativePtr, _EndPtr: NativePtr): Float

fun _wcstod_l(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?, _Locale: _locale_t?): Double {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__wcstod_l(__Str, __EndPtr, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wcstod_l")
private external fun kni__wcstod_l(_Str: NativePtr, _EndPtr: NativePtr, _Locale: NativePtr): Double

fun wcstol(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?, _Radix: Int): Int {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni_wcstol(__Str, __EndPtr, __Radix)
        res
    }
}

@SymbolName("sdl_kni_wcstol")
private external fun kni_wcstol(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int): Int

fun _wcstol_l(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?, _Radix: Int, _Locale: _locale_t?): Int {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val __Locale = _Locale.rawValue
        val res = kni__wcstol_l(__Str, __EndPtr, __Radix, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wcstol_l")
private external fun kni__wcstol_l(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int, _Locale: NativePtr): Int

fun wcstoul(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?, _Radix: Int): Int {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni_wcstoul(__Str, __EndPtr, __Radix)
        res
    }
}

@SymbolName("sdl_kni_wcstoul")
private external fun kni_wcstoul(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int): Int

fun _wcstoul_l(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?, _Radix: Int, _Locale: _locale_t?): Int {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val __Locale = _Locale.rawValue
        val res = kni__wcstoul_l(__Str, __EndPtr, __Radix, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wcstoul_l")
private external fun kni__wcstoul_l(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int, _Locale: NativePtr): Int

fun _wgetenv(_VarName: CValuesRef<wchar_tVar>?): CPointer<wchar_tVar>? {
    return memScoped {
        val __VarName = _VarName?.getPointer(memScope).rawValue
        val res = kni__wgetenv(__VarName)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__wgetenv")
private external fun kni__wgetenv(_VarName: NativePtr): NativePtr

fun _wtof(_Str: CValuesRef<wchar_tVar>?): Double {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val res = kni__wtof(__Str)
        res
    }
}

@SymbolName("sdl_kni__wtof")
private external fun kni__wtof(_Str: NativePtr): Double

fun _wtof_l(_Str: CValuesRef<wchar_tVar>?, _Locale: _locale_t?): Double {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__wtof_l(__Str, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wtof_l")
private external fun kni__wtof_l(_Str: NativePtr, _Locale: NativePtr): Double

fun _wtoi(_Str: CValuesRef<wchar_tVar>?): Int {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val res = kni__wtoi(__Str)
        res
    }
}

@SymbolName("sdl_kni__wtoi")
private external fun kni__wtoi(_Str: NativePtr): Int

fun _wtoi_l(_Str: CValuesRef<wchar_tVar>?, _Locale: _locale_t?): Int {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__wtoi_l(__Str, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wtoi_l")
private external fun kni__wtoi_l(_Str: NativePtr, _Locale: NativePtr): Int

fun _wtol(_Str: CValuesRef<wchar_tVar>?): Int {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val res = kni__wtol(__Str)
        res
    }
}

@SymbolName("sdl_kni__wtol")
private external fun kni__wtol(_Str: NativePtr): Int

fun _wtol_l(_Str: CValuesRef<wchar_tVar>?, _Locale: _locale_t?): Int {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__wtol_l(__Str, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wtol_l")
private external fun kni__wtol_l(_Str: NativePtr, _Locale: NativePtr): Int

fun _i64tow(_Val: Long, _DstBuf: CValuesRef<wchar_tVar>?, _Radix: Int): CPointer<wchar_tVar>? {
    return memScoped {
        val __Val = _Val
        val __DstBuf = _DstBuf?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__i64tow(__Val, __DstBuf, __Radix)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__i64tow")
private external fun kni__i64tow(_Val: Long, _DstBuf: NativePtr, _Radix: Int): NativePtr

fun _ui64tow(_Val: Long, _DstBuf: CValuesRef<wchar_tVar>?, _Radix: Int): CPointer<wchar_tVar>? {
    return memScoped {
        val __Val = _Val
        val __DstBuf = _DstBuf?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__ui64tow(__Val, __DstBuf, __Radix)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__ui64tow")
private external fun kni__ui64tow(_Val: Long, _DstBuf: NativePtr, _Radix: Int): NativePtr

fun _wtoi64(_Str: CValuesRef<wchar_tVar>?): Long {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val res = kni__wtoi64(__Str)
        res
    }
}

@SymbolName("sdl_kni__wtoi64")
private external fun kni__wtoi64(_Str: NativePtr): Long

fun _wtoi64_l(_Str: CValuesRef<wchar_tVar>?, _Locale: _locale_t?): Long {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__wtoi64_l(__Str, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wtoi64_l")
private external fun kni__wtoi64_l(_Str: NativePtr, _Locale: NativePtr): Long

fun _wcstoi64(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?, _Radix: Int): Long {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__wcstoi64(__Str, __EndPtr, __Radix)
        res
    }
}

@SymbolName("sdl_kni__wcstoi64")
private external fun kni__wcstoi64(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int): Long

fun _wcstoi64_l(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?, _Radix: Int, _Locale: _locale_t?): Long {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val __Locale = _Locale.rawValue
        val res = kni__wcstoi64_l(__Str, __EndPtr, __Radix, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wcstoi64_l")
private external fun kni__wcstoi64_l(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int, _Locale: NativePtr): Long

fun _wcstoui64(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?, _Radix: Int): Long {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni__wcstoui64(__Str, __EndPtr, __Radix)
        res
    }
}

@SymbolName("sdl_kni__wcstoui64")
private external fun kni__wcstoui64(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int): Long

fun _wcstoui64_l(_Str: CValuesRef<wchar_tVar>?, _EndPtr: CValuesRef<CPointerVar<wchar_tVar>>?, _Radix: Int, _Locale: _locale_t?): Long {
    return memScoped {
        val __Str = _Str?.getPointer(memScope).rawValue
        val __EndPtr = _EndPtr?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val __Locale = _Locale.rawValue
        val res = kni__wcstoui64_l(__Str, __EndPtr, __Radix, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wcstoui64_l")
private external fun kni__wcstoui64_l(_Str: NativePtr, _EndPtr: NativePtr, _Radix: Int, _Locale: NativePtr): Long

fun _putenv(_EnvString: String?): Int {
    return memScoped {
        val __EnvString = _EnvString?.cstr?.getPointer(memScope).rawValue
        val res = kni__putenv(__EnvString)
        res
    }
}

@SymbolName("sdl_kni__putenv")
private external fun kni__putenv(_EnvString: NativePtr): Int

fun _wputenv(_EnvString: CValuesRef<wchar_tVar>?): Int {
    return memScoped {
        val __EnvString = _EnvString?.getPointer(memScope).rawValue
        val res = kni__wputenv(__EnvString)
        res
    }
}

@SymbolName("sdl_kni__wputenv")
private external fun kni__wputenv(_EnvString: NativePtr): Int

fun _fullpath(_FullPath: CValuesRef<ByteVar>?, _Path: String?, _SizeInBytes: size_t): CPointer<ByteVar>? {
    return memScoped {
        val __FullPath = _FullPath?.getPointer(memScope).rawValue
        val __Path = _Path?.cstr?.getPointer(memScope).rawValue
        val __SizeInBytes = _SizeInBytes
        val res = kni__fullpath(__FullPath, __Path, __SizeInBytes)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__fullpath")
private external fun kni__fullpath(_FullPath: NativePtr, _Path: NativePtr, _SizeInBytes: Long): NativePtr

fun _ecvt(_Val: Double, _NumOfDigits: Int, _PtDec: CValuesRef<IntVar>?, _PtSign: CValuesRef<IntVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __NumOfDigits = _NumOfDigits
        val __PtDec = _PtDec?.getPointer(memScope).rawValue
        val __PtSign = _PtSign?.getPointer(memScope).rawValue
        val res = kni__ecvt(__Val, __NumOfDigits, __PtDec, __PtSign)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__ecvt")
private external fun kni__ecvt(_Val: Double, _NumOfDigits: Int, _PtDec: NativePtr, _PtSign: NativePtr): NativePtr

fun _fcvt(_Val: Double, _NumOfDec: Int, _PtDec: CValuesRef<IntVar>?, _PtSign: CValuesRef<IntVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __NumOfDec = _NumOfDec
        val __PtDec = _PtDec?.getPointer(memScope).rawValue
        val __PtSign = _PtSign?.getPointer(memScope).rawValue
        val res = kni__fcvt(__Val, __NumOfDec, __PtDec, __PtSign)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__fcvt")
private external fun kni__fcvt(_Val: Double, _NumOfDec: Int, _PtDec: NativePtr, _PtSign: NativePtr): NativePtr

fun _gcvt(_Val: Double, _NumOfDigits: Int, _DstBuf: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __NumOfDigits = _NumOfDigits
        val __DstBuf = _DstBuf?.getPointer(memScope).rawValue
        val res = kni__gcvt(__Val, __NumOfDigits, __DstBuf)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__gcvt")
private external fun kni__gcvt(_Val: Double, _NumOfDigits: Int, _DstBuf: NativePtr): NativePtr

fun _atodbl(_Result: CValuesRef<_CRT_DOUBLE>?, _Str: CValuesRef<ByteVar>?): Int {
    return memScoped {
        val __Result = _Result?.getPointer(memScope).rawValue
        val __Str = _Str?.getPointer(memScope).rawValue
        val res = kni__atodbl(__Result, __Str)
        res
    }
}

@SymbolName("sdl_kni__atodbl")
private external fun kni__atodbl(_Result: NativePtr, _Str: NativePtr): Int

fun _atoldbl(_Result: CValuesRef<_LDOUBLE>?, _Str: CValuesRef<ByteVar>?): Int {
    return memScoped {
        val __Result = _Result?.getPointer(memScope).rawValue
        val __Str = _Str?.getPointer(memScope).rawValue
        val res = kni__atoldbl(__Result, __Str)
        res
    }
}

@SymbolName("sdl_kni__atoldbl")
private external fun kni__atoldbl(_Result: NativePtr, _Str: NativePtr): Int

fun _atoflt(_Result: CValuesRef<_CRT_FLOAT>?, _Str: CValuesRef<ByteVar>?): Int {
    return memScoped {
        val __Result = _Result?.getPointer(memScope).rawValue
        val __Str = _Str?.getPointer(memScope).rawValue
        val res = kni__atoflt(__Result, __Str)
        res
    }
}

@SymbolName("sdl_kni__atoflt")
private external fun kni__atoflt(_Result: NativePtr, _Str: NativePtr): Int

fun _atodbl_l(_Result: CValuesRef<_CRT_DOUBLE>?, _Str: CValuesRef<ByteVar>?, _Locale: _locale_t?): Int {
    return memScoped {
        val __Result = _Result?.getPointer(memScope).rawValue
        val __Str = _Str?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__atodbl_l(__Result, __Str, __Locale)
        res
    }
}

@SymbolName("sdl_kni__atodbl_l")
private external fun kni__atodbl_l(_Result: NativePtr, _Str: NativePtr, _Locale: NativePtr): Int

fun _atoldbl_l(_Result: CValuesRef<_LDOUBLE>?, _Str: CValuesRef<ByteVar>?, _Locale: _locale_t?): Int {
    return memScoped {
        val __Result = _Result?.getPointer(memScope).rawValue
        val __Str = _Str?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__atoldbl_l(__Result, __Str, __Locale)
        res
    }
}

@SymbolName("sdl_kni__atoldbl_l")
private external fun kni__atoldbl_l(_Result: NativePtr, _Str: NativePtr, _Locale: NativePtr): Int

fun _atoflt_l(_Result: CValuesRef<_CRT_FLOAT>?, _Str: CValuesRef<ByteVar>?, _Locale: _locale_t?): Int {
    return memScoped {
        val __Result = _Result?.getPointer(memScope).rawValue
        val __Str = _Str?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__atoflt_l(__Result, __Str, __Locale)
        res
    }
}

@SymbolName("sdl_kni__atoflt_l")
private external fun kni__atoflt_l(_Result: NativePtr, _Str: NativePtr, _Locale: NativePtr): Int

fun _makepath(_Path: CValuesRef<ByteVar>?, _Drive: String?, _Dir: String?, _Filename: String?, _Ext: String?): Unit {
    return memScoped {
        val __Path = _Path?.getPointer(memScope).rawValue
        val __Drive = _Drive?.cstr?.getPointer(memScope).rawValue
        val __Dir = _Dir?.cstr?.getPointer(memScope).rawValue
        val __Filename = _Filename?.cstr?.getPointer(memScope).rawValue
        val __Ext = _Ext?.cstr?.getPointer(memScope).rawValue
        val res = kni__makepath(__Path, __Drive, __Dir, __Filename, __Ext)
        res
    }
}

@SymbolName("sdl_kni__makepath")
private external fun kni__makepath(_Path: NativePtr, _Drive: NativePtr, _Dir: NativePtr, _Filename: NativePtr, _Ext: NativePtr): Unit

fun _onexit(_Func: _onexit_t?): _onexit_t? {
    val __Func = _Func.rawValue
    val res = kni__onexit(__Func)
    return interpretCPointer<CFunction<() -> Int>>(res)
}

@SymbolName("sdl_kni__onexit")
private external fun kni__onexit(_Func: NativePtr): NativePtr

fun perror(_ErrMsg: String?): Unit {
    return memScoped {
        val __ErrMsg = _ErrMsg?.cstr?.getPointer(memScope).rawValue
        val res = kni_perror(__ErrMsg)
        res
    }
}

@SymbolName("sdl_kni_perror")
private external fun kni_perror(_ErrMsg: NativePtr): Unit

fun _rotl64(_Val: Long, _Shift: Int): Long {
    val __Val = _Val
    val __Shift = _Shift
    val res = kni__rotl64(__Val, __Shift)
    return res
}

@SymbolName("sdl_kni__rotl64")
private external fun kni__rotl64(_Val: Long, _Shift: Int): Long

fun _rotr64(_Val: Long, _Shift: Int): Long {
    val __Val = _Val
    val __Shift = _Shift
    val res = kni__rotr64(__Val, __Shift)
    return res
}

@SymbolName("sdl_kni__rotr64")
private external fun kni__rotr64(_Val: Long, _Shift: Int): Long

fun _rotr(_Val: Int, _Shift: Int): Int {
    val __Val = _Val
    val __Shift = _Shift
    val res = kni__rotr(__Val, __Shift)
    return res
}

@SymbolName("sdl_kni__rotr")
private external fun kni__rotr(_Val: Int, _Shift: Int): Int

fun _rotl(_Val: Int, _Shift: Int): Int {
    val __Val = _Val
    val __Shift = _Shift
    val res = kni__rotl(__Val, __Shift)
    return res
}

@SymbolName("sdl_kni__rotl")
private external fun kni__rotl(_Val: Int, _Shift: Int): Int

fun _searchenv(_Filename: String?, _EnvVar: String?, _ResultPath: CValuesRef<ByteVar>?): Unit {
    return memScoped {
        val __Filename = _Filename?.cstr?.getPointer(memScope).rawValue
        val __EnvVar = _EnvVar?.cstr?.getPointer(memScope).rawValue
        val __ResultPath = _ResultPath?.getPointer(memScope).rawValue
        val res = kni__searchenv(__Filename, __EnvVar, __ResultPath)
        res
    }
}

@SymbolName("sdl_kni__searchenv")
private external fun kni__searchenv(_Filename: NativePtr, _EnvVar: NativePtr, _ResultPath: NativePtr): Unit

fun _splitpath(_FullPath: String?, _Drive: CValuesRef<ByteVar>?, _Dir: CValuesRef<ByteVar>?, _Filename: CValuesRef<ByteVar>?, _Ext: CValuesRef<ByteVar>?): Unit {
    return memScoped {
        val __FullPath = _FullPath?.cstr?.getPointer(memScope).rawValue
        val __Drive = _Drive?.getPointer(memScope).rawValue
        val __Dir = _Dir?.getPointer(memScope).rawValue
        val __Filename = _Filename?.getPointer(memScope).rawValue
        val __Ext = _Ext?.getPointer(memScope).rawValue
        val res = kni__splitpath(__FullPath, __Drive, __Dir, __Filename, __Ext)
        res
    }
}

@SymbolName("sdl_kni__splitpath")
private external fun kni__splitpath(_FullPath: NativePtr, _Drive: NativePtr, _Dir: NativePtr, _Filename: NativePtr, _Ext: NativePtr): Unit

fun _swab(_Buf1: CValuesRef<ByteVar>?, _Buf2: CValuesRef<ByteVar>?, _SizeInBytes: Int): Unit {
    return memScoped {
        val __Buf1 = _Buf1?.getPointer(memScope).rawValue
        val __Buf2 = _Buf2?.getPointer(memScope).rawValue
        val __SizeInBytes = _SizeInBytes
        val res = kni__swab(__Buf1, __Buf2, __SizeInBytes)
        res
    }
}

@SymbolName("sdl_kni__swab")
private external fun kni__swab(_Buf1: NativePtr, _Buf2: NativePtr, _SizeInBytes: Int): Unit

fun _wfullpath(_FullPath: CValuesRef<wchar_tVar>?, _Path: CValuesRef<wchar_tVar>?, _SizeInWords: size_t): CPointer<wchar_tVar>? {
    return memScoped {
        val __FullPath = _FullPath?.getPointer(memScope).rawValue
        val __Path = _Path?.getPointer(memScope).rawValue
        val __SizeInWords = _SizeInWords
        val res = kni__wfullpath(__FullPath, __Path, __SizeInWords)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__wfullpath")
private external fun kni__wfullpath(_FullPath: NativePtr, _Path: NativePtr, _SizeInWords: Long): NativePtr

fun _wmakepath(_ResultPath: CValuesRef<wchar_tVar>?, _Drive: CValuesRef<wchar_tVar>?, _Dir: CValuesRef<wchar_tVar>?, _Filename: CValuesRef<wchar_tVar>?, _Ext: CValuesRef<wchar_tVar>?): Unit {
    return memScoped {
        val __ResultPath = _ResultPath?.getPointer(memScope).rawValue
        val __Drive = _Drive?.getPointer(memScope).rawValue
        val __Dir = _Dir?.getPointer(memScope).rawValue
        val __Filename = _Filename?.getPointer(memScope).rawValue
        val __Ext = _Ext?.getPointer(memScope).rawValue
        val res = kni__wmakepath(__ResultPath, __Drive, __Dir, __Filename, __Ext)
        res
    }
}

@SymbolName("sdl_kni__wmakepath")
private external fun kni__wmakepath(_ResultPath: NativePtr, _Drive: NativePtr, _Dir: NativePtr, _Filename: NativePtr, _Ext: NativePtr): Unit

fun _wperror(_ErrMsg: CValuesRef<wchar_tVar>?): Unit {
    return memScoped {
        val __ErrMsg = _ErrMsg?.getPointer(memScope).rawValue
        val res = kni__wperror(__ErrMsg)
        res
    }
}

@SymbolName("sdl_kni__wperror")
private external fun kni__wperror(_ErrMsg: NativePtr): Unit

fun _wsearchenv(_Filename: CValuesRef<wchar_tVar>?, _EnvVar: CValuesRef<wchar_tVar>?, _ResultPath: CValuesRef<wchar_tVar>?): Unit {
    return memScoped {
        val __Filename = _Filename?.getPointer(memScope).rawValue
        val __EnvVar = _EnvVar?.getPointer(memScope).rawValue
        val __ResultPath = _ResultPath?.getPointer(memScope).rawValue
        val res = kni__wsearchenv(__Filename, __EnvVar, __ResultPath)
        res
    }
}

@SymbolName("sdl_kni__wsearchenv")
private external fun kni__wsearchenv(_Filename: NativePtr, _EnvVar: NativePtr, _ResultPath: NativePtr): Unit

fun _wsplitpath(_FullPath: CValuesRef<wchar_tVar>?, _Drive: CValuesRef<wchar_tVar>?, _Dir: CValuesRef<wchar_tVar>?, _Filename: CValuesRef<wchar_tVar>?, _Ext: CValuesRef<wchar_tVar>?): Unit {
    return memScoped {
        val __FullPath = _FullPath?.getPointer(memScope).rawValue
        val __Drive = _Drive?.getPointer(memScope).rawValue
        val __Dir = _Dir?.getPointer(memScope).rawValue
        val __Filename = _Filename?.getPointer(memScope).rawValue
        val __Ext = _Ext?.getPointer(memScope).rawValue
        val res = kni__wsplitpath(__FullPath, __Drive, __Dir, __Filename, __Ext)
        res
    }
}

@SymbolName("sdl_kni__wsplitpath")
private external fun kni__wsplitpath(_FullPath: NativePtr, _Drive: NativePtr, _Dir: NativePtr, _Filename: NativePtr, _Ext: NativePtr): Unit

fun _beep(_Frequency: Int, _Duration: Int): Unit {
    val __Frequency = _Frequency
    val __Duration = _Duration
    val res = kni__beep(__Frequency, __Duration)
    return res
}

@SymbolName("sdl_kni__beep")
private external fun kni__beep(_Frequency: Int, _Duration: Int): Unit

fun _seterrormode(_Mode: Int): Unit {
    val __Mode = _Mode
    val res = kni__seterrormode(__Mode)
    return res
}

@SymbolName("sdl_kni__seterrormode")
private external fun kni__seterrormode(_Mode: Int): Unit

fun _sleep(_Duration: Int): Unit {
    val __Duration = _Duration
    val res = kni__sleep(__Duration)
    return res
}

@SymbolName("sdl_kni__sleep")
private external fun kni__sleep(_Duration: Int): Unit

fun ecvt(_Val: Double, _NumOfDigits: Int, _PtDec: CValuesRef<IntVar>?, _PtSign: CValuesRef<IntVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __NumOfDigits = _NumOfDigits
        val __PtDec = _PtDec?.getPointer(memScope).rawValue
        val __PtSign = _PtSign?.getPointer(memScope).rawValue
        val res = kni_ecvt(__Val, __NumOfDigits, __PtDec, __PtSign)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_ecvt")
private external fun kni_ecvt(_Val: Double, _NumOfDigits: Int, _PtDec: NativePtr, _PtSign: NativePtr): NativePtr

fun fcvt(_Val: Double, _NumOfDec: Int, _PtDec: CValuesRef<IntVar>?, _PtSign: CValuesRef<IntVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __NumOfDec = _NumOfDec
        val __PtDec = _PtDec?.getPointer(memScope).rawValue
        val __PtSign = _PtSign?.getPointer(memScope).rawValue
        val res = kni_fcvt(__Val, __NumOfDec, __PtDec, __PtSign)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_fcvt")
private external fun kni_fcvt(_Val: Double, _NumOfDec: Int, _PtDec: NativePtr, _PtSign: NativePtr): NativePtr

fun gcvt(_Val: Double, _NumOfDigits: Int, _DstBuf: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __NumOfDigits = _NumOfDigits
        val __DstBuf = _DstBuf?.getPointer(memScope).rawValue
        val res = kni_gcvt(__Val, __NumOfDigits, __DstBuf)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_gcvt")
private external fun kni_gcvt(_Val: Double, _NumOfDigits: Int, _DstBuf: NativePtr): NativePtr

fun itoa(_Val: Int, _DstBuf: CValuesRef<ByteVar>?, _Radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __DstBuf = _DstBuf?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni_itoa(__Val, __DstBuf, __Radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_itoa")
private external fun kni_itoa(_Val: Int, _DstBuf: NativePtr, _Radix: Int): NativePtr

fun ltoa(_Val: Int, _DstBuf: CValuesRef<ByteVar>?, _Radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __DstBuf = _DstBuf?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni_ltoa(__Val, __DstBuf, __Radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_ltoa")
private external fun kni_ltoa(_Val: Int, _DstBuf: NativePtr, _Radix: Int): NativePtr

fun putenv(_EnvString: String?): Int {
    return memScoped {
        val __EnvString = _EnvString?.cstr?.getPointer(memScope).rawValue
        val res = kni_putenv(__EnvString)
        res
    }
}

@SymbolName("sdl_kni_putenv")
private external fun kni_putenv(_EnvString: NativePtr): Int

fun swab(_Buf1: CValuesRef<ByteVar>?, _Buf2: CValuesRef<ByteVar>?, _SizeInBytes: Int): Unit {
    return memScoped {
        val __Buf1 = _Buf1?.getPointer(memScope).rawValue
        val __Buf2 = _Buf2?.getPointer(memScope).rawValue
        val __SizeInBytes = _SizeInBytes
        val res = kni_swab(__Buf1, __Buf2, __SizeInBytes)
        res
    }
}

@SymbolName("sdl_kni_swab")
private external fun kni_swab(_Buf1: NativePtr, _Buf2: NativePtr, _SizeInBytes: Int): Unit

fun ultoa(_Val: Int, _Dstbuf: CValuesRef<ByteVar>?, _Radix: Int): CPointer<ByteVar>? {
    return memScoped {
        val __Val = _Val
        val __Dstbuf = _Dstbuf?.getPointer(memScope).rawValue
        val __Radix = _Radix
        val res = kni_ultoa(__Val, __Dstbuf, __Radix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_ultoa")
private external fun kni_ultoa(_Val: Int, _Dstbuf: NativePtr, _Radix: Int): NativePtr

fun onexit(_Func: _onexit_t?): _onexit_t? {
    val __Func = _Func.rawValue
    val res = kni_onexit(__Func)
    return interpretCPointer<CFunction<() -> Int>>(res)
}

@SymbolName("sdl_kni_onexit")
private external fun kni_onexit(_Func: NativePtr): NativePtr

fun lldiv(arg0: Long, arg1: Long): CValue<lldiv_t> {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1
        val res = kni_lldiv(_arg0, _arg1, alloc<lldiv_t>().rawPtr)
        interpretPointed<lldiv_t>(res).readValue()
    }
}

@SymbolName("sdl_kni_lldiv")
private external fun kni_lldiv(arg0: Long, arg1: Long, retValPlacement: NativePtr): NativePtr

fun llabs(arg0: Long): Long {
    val _arg0 = arg0
    val res = kni_llabs(_arg0)
    return res
}

@SymbolName("sdl_kni_llabs")
private external fun kni_llabs(arg0: Long): Long

fun strtoll(arg0: String?, arg1: CValuesRef<CPointerVar<ByteVar>>?, arg2: Int): Long {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val res = kni_strtoll(_arg0, _arg1, _arg2)
        res
    }
}

@SymbolName("sdl_kni_strtoll")
private external fun kni_strtoll(arg0: NativePtr, arg1: NativePtr, arg2: Int): Long

fun strtoull(arg0: String?, arg1: CValuesRef<CPointerVar<ByteVar>>?, arg2: Int): Long {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val res = kni_strtoull(_arg0, _arg1, _arg2)
        res
    }
}

@SymbolName("sdl_kni_strtoull")
private external fun kni_strtoull(arg0: NativePtr, arg1: NativePtr, arg2: Int): Long

fun atoll(arg0: String?): Long {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val res = kni_atoll(_arg0)
        res
    }
}

@SymbolName("sdl_kni_atoll")
private external fun kni_atoll(arg0: NativePtr): Long

fun wtoll(arg0: CValuesRef<wchar_tVar>?): Long {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_wtoll(_arg0)
        res
    }
}

@SymbolName("sdl_kni_wtoll")
private external fun kni_wtoll(arg0: NativePtr): Long

fun lltoa(arg0: Long, arg1: CValuesRef<ByteVar>?, arg2: Int): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val res = kni_lltoa(_arg0, _arg1, _arg2)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_lltoa")
private external fun kni_lltoa(arg0: Long, arg1: NativePtr, arg2: Int): NativePtr

fun ulltoa(arg0: Long, arg1: CValuesRef<ByteVar>?, arg2: Int): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val res = kni_ulltoa(_arg0, _arg1, _arg2)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_ulltoa")
private external fun kni_ulltoa(arg0: Long, arg1: NativePtr, arg2: Int): NativePtr

fun lltow(arg0: Long, arg1: CValuesRef<wchar_tVar>?, arg2: Int): CPointer<wchar_tVar>? {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val res = kni_lltow(_arg0, _arg1, _arg2)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni_lltow")
private external fun kni_lltow(arg0: Long, arg1: NativePtr, arg2: Int): NativePtr

fun ulltow(arg0: Long, arg1: CValuesRef<wchar_tVar>?, arg2: Int): CPointer<wchar_tVar>? {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val res = kni_ulltow(_arg0, _arg1, _arg2)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni_ulltow")
private external fun kni_ulltow(arg0: Long, arg1: NativePtr, arg2: Int): NativePtr

fun SDL_GetCPUCount(): Int {
    val res = kni_SDL_GetCPUCount()
    return res
}

@SymbolName("sdl_kni_SDL_GetCPUCount")
private external fun kni_SDL_GetCPUCount(): Int

fun SDL_GetCPUCacheLineSize(): Int {
    val res = kni_SDL_GetCPUCacheLineSize()
    return res
}

@SymbolName("sdl_kni_SDL_GetCPUCacheLineSize")
private external fun kni_SDL_GetCPUCacheLineSize(): Int

fun SDL_HasRDTSC(): SDL_bool {
    val res = kni_SDL_HasRDTSC()
    return res
}

@SymbolName("sdl_kni_SDL_HasRDTSC")
private external fun kni_SDL_HasRDTSC(): Int

fun SDL_HasAltiVec(): SDL_bool {
    val res = kni_SDL_HasAltiVec()
    return res
}

@SymbolName("sdl_kni_SDL_HasAltiVec")
private external fun kni_SDL_HasAltiVec(): Int

fun SDL_HasMMX(): SDL_bool {
    val res = kni_SDL_HasMMX()
    return res
}

@SymbolName("sdl_kni_SDL_HasMMX")
private external fun kni_SDL_HasMMX(): Int

fun SDL_Has3DNow(): SDL_bool {
    val res = kni_SDL_Has3DNow()
    return res
}

@SymbolName("sdl_kni_SDL_Has3DNow")
private external fun kni_SDL_Has3DNow(): Int

fun SDL_HasSSE(): SDL_bool {
    val res = kni_SDL_HasSSE()
    return res
}

@SymbolName("sdl_kni_SDL_HasSSE")
private external fun kni_SDL_HasSSE(): Int

fun SDL_HasSSE2(): SDL_bool {
    val res = kni_SDL_HasSSE2()
    return res
}

@SymbolName("sdl_kni_SDL_HasSSE2")
private external fun kni_SDL_HasSSE2(): Int

fun SDL_HasSSE3(): SDL_bool {
    val res = kni_SDL_HasSSE3()
    return res
}

@SymbolName("sdl_kni_SDL_HasSSE3")
private external fun kni_SDL_HasSSE3(): Int

fun SDL_HasSSE41(): SDL_bool {
    val res = kni_SDL_HasSSE41()
    return res
}

@SymbolName("sdl_kni_SDL_HasSSE41")
private external fun kni_SDL_HasSSE41(): Int

fun SDL_HasSSE42(): SDL_bool {
    val res = kni_SDL_HasSSE42()
    return res
}

@SymbolName("sdl_kni_SDL_HasSSE42")
private external fun kni_SDL_HasSSE42(): Int

fun SDL_HasAVX(): SDL_bool {
    val res = kni_SDL_HasAVX()
    return res
}

@SymbolName("sdl_kni_SDL_HasAVX")
private external fun kni_SDL_HasAVX(): Int

fun SDL_HasAVX2(): SDL_bool {
    val res = kni_SDL_HasAVX2()
    return res
}

@SymbolName("sdl_kni_SDL_HasAVX2")
private external fun kni_SDL_HasAVX2(): Int

fun SDL_HasNEON(): SDL_bool {
    val res = kni_SDL_HasNEON()
    return res
}

@SymbolName("sdl_kni_SDL_HasNEON")
private external fun kni_SDL_HasNEON(): Int

fun SDL_GetSystemRAM(): Int {
    val res = kni_SDL_GetSystemRAM()
    return res
}

@SymbolName("sdl_kni_SDL_GetSystemRAM")
private external fun kni_SDL_GetSystemRAM(): Int

fun SDL_GetPixelFormatName(format: Uint32): CPointer<ByteVar>? {
    val _format = format
    val res = kni_SDL_GetPixelFormatName(_format)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetPixelFormatName")
private external fun kni_SDL_GetPixelFormatName(format: Int): NativePtr

fun SDL_PixelFormatEnumToMasks(format: Uint32, bpp: CValuesRef<IntVar>?, Rmask: CValuesRef<Uint32Var>?, Gmask: CValuesRef<Uint32Var>?, Bmask: CValuesRef<Uint32Var>?, Amask: CValuesRef<Uint32Var>?): SDL_bool {
    return memScoped {
        val _format = format
        val _bpp = bpp?.getPointer(memScope).rawValue
        val _Rmask = Rmask?.getPointer(memScope).rawValue
        val _Gmask = Gmask?.getPointer(memScope).rawValue
        val _Bmask = Bmask?.getPointer(memScope).rawValue
        val _Amask = Amask?.getPointer(memScope).rawValue
        val res = kni_SDL_PixelFormatEnumToMasks(_format, _bpp, _Rmask, _Gmask, _Bmask, _Amask)
        res
    }
}

@SymbolName("sdl_kni_SDL_PixelFormatEnumToMasks")
private external fun kni_SDL_PixelFormatEnumToMasks(format: Int, bpp: NativePtr, Rmask: NativePtr, Gmask: NativePtr, Bmask: NativePtr, Amask: NativePtr): Int

fun SDL_MasksToPixelFormatEnum(bpp: Int, Rmask: Uint32, Gmask: Uint32, Bmask: Uint32, Amask: Uint32): Uint32 {
    val _bpp = bpp
    val _Rmask = Rmask
    val _Gmask = Gmask
    val _Bmask = Bmask
    val _Amask = Amask
    val res = kni_SDL_MasksToPixelFormatEnum(_bpp, _Rmask, _Gmask, _Bmask, _Amask)
    return res
}

@SymbolName("sdl_kni_SDL_MasksToPixelFormatEnum")
private external fun kni_SDL_MasksToPixelFormatEnum(bpp: Int, Rmask: Int, Gmask: Int, Bmask: Int, Amask: Int): Int

fun SDL_AllocFormat(pixel_format: Uint32): CPointer<SDL_PixelFormat>? {
    val _pixel_format = pixel_format
    val res = kni_SDL_AllocFormat(_pixel_format)
    return interpretCPointer<SDL_PixelFormat>(res)
}

@SymbolName("sdl_kni_SDL_AllocFormat")
private external fun kni_SDL_AllocFormat(pixel_format: Int): NativePtr

fun SDL_FreeFormat(format: CValuesRef<SDL_PixelFormat>?): Unit {
    return memScoped {
        val _format = format?.getPointer(memScope).rawValue
        val res = kni_SDL_FreeFormat(_format)
        res
    }
}

@SymbolName("sdl_kni_SDL_FreeFormat")
private external fun kni_SDL_FreeFormat(format: NativePtr): Unit

fun SDL_AllocPalette(ncolors: Int): CPointer<SDL_Palette>? {
    val _ncolors = ncolors
    val res = kni_SDL_AllocPalette(_ncolors)
    return interpretCPointer<SDL_Palette>(res)
}

@SymbolName("sdl_kni_SDL_AllocPalette")
private external fun kni_SDL_AllocPalette(ncolors: Int): NativePtr

fun SDL_SetPixelFormatPalette(format: CValuesRef<SDL_PixelFormat>?, palette: CValuesRef<SDL_Palette>?): Int {
    return memScoped {
        val _format = format?.getPointer(memScope).rawValue
        val _palette = palette?.getPointer(memScope).rawValue
        val res = kni_SDL_SetPixelFormatPalette(_format, _palette)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetPixelFormatPalette")
private external fun kni_SDL_SetPixelFormatPalette(format: NativePtr, palette: NativePtr): Int

fun SDL_SetPaletteColors(palette: CValuesRef<SDL_Palette>?, colors: CValuesRef<SDL_Color>?, firstcolor: Int, ncolors: Int): Int {
    return memScoped {
        val _palette = palette?.getPointer(memScope).rawValue
        val _colors = colors?.getPointer(memScope).rawValue
        val _firstcolor = firstcolor
        val _ncolors = ncolors
        val res = kni_SDL_SetPaletteColors(_palette, _colors, _firstcolor, _ncolors)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetPaletteColors")
private external fun kni_SDL_SetPaletteColors(palette: NativePtr, colors: NativePtr, firstcolor: Int, ncolors: Int): Int

fun SDL_FreePalette(palette: CValuesRef<SDL_Palette>?): Unit {
    return memScoped {
        val _palette = palette?.getPointer(memScope).rawValue
        val res = kni_SDL_FreePalette(_palette)
        res
    }
}

@SymbolName("sdl_kni_SDL_FreePalette")
private external fun kni_SDL_FreePalette(palette: NativePtr): Unit

fun SDL_MapRGB(format: CValuesRef<SDL_PixelFormat>?, r: Uint8, g: Uint8, b: Uint8): Uint32 {
    return memScoped {
        val _format = format?.getPointer(memScope).rawValue
        val _r = r
        val _g = g
        val _b = b
        val res = kni_SDL_MapRGB(_format, _r, _g, _b)
        res
    }
}

@SymbolName("sdl_kni_SDL_MapRGB")
private external fun kni_SDL_MapRGB(format: NativePtr, r: Byte, g: Byte, b: Byte): Int

fun SDL_MapRGBA(format: CValuesRef<SDL_PixelFormat>?, r: Uint8, g: Uint8, b: Uint8, a: Uint8): Uint32 {
    return memScoped {
        val _format = format?.getPointer(memScope).rawValue
        val _r = r
        val _g = g
        val _b = b
        val _a = a
        val res = kni_SDL_MapRGBA(_format, _r, _g, _b, _a)
        res
    }
}

@SymbolName("sdl_kni_SDL_MapRGBA")
private external fun kni_SDL_MapRGBA(format: NativePtr, r: Byte, g: Byte, b: Byte, a: Byte): Int

fun SDL_GetRGB(pixel: Uint32, format: CValuesRef<SDL_PixelFormat>?, r: CValuesRef<Uint8Var>?, g: CValuesRef<Uint8Var>?, b: CValuesRef<Uint8Var>?): Unit {
    return memScoped {
        val _pixel = pixel
        val _format = format?.getPointer(memScope).rawValue
        val _r = r?.getPointer(memScope).rawValue
        val _g = g?.getPointer(memScope).rawValue
        val _b = b?.getPointer(memScope).rawValue
        val res = kni_SDL_GetRGB(_pixel, _format, _r, _g, _b)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetRGB")
private external fun kni_SDL_GetRGB(pixel: Int, format: NativePtr, r: NativePtr, g: NativePtr, b: NativePtr): Unit

fun SDL_GetRGBA(pixel: Uint32, format: CValuesRef<SDL_PixelFormat>?, r: CValuesRef<Uint8Var>?, g: CValuesRef<Uint8Var>?, b: CValuesRef<Uint8Var>?, a: CValuesRef<Uint8Var>?): Unit {
    return memScoped {
        val _pixel = pixel
        val _format = format?.getPointer(memScope).rawValue
        val _r = r?.getPointer(memScope).rawValue
        val _g = g?.getPointer(memScope).rawValue
        val _b = b?.getPointer(memScope).rawValue
        val _a = a?.getPointer(memScope).rawValue
        val res = kni_SDL_GetRGBA(_pixel, _format, _r, _g, _b, _a)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetRGBA")
private external fun kni_SDL_GetRGBA(pixel: Int, format: NativePtr, r: NativePtr, g: NativePtr, b: NativePtr, a: NativePtr): Unit

fun SDL_CalculateGammaRamp(gamma: Float, ramp: CValuesRef<Uint16Var>?): Unit {
    return memScoped {
        val _gamma = gamma
        val _ramp = ramp?.getPointer(memScope).rawValue
        val res = kni_SDL_CalculateGammaRamp(_gamma, _ramp)
        res
    }
}

@SymbolName("sdl_kni_SDL_CalculateGammaRamp")
private external fun kni_SDL_CalculateGammaRamp(gamma: Float, ramp: NativePtr): Unit

fun SDL_PointInRect(p: CValuesRef<SDL_Point>?, r: CValuesRef<SDL_Rect>?): SDL_bool {
    return memScoped {
        val _p = p?.getPointer(memScope).rawValue
        val _r = r?.getPointer(memScope).rawValue
        val res = kni_SDL_PointInRect(_p, _r)
        res
    }
}

@SymbolName("sdl_kni_SDL_PointInRect")
private external fun kni_SDL_PointInRect(p: NativePtr, r: NativePtr): Int

fun SDL_RectEmpty(r: CValuesRef<SDL_Rect>?): SDL_bool {
    return memScoped {
        val _r = r?.getPointer(memScope).rawValue
        val res = kni_SDL_RectEmpty(_r)
        res
    }
}

@SymbolName("sdl_kni_SDL_RectEmpty")
private external fun kni_SDL_RectEmpty(r: NativePtr): Int

fun SDL_RectEquals(a: CValuesRef<SDL_Rect>?, b: CValuesRef<SDL_Rect>?): SDL_bool {
    return memScoped {
        val _a = a?.getPointer(memScope).rawValue
        val _b = b?.getPointer(memScope).rawValue
        val res = kni_SDL_RectEquals(_a, _b)
        res
    }
}

@SymbolName("sdl_kni_SDL_RectEquals")
private external fun kni_SDL_RectEquals(a: NativePtr, b: NativePtr): Int

fun SDL_HasIntersection(A: CValuesRef<SDL_Rect>?, B: CValuesRef<SDL_Rect>?): SDL_bool {
    return memScoped {
        val _A = A?.getPointer(memScope).rawValue
        val _B = B?.getPointer(memScope).rawValue
        val res = kni_SDL_HasIntersection(_A, _B)
        res
    }
}

@SymbolName("sdl_kni_SDL_HasIntersection")
private external fun kni_SDL_HasIntersection(A: NativePtr, B: NativePtr): Int

fun SDL_IntersectRect(A: CValuesRef<SDL_Rect>?, B: CValuesRef<SDL_Rect>?, result: CValuesRef<SDL_Rect>?): SDL_bool {
    return memScoped {
        val _A = A?.getPointer(memScope).rawValue
        val _B = B?.getPointer(memScope).rawValue
        val _result = result?.getPointer(memScope).rawValue
        val res = kni_SDL_IntersectRect(_A, _B, _result)
        res
    }
}

@SymbolName("sdl_kni_SDL_IntersectRect")
private external fun kni_SDL_IntersectRect(A: NativePtr, B: NativePtr, result: NativePtr): Int

fun SDL_UnionRect(A: CValuesRef<SDL_Rect>?, B: CValuesRef<SDL_Rect>?, result: CValuesRef<SDL_Rect>?): Unit {
    return memScoped {
        val _A = A?.getPointer(memScope).rawValue
        val _B = B?.getPointer(memScope).rawValue
        val _result = result?.getPointer(memScope).rawValue
        val res = kni_SDL_UnionRect(_A, _B, _result)
        res
    }
}

@SymbolName("sdl_kni_SDL_UnionRect")
private external fun kni_SDL_UnionRect(A: NativePtr, B: NativePtr, result: NativePtr): Unit

fun SDL_EnclosePoints(points: CValuesRef<SDL_Point>?, count: Int, clip: CValuesRef<SDL_Rect>?, result: CValuesRef<SDL_Rect>?): SDL_bool {
    return memScoped {
        val _points = points?.getPointer(memScope).rawValue
        val _count = count
        val _clip = clip?.getPointer(memScope).rawValue
        val _result = result?.getPointer(memScope).rawValue
        val res = kni_SDL_EnclosePoints(_points, _count, _clip, _result)
        res
    }
}

@SymbolName("sdl_kni_SDL_EnclosePoints")
private external fun kni_SDL_EnclosePoints(points: NativePtr, count: Int, clip: NativePtr, result: NativePtr): Int

fun SDL_IntersectRectAndLine(rect: CValuesRef<SDL_Rect>?, X1: CValuesRef<IntVar>?, Y1: CValuesRef<IntVar>?, X2: CValuesRef<IntVar>?, Y2: CValuesRef<IntVar>?): SDL_bool {
    return memScoped {
        val _rect = rect?.getPointer(memScope).rawValue
        val _X1 = X1?.getPointer(memScope).rawValue
        val _Y1 = Y1?.getPointer(memScope).rawValue
        val _X2 = X2?.getPointer(memScope).rawValue
        val _Y2 = Y2?.getPointer(memScope).rawValue
        val res = kni_SDL_IntersectRectAndLine(_rect, _X1, _Y1, _X2, _Y2)
        res
    }
}

@SymbolName("sdl_kni_SDL_IntersectRectAndLine")
private external fun kni_SDL_IntersectRectAndLine(rect: NativePtr, X1: NativePtr, Y1: NativePtr, X2: NativePtr, Y2: NativePtr): Int

fun SDL_ComposeCustomBlendMode(srcColorFactor: SDL_BlendFactor, dstColorFactor: SDL_BlendFactor, colorOperation: SDL_BlendOperation, srcAlphaFactor: SDL_BlendFactor, dstAlphaFactor: SDL_BlendFactor, alphaOperation: SDL_BlendOperation): SDL_BlendMode {
    val _srcColorFactor = srcColorFactor
    val _dstColorFactor = dstColorFactor
    val _colorOperation = colorOperation
    val _srcAlphaFactor = srcAlphaFactor
    val _dstAlphaFactor = dstAlphaFactor
    val _alphaOperation = alphaOperation
    val res = kni_SDL_ComposeCustomBlendMode(_srcColorFactor, _dstColorFactor, _colorOperation, _srcAlphaFactor, _dstAlphaFactor, _alphaOperation)
    return res
}

@SymbolName("sdl_kni_SDL_ComposeCustomBlendMode")
private external fun kni_SDL_ComposeCustomBlendMode(srcColorFactor: Int, dstColorFactor: Int, colorOperation: Int, srcAlphaFactor: Int, dstAlphaFactor: Int, alphaOperation: Int): Int

fun SDL_CreateRGBSurface(flags: Uint32, width: Int, height: Int, depth: Int, Rmask: Uint32, Gmask: Uint32, Bmask: Uint32, Amask: Uint32): CPointer<SDL_Surface>? {
    val _flags = flags
    val _width = width
    val _height = height
    val _depth = depth
    val _Rmask = Rmask
    val _Gmask = Gmask
    val _Bmask = Bmask
    val _Amask = Amask
    val res = kni_SDL_CreateRGBSurface(_flags, _width, _height, _depth, _Rmask, _Gmask, _Bmask, _Amask)
    return interpretCPointer<SDL_Surface>(res)
}

@SymbolName("sdl_kni_SDL_CreateRGBSurface")
private external fun kni_SDL_CreateRGBSurface(flags: Int, width: Int, height: Int, depth: Int, Rmask: Int, Gmask: Int, Bmask: Int, Amask: Int): NativePtr

fun SDL_CreateRGBSurfaceWithFormat(flags: Uint32, width: Int, height: Int, depth: Int, format: Uint32): CPointer<SDL_Surface>? {
    val _flags = flags
    val _width = width
    val _height = height
    val _depth = depth
    val _format = format
    val res = kni_SDL_CreateRGBSurfaceWithFormat(_flags, _width, _height, _depth, _format)
    return interpretCPointer<SDL_Surface>(res)
}

@SymbolName("sdl_kni_SDL_CreateRGBSurfaceWithFormat")
private external fun kni_SDL_CreateRGBSurfaceWithFormat(flags: Int, width: Int, height: Int, depth: Int, format: Int): NativePtr

fun SDL_CreateRGBSurfaceFrom(pixels: COpaquePointer?, width: Int, height: Int, depth: Int, pitch: Int, Rmask: Uint32, Gmask: Uint32, Bmask: Uint32, Amask: Uint32): CPointer<SDL_Surface>? {
    val _pixels = pixels.rawValue
    val _width = width
    val _height = height
    val _depth = depth
    val _pitch = pitch
    val _Rmask = Rmask
    val _Gmask = Gmask
    val _Bmask = Bmask
    val _Amask = Amask
    val res = kni_SDL_CreateRGBSurfaceFrom(_pixels, _width, _height, _depth, _pitch, _Rmask, _Gmask, _Bmask, _Amask)
    return interpretCPointer<SDL_Surface>(res)
}

@SymbolName("sdl_kni_SDL_CreateRGBSurfaceFrom")
private external fun kni_SDL_CreateRGBSurfaceFrom(pixels: NativePtr, width: Int, height: Int, depth: Int, pitch: Int, Rmask: Int, Gmask: Int, Bmask: Int, Amask: Int): NativePtr

fun SDL_CreateRGBSurfaceWithFormatFrom(pixels: COpaquePointer?, width: Int, height: Int, depth: Int, pitch: Int, format: Uint32): CPointer<SDL_Surface>? {
    val _pixels = pixels.rawValue
    val _width = width
    val _height = height
    val _depth = depth
    val _pitch = pitch
    val _format = format
    val res = kni_SDL_CreateRGBSurfaceWithFormatFrom(_pixels, _width, _height, _depth, _pitch, _format)
    return interpretCPointer<SDL_Surface>(res)
}

@SymbolName("sdl_kni_SDL_CreateRGBSurfaceWithFormatFrom")
private external fun kni_SDL_CreateRGBSurfaceWithFormatFrom(pixels: NativePtr, width: Int, height: Int, depth: Int, pitch: Int, format: Int): NativePtr

fun SDL_FreeSurface(surface: CValuesRef<SDL_Surface>?): Unit {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val res = kni_SDL_FreeSurface(_surface)
        res
    }
}

@SymbolName("sdl_kni_SDL_FreeSurface")
private external fun kni_SDL_FreeSurface(surface: NativePtr): Unit

fun SDL_SetSurfacePalette(surface: CValuesRef<SDL_Surface>?, palette: CValuesRef<SDL_Palette>?): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _palette = palette?.getPointer(memScope).rawValue
        val res = kni_SDL_SetSurfacePalette(_surface, _palette)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetSurfacePalette")
private external fun kni_SDL_SetSurfacePalette(surface: NativePtr, palette: NativePtr): Int

fun SDL_LockSurface(surface: CValuesRef<SDL_Surface>?): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val res = kni_SDL_LockSurface(_surface)
        res
    }
}

@SymbolName("sdl_kni_SDL_LockSurface")
private external fun kni_SDL_LockSurface(surface: NativePtr): Int

fun SDL_UnlockSurface(surface: CValuesRef<SDL_Surface>?): Unit {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val res = kni_SDL_UnlockSurface(_surface)
        res
    }
}

@SymbolName("sdl_kni_SDL_UnlockSurface")
private external fun kni_SDL_UnlockSurface(surface: NativePtr): Unit

fun SDL_LoadBMP_RW(src: CValuesRef<SDL_RWops>?, freesrc: Int): CPointer<SDL_Surface>? {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val _freesrc = freesrc
        val res = kni_SDL_LoadBMP_RW(_src, _freesrc)
        interpretCPointer<SDL_Surface>(res)
    }
}

@SymbolName("sdl_kni_SDL_LoadBMP_RW")
private external fun kni_SDL_LoadBMP_RW(src: NativePtr, freesrc: Int): NativePtr

fun SDL_SaveBMP_RW(surface: CValuesRef<SDL_Surface>?, dst: CValuesRef<SDL_RWops>?, freedst: Int): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _dst = dst?.getPointer(memScope).rawValue
        val _freedst = freedst
        val res = kni_SDL_SaveBMP_RW(_surface, _dst, _freedst)
        res
    }
}

@SymbolName("sdl_kni_SDL_SaveBMP_RW")
private external fun kni_SDL_SaveBMP_RW(surface: NativePtr, dst: NativePtr, freedst: Int): Int

fun SDL_SetSurfaceRLE(surface: CValuesRef<SDL_Surface>?, flag: Int): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _flag = flag
        val res = kni_SDL_SetSurfaceRLE(_surface, _flag)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetSurfaceRLE")
private external fun kni_SDL_SetSurfaceRLE(surface: NativePtr, flag: Int): Int

fun SDL_SetColorKey(surface: CValuesRef<SDL_Surface>?, flag: Int, key: Uint32): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _flag = flag
        val _key = key
        val res = kni_SDL_SetColorKey(_surface, _flag, _key)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetColorKey")
private external fun kni_SDL_SetColorKey(surface: NativePtr, flag: Int, key: Int): Int

fun SDL_GetColorKey(surface: CValuesRef<SDL_Surface>?, key: CValuesRef<Uint32Var>?): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _key = key?.getPointer(memScope).rawValue
        val res = kni_SDL_GetColorKey(_surface, _key)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetColorKey")
private external fun kni_SDL_GetColorKey(surface: NativePtr, key: NativePtr): Int

fun SDL_SetSurfaceColorMod(surface: CValuesRef<SDL_Surface>?, r: Uint8, g: Uint8, b: Uint8): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _r = r
        val _g = g
        val _b = b
        val res = kni_SDL_SetSurfaceColorMod(_surface, _r, _g, _b)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetSurfaceColorMod")
private external fun kni_SDL_SetSurfaceColorMod(surface: NativePtr, r: Byte, g: Byte, b: Byte): Int

fun SDL_GetSurfaceColorMod(surface: CValuesRef<SDL_Surface>?, r: CValuesRef<Uint8Var>?, g: CValuesRef<Uint8Var>?, b: CValuesRef<Uint8Var>?): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _r = r?.getPointer(memScope).rawValue
        val _g = g?.getPointer(memScope).rawValue
        val _b = b?.getPointer(memScope).rawValue
        val res = kni_SDL_GetSurfaceColorMod(_surface, _r, _g, _b)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetSurfaceColorMod")
private external fun kni_SDL_GetSurfaceColorMod(surface: NativePtr, r: NativePtr, g: NativePtr, b: NativePtr): Int

fun SDL_SetSurfaceAlphaMod(surface: CValuesRef<SDL_Surface>?, alpha: Uint8): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _alpha = alpha
        val res = kni_SDL_SetSurfaceAlphaMod(_surface, _alpha)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetSurfaceAlphaMod")
private external fun kni_SDL_SetSurfaceAlphaMod(surface: NativePtr, alpha: Byte): Int

fun SDL_GetSurfaceAlphaMod(surface: CValuesRef<SDL_Surface>?, alpha: CValuesRef<Uint8Var>?): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _alpha = alpha?.getPointer(memScope).rawValue
        val res = kni_SDL_GetSurfaceAlphaMod(_surface, _alpha)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetSurfaceAlphaMod")
private external fun kni_SDL_GetSurfaceAlphaMod(surface: NativePtr, alpha: NativePtr): Int

fun SDL_SetSurfaceBlendMode(surface: CValuesRef<SDL_Surface>?, blendMode: SDL_BlendMode): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _blendMode = blendMode
        val res = kni_SDL_SetSurfaceBlendMode(_surface, _blendMode)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetSurfaceBlendMode")
private external fun kni_SDL_SetSurfaceBlendMode(surface: NativePtr, blendMode: Int): Int

fun SDL_GetSurfaceBlendMode(surface: CValuesRef<SDL_Surface>?, blendMode: CValuesRef<SDL_BlendModeVar>?): Int {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _blendMode = blendMode?.getPointer(memScope).rawValue
        val res = kni_SDL_GetSurfaceBlendMode(_surface, _blendMode)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetSurfaceBlendMode")
private external fun kni_SDL_GetSurfaceBlendMode(surface: NativePtr, blendMode: NativePtr): Int

fun SDL_SetClipRect(surface: CValuesRef<SDL_Surface>?, rect: CValuesRef<SDL_Rect>?): SDL_bool {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_SetClipRect(_surface, _rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetClipRect")
private external fun kni_SDL_SetClipRect(surface: NativePtr, rect: NativePtr): Int

fun SDL_GetClipRect(surface: CValuesRef<SDL_Surface>?, rect: CValuesRef<SDL_Rect>?): Unit {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_GetClipRect(_surface, _rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetClipRect")
private external fun kni_SDL_GetClipRect(surface: NativePtr, rect: NativePtr): Unit

fun SDL_DuplicateSurface(surface: CValuesRef<SDL_Surface>?): CPointer<SDL_Surface>? {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val res = kni_SDL_DuplicateSurface(_surface)
        interpretCPointer<SDL_Surface>(res)
    }
}

@SymbolName("sdl_kni_SDL_DuplicateSurface")
private external fun kni_SDL_DuplicateSurface(surface: NativePtr): NativePtr

fun SDL_ConvertSurface(src: CValuesRef<SDL_Surface>?, fmt: CValuesRef<SDL_PixelFormat>?, flags: Uint32): CPointer<SDL_Surface>? {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val _fmt = fmt?.getPointer(memScope).rawValue
        val _flags = flags
        val res = kni_SDL_ConvertSurface(_src, _fmt, _flags)
        interpretCPointer<SDL_Surface>(res)
    }
}

@SymbolName("sdl_kni_SDL_ConvertSurface")
private external fun kni_SDL_ConvertSurface(src: NativePtr, fmt: NativePtr, flags: Int): NativePtr

fun SDL_ConvertSurfaceFormat(src: CValuesRef<SDL_Surface>?, pixel_format: Uint32, flags: Uint32): CPointer<SDL_Surface>? {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val _pixel_format = pixel_format
        val _flags = flags
        val res = kni_SDL_ConvertSurfaceFormat(_src, _pixel_format, _flags)
        interpretCPointer<SDL_Surface>(res)
    }
}

@SymbolName("sdl_kni_SDL_ConvertSurfaceFormat")
private external fun kni_SDL_ConvertSurfaceFormat(src: NativePtr, pixel_format: Int, flags: Int): NativePtr

fun SDL_ConvertPixels(width: Int, height: Int, src_format: Uint32, src: COpaquePointer?, src_pitch: Int, dst_format: Uint32, dst: COpaquePointer?, dst_pitch: Int): Int {
    val _width = width
    val _height = height
    val _src_format = src_format
    val _src = src.rawValue
    val _src_pitch = src_pitch
    val _dst_format = dst_format
    val _dst = dst.rawValue
    val _dst_pitch = dst_pitch
    val res = kni_SDL_ConvertPixels(_width, _height, _src_format, _src, _src_pitch, _dst_format, _dst, _dst_pitch)
    return res
}

@SymbolName("sdl_kni_SDL_ConvertPixels")
private external fun kni_SDL_ConvertPixels(width: Int, height: Int, src_format: Int, src: NativePtr, src_pitch: Int, dst_format: Int, dst: NativePtr, dst_pitch: Int): Int

fun SDL_FillRect(dst: CValuesRef<SDL_Surface>?, rect: CValuesRef<SDL_Rect>?, color: Uint32): Int {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val _color = color
        val res = kni_SDL_FillRect(_dst, _rect, _color)
        res
    }
}

@SymbolName("sdl_kni_SDL_FillRect")
private external fun kni_SDL_FillRect(dst: NativePtr, rect: NativePtr, color: Int): Int

fun SDL_FillRects(dst: CValuesRef<SDL_Surface>?, rects: CValuesRef<SDL_Rect>?, count: Int, color: Uint32): Int {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val _rects = rects?.getPointer(memScope).rawValue
        val _count = count
        val _color = color
        val res = kni_SDL_FillRects(_dst, _rects, _count, _color)
        res
    }
}

@SymbolName("sdl_kni_SDL_FillRects")
private external fun kni_SDL_FillRects(dst: NativePtr, rects: NativePtr, count: Int, color: Int): Int

fun SDL_UpperBlit(src: CValuesRef<SDL_Surface>?, srcrect: CValuesRef<SDL_Rect>?, dst: CValuesRef<SDL_Surface>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val _srcrect = srcrect?.getPointer(memScope).rawValue
        val _dst = dst?.getPointer(memScope).rawValue
        val _dstrect = dstrect?.getPointer(memScope).rawValue
        val res = kni_SDL_UpperBlit(_src, _srcrect, _dst, _dstrect)
        res
    }
}

@SymbolName("sdl_kni_SDL_UpperBlit")
private external fun kni_SDL_UpperBlit(src: NativePtr, srcrect: NativePtr, dst: NativePtr, dstrect: NativePtr): Int

fun SDL_LowerBlit(src: CValuesRef<SDL_Surface>?, srcrect: CValuesRef<SDL_Rect>?, dst: CValuesRef<SDL_Surface>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val _srcrect = srcrect?.getPointer(memScope).rawValue
        val _dst = dst?.getPointer(memScope).rawValue
        val _dstrect = dstrect?.getPointer(memScope).rawValue
        val res = kni_SDL_LowerBlit(_src, _srcrect, _dst, _dstrect)
        res
    }
}

@SymbolName("sdl_kni_SDL_LowerBlit")
private external fun kni_SDL_LowerBlit(src: NativePtr, srcrect: NativePtr, dst: NativePtr, dstrect: NativePtr): Int

fun SDL_SoftStretch(src: CValuesRef<SDL_Surface>?, srcrect: CValuesRef<SDL_Rect>?, dst: CValuesRef<SDL_Surface>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val _srcrect = srcrect?.getPointer(memScope).rawValue
        val _dst = dst?.getPointer(memScope).rawValue
        val _dstrect = dstrect?.getPointer(memScope).rawValue
        val res = kni_SDL_SoftStretch(_src, _srcrect, _dst, _dstrect)
        res
    }
}

@SymbolName("sdl_kni_SDL_SoftStretch")
private external fun kni_SDL_SoftStretch(src: NativePtr, srcrect: NativePtr, dst: NativePtr, dstrect: NativePtr): Int

fun SDL_UpperBlitScaled(src: CValuesRef<SDL_Surface>?, srcrect: CValuesRef<SDL_Rect>?, dst: CValuesRef<SDL_Surface>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val _srcrect = srcrect?.getPointer(memScope).rawValue
        val _dst = dst?.getPointer(memScope).rawValue
        val _dstrect = dstrect?.getPointer(memScope).rawValue
        val res = kni_SDL_UpperBlitScaled(_src, _srcrect, _dst, _dstrect)
        res
    }
}

@SymbolName("sdl_kni_SDL_UpperBlitScaled")
private external fun kni_SDL_UpperBlitScaled(src: NativePtr, srcrect: NativePtr, dst: NativePtr, dstrect: NativePtr): Int

fun SDL_LowerBlitScaled(src: CValuesRef<SDL_Surface>?, srcrect: CValuesRef<SDL_Rect>?, dst: CValuesRef<SDL_Surface>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _src = src?.getPointer(memScope).rawValue
        val _srcrect = srcrect?.getPointer(memScope).rawValue
        val _dst = dst?.getPointer(memScope).rawValue
        val _dstrect = dstrect?.getPointer(memScope).rawValue
        val res = kni_SDL_LowerBlitScaled(_src, _srcrect, _dst, _dstrect)
        res
    }
}

@SymbolName("sdl_kni_SDL_LowerBlitScaled")
private external fun kni_SDL_LowerBlitScaled(src: NativePtr, srcrect: NativePtr, dst: NativePtr, dstrect: NativePtr): Int

fun SDL_GetNumVideoDrivers(): Int {
    val res = kni_SDL_GetNumVideoDrivers()
    return res
}

@SymbolName("sdl_kni_SDL_GetNumVideoDrivers")
private external fun kni_SDL_GetNumVideoDrivers(): Int

fun SDL_GetVideoDriver(index: Int): CPointer<ByteVar>? {
    val _index = index
    val res = kni_SDL_GetVideoDriver(_index)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetVideoDriver")
private external fun kni_SDL_GetVideoDriver(index: Int): NativePtr

fun SDL_VideoInit(driver_name: String?): Int {
    return memScoped {
        val _driver_name = driver_name?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_VideoInit(_driver_name)
        res
    }
}

@SymbolName("sdl_kni_SDL_VideoInit")
private external fun kni_SDL_VideoInit(driver_name: NativePtr): Int

fun SDL_VideoQuit(): Unit {
    val res = kni_SDL_VideoQuit()
    return res
}

@SymbolName("sdl_kni_SDL_VideoQuit")
private external fun kni_SDL_VideoQuit(): Unit

fun SDL_GetCurrentVideoDriver(): CPointer<ByteVar>? {
    val res = kni_SDL_GetCurrentVideoDriver()
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetCurrentVideoDriver")
private external fun kni_SDL_GetCurrentVideoDriver(): NativePtr

fun SDL_GetNumVideoDisplays(): Int {
    val res = kni_SDL_GetNumVideoDisplays()
    return res
}

@SymbolName("sdl_kni_SDL_GetNumVideoDisplays")
private external fun kni_SDL_GetNumVideoDisplays(): Int

fun SDL_GetDisplayName(displayIndex: Int): CPointer<ByteVar>? {
    val _displayIndex = displayIndex
    val res = kni_SDL_GetDisplayName(_displayIndex)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetDisplayName")
private external fun kni_SDL_GetDisplayName(displayIndex: Int): NativePtr

fun SDL_GetDisplayBounds(displayIndex: Int, rect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _displayIndex = displayIndex
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_GetDisplayBounds(_displayIndex, _rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetDisplayBounds")
private external fun kni_SDL_GetDisplayBounds(displayIndex: Int, rect: NativePtr): Int

fun SDL_GetDisplayDPI(displayIndex: Int, ddpi: CValuesRef<FloatVar>?, hdpi: CValuesRef<FloatVar>?, vdpi: CValuesRef<FloatVar>?): Int {
    return memScoped {
        val _displayIndex = displayIndex
        val _ddpi = ddpi?.getPointer(memScope).rawValue
        val _hdpi = hdpi?.getPointer(memScope).rawValue
        val _vdpi = vdpi?.getPointer(memScope).rawValue
        val res = kni_SDL_GetDisplayDPI(_displayIndex, _ddpi, _hdpi, _vdpi)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetDisplayDPI")
private external fun kni_SDL_GetDisplayDPI(displayIndex: Int, ddpi: NativePtr, hdpi: NativePtr, vdpi: NativePtr): Int

fun SDL_GetDisplayUsableBounds(displayIndex: Int, rect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _displayIndex = displayIndex
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_GetDisplayUsableBounds(_displayIndex, _rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetDisplayUsableBounds")
private external fun kni_SDL_GetDisplayUsableBounds(displayIndex: Int, rect: NativePtr): Int

fun SDL_GetNumDisplayModes(displayIndex: Int): Int {
    val _displayIndex = displayIndex
    val res = kni_SDL_GetNumDisplayModes(_displayIndex)
    return res
}

@SymbolName("sdl_kni_SDL_GetNumDisplayModes")
private external fun kni_SDL_GetNumDisplayModes(displayIndex: Int): Int

fun SDL_GetDisplayMode(displayIndex: Int, modeIndex: Int, mode: CValuesRef<SDL_DisplayMode>?): Int {
    return memScoped {
        val _displayIndex = displayIndex
        val _modeIndex = modeIndex
        val _mode = mode?.getPointer(memScope).rawValue
        val res = kni_SDL_GetDisplayMode(_displayIndex, _modeIndex, _mode)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetDisplayMode")
private external fun kni_SDL_GetDisplayMode(displayIndex: Int, modeIndex: Int, mode: NativePtr): Int

fun SDL_GetDesktopDisplayMode(displayIndex: Int, mode: CValuesRef<SDL_DisplayMode>?): Int {
    return memScoped {
        val _displayIndex = displayIndex
        val _mode = mode?.getPointer(memScope).rawValue
        val res = kni_SDL_GetDesktopDisplayMode(_displayIndex, _mode)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetDesktopDisplayMode")
private external fun kni_SDL_GetDesktopDisplayMode(displayIndex: Int, mode: NativePtr): Int

fun SDL_GetCurrentDisplayMode(displayIndex: Int, mode: CValuesRef<SDL_DisplayMode>?): Int {
    return memScoped {
        val _displayIndex = displayIndex
        val _mode = mode?.getPointer(memScope).rawValue
        val res = kni_SDL_GetCurrentDisplayMode(_displayIndex, _mode)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetCurrentDisplayMode")
private external fun kni_SDL_GetCurrentDisplayMode(displayIndex: Int, mode: NativePtr): Int

fun SDL_GetClosestDisplayMode(displayIndex: Int, mode: CValuesRef<SDL_DisplayMode>?, closest: CValuesRef<SDL_DisplayMode>?): CPointer<SDL_DisplayMode>? {
    return memScoped {
        val _displayIndex = displayIndex
        val _mode = mode?.getPointer(memScope).rawValue
        val _closest = closest?.getPointer(memScope).rawValue
        val res = kni_SDL_GetClosestDisplayMode(_displayIndex, _mode, _closest)
        interpretCPointer<SDL_DisplayMode>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetClosestDisplayMode")
private external fun kni_SDL_GetClosestDisplayMode(displayIndex: Int, mode: NativePtr, closest: NativePtr): NativePtr

fun SDL_GetWindowDisplayIndex(window: CValuesRef<SDL_Window>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowDisplayIndex(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowDisplayIndex")
private external fun kni_SDL_GetWindowDisplayIndex(window: NativePtr): Int

fun SDL_SetWindowDisplayMode(window: CValuesRef<SDL_Window>?, mode: CValuesRef<SDL_DisplayMode>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _mode = mode?.getPointer(memScope).rawValue
        val res = kni_SDL_SetWindowDisplayMode(_window, _mode)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowDisplayMode")
private external fun kni_SDL_SetWindowDisplayMode(window: NativePtr, mode: NativePtr): Int

fun SDL_GetWindowDisplayMode(window: CValuesRef<SDL_Window>?, mode: CValuesRef<SDL_DisplayMode>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _mode = mode?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowDisplayMode(_window, _mode)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowDisplayMode")
private external fun kni_SDL_GetWindowDisplayMode(window: NativePtr, mode: NativePtr): Int

fun SDL_GetWindowPixelFormat(window: CValuesRef<SDL_Window>?): Uint32 {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowPixelFormat(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowPixelFormat")
private external fun kni_SDL_GetWindowPixelFormat(window: NativePtr): Int

fun SDL_CreateWindow(title: String?, x: Int, y: Int, w: Int, h: Int, flags: Uint32): CPointer<SDL_Window>? {
    return memScoped {
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val _w = w
        val _h = h
        val _flags = flags
        val res = kni_SDL_CreateWindow(_title, _x, _y, _w, _h, _flags)
        interpretCPointer<SDL_Window>(res)
    }
}

@SymbolName("sdl_kni_SDL_CreateWindow")
private external fun kni_SDL_CreateWindow(title: NativePtr, x: Int, y: Int, w: Int, h: Int, flags: Int): NativePtr

fun SDL_CreateWindowFrom(data: COpaquePointer?): CPointer<SDL_Window>? {
    val _data = data.rawValue
    val res = kni_SDL_CreateWindowFrom(_data)
    return interpretCPointer<SDL_Window>(res)
}

@SymbolName("sdl_kni_SDL_CreateWindowFrom")
private external fun kni_SDL_CreateWindowFrom(data: NativePtr): NativePtr

fun SDL_GetWindowID(window: CValuesRef<SDL_Window>?): Uint32 {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowID(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowID")
private external fun kni_SDL_GetWindowID(window: NativePtr): Int

fun SDL_GetWindowFromID(id: Uint32): CPointer<SDL_Window>? {
    val _id = id
    val res = kni_SDL_GetWindowFromID(_id)
    return interpretCPointer<SDL_Window>(res)
}

@SymbolName("sdl_kni_SDL_GetWindowFromID")
private external fun kni_SDL_GetWindowFromID(id: Int): NativePtr

fun SDL_GetWindowFlags(window: CValuesRef<SDL_Window>?): Uint32 {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowFlags(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowFlags")
private external fun kni_SDL_GetWindowFlags(window: NativePtr): Int

fun SDL_SetWindowTitle(window: CValuesRef<SDL_Window>?, title: String?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_SetWindowTitle(_window, _title)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowTitle")
private external fun kni_SDL_SetWindowTitle(window: NativePtr, title: NativePtr): Unit

fun SDL_GetWindowTitle(window: CValuesRef<SDL_Window>?): CPointer<ByteVar>? {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowTitle(_window)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetWindowTitle")
private external fun kni_SDL_GetWindowTitle(window: NativePtr): NativePtr

fun SDL_SetWindowIcon(window: CValuesRef<SDL_Window>?, icon: CValuesRef<SDL_Surface>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _icon = icon?.getPointer(memScope).rawValue
        val res = kni_SDL_SetWindowIcon(_window, _icon)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowIcon")
private external fun kni_SDL_SetWindowIcon(window: NativePtr, icon: NativePtr): Unit

fun SDL_SetWindowData(window: CValuesRef<SDL_Window>?, name: String?, userdata: COpaquePointer?): COpaquePointer? {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _userdata = userdata.rawValue
        val res = kni_SDL_SetWindowData(_window, _name, _userdata)
        interpretCPointer<COpaque>(res)
    }
}

@SymbolName("sdl_kni_SDL_SetWindowData")
private external fun kni_SDL_SetWindowData(window: NativePtr, name: NativePtr, userdata: NativePtr): NativePtr

fun SDL_GetWindowData(window: CValuesRef<SDL_Window>?, name: String?): COpaquePointer? {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowData(_window, _name)
        interpretCPointer<COpaque>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetWindowData")
private external fun kni_SDL_GetWindowData(window: NativePtr, name: NativePtr): NativePtr

fun SDL_SetWindowPosition(window: CValuesRef<SDL_Window>?, x: Int, y: Int): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_SDL_SetWindowPosition(_window, _x, _y)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowPosition")
private external fun kni_SDL_SetWindowPosition(window: NativePtr, x: Int, y: Int): Unit

fun SDL_GetWindowPosition(window: CValuesRef<SDL_Window>?, x: CValuesRef<IntVar>?, y: CValuesRef<IntVar>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _x = x?.getPointer(memScope).rawValue
        val _y = y?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowPosition(_window, _x, _y)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowPosition")
private external fun kni_SDL_GetWindowPosition(window: NativePtr, x: NativePtr, y: NativePtr): Unit

fun SDL_SetWindowSize(window: CValuesRef<SDL_Window>?, w: Int, h: Int): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _w = w
        val _h = h
        val res = kni_SDL_SetWindowSize(_window, _w, _h)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowSize")
private external fun kni_SDL_SetWindowSize(window: NativePtr, w: Int, h: Int): Unit

fun SDL_GetWindowSize(window: CValuesRef<SDL_Window>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _w = w?.getPointer(memScope).rawValue
        val _h = h?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowSize(_window, _w, _h)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowSize")
private external fun kni_SDL_GetWindowSize(window: NativePtr, w: NativePtr, h: NativePtr): Unit

fun SDL_GetWindowBordersSize(window: CValuesRef<SDL_Window>?, top: CValuesRef<IntVar>?, left: CValuesRef<IntVar>?, bottom: CValuesRef<IntVar>?, right: CValuesRef<IntVar>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _top = top?.getPointer(memScope).rawValue
        val _left = left?.getPointer(memScope).rawValue
        val _bottom = bottom?.getPointer(memScope).rawValue
        val _right = right?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowBordersSize(_window, _top, _left, _bottom, _right)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowBordersSize")
private external fun kni_SDL_GetWindowBordersSize(window: NativePtr, top: NativePtr, left: NativePtr, bottom: NativePtr, right: NativePtr): Int

fun SDL_SetWindowMinimumSize(window: CValuesRef<SDL_Window>?, min_w: Int, min_h: Int): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _min_w = min_w
        val _min_h = min_h
        val res = kni_SDL_SetWindowMinimumSize(_window, _min_w, _min_h)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowMinimumSize")
private external fun kni_SDL_SetWindowMinimumSize(window: NativePtr, min_w: Int, min_h: Int): Unit

fun SDL_GetWindowMinimumSize(window: CValuesRef<SDL_Window>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _w = w?.getPointer(memScope).rawValue
        val _h = h?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowMinimumSize(_window, _w, _h)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowMinimumSize")
private external fun kni_SDL_GetWindowMinimumSize(window: NativePtr, w: NativePtr, h: NativePtr): Unit

fun SDL_SetWindowMaximumSize(window: CValuesRef<SDL_Window>?, max_w: Int, max_h: Int): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _max_w = max_w
        val _max_h = max_h
        val res = kni_SDL_SetWindowMaximumSize(_window, _max_w, _max_h)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowMaximumSize")
private external fun kni_SDL_SetWindowMaximumSize(window: NativePtr, max_w: Int, max_h: Int): Unit

fun SDL_GetWindowMaximumSize(window: CValuesRef<SDL_Window>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _w = w?.getPointer(memScope).rawValue
        val _h = h?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowMaximumSize(_window, _w, _h)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowMaximumSize")
private external fun kni_SDL_GetWindowMaximumSize(window: NativePtr, w: NativePtr, h: NativePtr): Unit

fun SDL_SetWindowBordered(window: CValuesRef<SDL_Window>?, bordered: SDL_bool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _bordered = bordered
        val res = kni_SDL_SetWindowBordered(_window, _bordered)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowBordered")
private external fun kni_SDL_SetWindowBordered(window: NativePtr, bordered: Int): Unit

fun SDL_SetWindowResizable(window: CValuesRef<SDL_Window>?, resizable: SDL_bool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _resizable = resizable
        val res = kni_SDL_SetWindowResizable(_window, _resizable)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowResizable")
private external fun kni_SDL_SetWindowResizable(window: NativePtr, resizable: Int): Unit

fun SDL_ShowWindow(window: CValuesRef<SDL_Window>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_ShowWindow(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_ShowWindow")
private external fun kni_SDL_ShowWindow(window: NativePtr): Unit

fun SDL_HideWindow(window: CValuesRef<SDL_Window>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_HideWindow(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_HideWindow")
private external fun kni_SDL_HideWindow(window: NativePtr): Unit

fun SDL_RaiseWindow(window: CValuesRef<SDL_Window>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_RaiseWindow(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_RaiseWindow")
private external fun kni_SDL_RaiseWindow(window: NativePtr): Unit

fun SDL_MaximizeWindow(window: CValuesRef<SDL_Window>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_MaximizeWindow(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_MaximizeWindow")
private external fun kni_SDL_MaximizeWindow(window: NativePtr): Unit

fun SDL_MinimizeWindow(window: CValuesRef<SDL_Window>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_MinimizeWindow(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_MinimizeWindow")
private external fun kni_SDL_MinimizeWindow(window: NativePtr): Unit

fun SDL_RestoreWindow(window: CValuesRef<SDL_Window>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_RestoreWindow(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_RestoreWindow")
private external fun kni_SDL_RestoreWindow(window: NativePtr): Unit

fun SDL_SetWindowFullscreen(window: CValuesRef<SDL_Window>?, flags: Uint32): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _flags = flags
        val res = kni_SDL_SetWindowFullscreen(_window, _flags)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowFullscreen")
private external fun kni_SDL_SetWindowFullscreen(window: NativePtr, flags: Int): Int

fun SDL_GetWindowSurface(window: CValuesRef<SDL_Window>?): CPointer<SDL_Surface>? {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowSurface(_window)
        interpretCPointer<SDL_Surface>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetWindowSurface")
private external fun kni_SDL_GetWindowSurface(window: NativePtr): NativePtr

fun SDL_UpdateWindowSurface(window: CValuesRef<SDL_Window>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_UpdateWindowSurface(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_UpdateWindowSurface")
private external fun kni_SDL_UpdateWindowSurface(window: NativePtr): Int

fun SDL_UpdateWindowSurfaceRects(window: CValuesRef<SDL_Window>?, rects: CValuesRef<SDL_Rect>?, numrects: Int): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _rects = rects?.getPointer(memScope).rawValue
        val _numrects = numrects
        val res = kni_SDL_UpdateWindowSurfaceRects(_window, _rects, _numrects)
        res
    }
}

@SymbolName("sdl_kni_SDL_UpdateWindowSurfaceRects")
private external fun kni_SDL_UpdateWindowSurfaceRects(window: NativePtr, rects: NativePtr, numrects: Int): Int

fun SDL_SetWindowGrab(window: CValuesRef<SDL_Window>?, grabbed: SDL_bool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _grabbed = grabbed
        val res = kni_SDL_SetWindowGrab(_window, _grabbed)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowGrab")
private external fun kni_SDL_SetWindowGrab(window: NativePtr, grabbed: Int): Unit

fun SDL_GetWindowGrab(window: CValuesRef<SDL_Window>?): SDL_bool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowGrab(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowGrab")
private external fun kni_SDL_GetWindowGrab(window: NativePtr): Int

fun SDL_GetGrabbedWindow(): CPointer<SDL_Window>? {
    val res = kni_SDL_GetGrabbedWindow()
    return interpretCPointer<SDL_Window>(res)
}

@SymbolName("sdl_kni_SDL_GetGrabbedWindow")
private external fun kni_SDL_GetGrabbedWindow(): NativePtr

fun SDL_SetWindowBrightness(window: CValuesRef<SDL_Window>?, brightness: Float): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _brightness = brightness
        val res = kni_SDL_SetWindowBrightness(_window, _brightness)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowBrightness")
private external fun kni_SDL_SetWindowBrightness(window: NativePtr, brightness: Float): Int

fun SDL_GetWindowBrightness(window: CValuesRef<SDL_Window>?): Float {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowBrightness(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowBrightness")
private external fun kni_SDL_GetWindowBrightness(window: NativePtr): Float

fun SDL_SetWindowOpacity(window: CValuesRef<SDL_Window>?, opacity: Float): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _opacity = opacity
        val res = kni_SDL_SetWindowOpacity(_window, _opacity)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowOpacity")
private external fun kni_SDL_SetWindowOpacity(window: NativePtr, opacity: Float): Int

fun SDL_GetWindowOpacity(window: CValuesRef<SDL_Window>?, out_opacity: CValuesRef<FloatVar>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _out_opacity = out_opacity?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowOpacity(_window, _out_opacity)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowOpacity")
private external fun kni_SDL_GetWindowOpacity(window: NativePtr, out_opacity: NativePtr): Int

fun SDL_SetWindowModalFor(modal_window: CValuesRef<SDL_Window>?, parent_window: CValuesRef<SDL_Window>?): Int {
    return memScoped {
        val _modal_window = modal_window?.getPointer(memScope).rawValue
        val _parent_window = parent_window?.getPointer(memScope).rawValue
        val res = kni_SDL_SetWindowModalFor(_modal_window, _parent_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowModalFor")
private external fun kni_SDL_SetWindowModalFor(modal_window: NativePtr, parent_window: NativePtr): Int

fun SDL_SetWindowInputFocus(window: CValuesRef<SDL_Window>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_SetWindowInputFocus(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowInputFocus")
private external fun kni_SDL_SetWindowInputFocus(window: NativePtr): Int

fun SDL_SetWindowGammaRamp(window: CValuesRef<SDL_Window>?, red: CValuesRef<Uint16Var>?, green: CValuesRef<Uint16Var>?, blue: CValuesRef<Uint16Var>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _red = red?.getPointer(memScope).rawValue
        val _green = green?.getPointer(memScope).rawValue
        val _blue = blue?.getPointer(memScope).rawValue
        val res = kni_SDL_SetWindowGammaRamp(_window, _red, _green, _blue)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowGammaRamp")
private external fun kni_SDL_SetWindowGammaRamp(window: NativePtr, red: NativePtr, green: NativePtr, blue: NativePtr): Int

fun SDL_GetWindowGammaRamp(window: CValuesRef<SDL_Window>?, red: CValuesRef<Uint16Var>?, green: CValuesRef<Uint16Var>?, blue: CValuesRef<Uint16Var>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _red = red?.getPointer(memScope).rawValue
        val _green = green?.getPointer(memScope).rawValue
        val _blue = blue?.getPointer(memScope).rawValue
        val res = kni_SDL_GetWindowGammaRamp(_window, _red, _green, _blue)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetWindowGammaRamp")
private external fun kni_SDL_GetWindowGammaRamp(window: NativePtr, red: NativePtr, green: NativePtr, blue: NativePtr): Int

fun SDL_SetWindowHitTest(window: CValuesRef<SDL_Window>?, callback: SDL_HitTest?, callback_data: COpaquePointer?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _callback = callback.rawValue
        val _callback_data = callback_data.rawValue
        val res = kni_SDL_SetWindowHitTest(_window, _callback, _callback_data)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowHitTest")
private external fun kni_SDL_SetWindowHitTest(window: NativePtr, callback: NativePtr, callback_data: NativePtr): Int

fun SDL_DestroyWindow(window: CValuesRef<SDL_Window>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_DestroyWindow(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_DestroyWindow")
private external fun kni_SDL_DestroyWindow(window: NativePtr): Unit

fun SDL_IsScreenSaverEnabled(): SDL_bool {
    val res = kni_SDL_IsScreenSaverEnabled()
    return res
}

@SymbolName("sdl_kni_SDL_IsScreenSaverEnabled")
private external fun kni_SDL_IsScreenSaverEnabled(): Int

fun SDL_EnableScreenSaver(): Unit {
    val res = kni_SDL_EnableScreenSaver()
    return res
}

@SymbolName("sdl_kni_SDL_EnableScreenSaver")
private external fun kni_SDL_EnableScreenSaver(): Unit

fun SDL_DisableScreenSaver(): Unit {
    val res = kni_SDL_DisableScreenSaver()
    return res
}

@SymbolName("sdl_kni_SDL_DisableScreenSaver")
private external fun kni_SDL_DisableScreenSaver(): Unit

fun SDL_GL_LoadLibrary(path: String?): Int {
    return memScoped {
        val _path = path?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GL_LoadLibrary(_path)
        res
    }
}

@SymbolName("sdl_kni_SDL_GL_LoadLibrary")
private external fun kni_SDL_GL_LoadLibrary(path: NativePtr): Int

fun SDL_GL_GetProcAddress(proc: String?): COpaquePointer? {
    return memScoped {
        val _proc = proc?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GL_GetProcAddress(_proc)
        interpretCPointer<COpaque>(res)
    }
}

@SymbolName("sdl_kni_SDL_GL_GetProcAddress")
private external fun kni_SDL_GL_GetProcAddress(proc: NativePtr): NativePtr

fun SDL_GL_UnloadLibrary(): Unit {
    val res = kni_SDL_GL_UnloadLibrary()
    return res
}

@SymbolName("sdl_kni_SDL_GL_UnloadLibrary")
private external fun kni_SDL_GL_UnloadLibrary(): Unit

fun SDL_GL_ExtensionSupported(extension: String?): SDL_bool {
    return memScoped {
        val _extension = extension?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GL_ExtensionSupported(_extension)
        res
    }
}

@SymbolName("sdl_kni_SDL_GL_ExtensionSupported")
private external fun kni_SDL_GL_ExtensionSupported(extension: NativePtr): Int

fun SDL_GL_ResetAttributes(): Unit {
    val res = kni_SDL_GL_ResetAttributes()
    return res
}

@SymbolName("sdl_kni_SDL_GL_ResetAttributes")
private external fun kni_SDL_GL_ResetAttributes(): Unit

fun SDL_GL_SetAttribute(attr: SDL_GLattr, value: Int): Int {
    val _attr = attr.value
    val _value = value
    val res = kni_SDL_GL_SetAttribute(_attr, _value)
    return res
}

@SymbolName("sdl_kni_SDL_GL_SetAttribute")
private external fun kni_SDL_GL_SetAttribute(attr: Int, value: Int): Int

fun SDL_GL_GetAttribute(attr: SDL_GLattr, value: CValuesRef<IntVar>?): Int {
    return memScoped {
        val _attr = attr.value
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_SDL_GL_GetAttribute(_attr, _value)
        res
    }
}

@SymbolName("sdl_kni_SDL_GL_GetAttribute")
private external fun kni_SDL_GL_GetAttribute(attr: Int, value: NativePtr): Int

fun SDL_GL_CreateContext(window: CValuesRef<SDL_Window>?): SDL_GLContext? {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GL_CreateContext(_window)
        interpretCPointer<COpaque>(res)
    }
}

@SymbolName("sdl_kni_SDL_GL_CreateContext")
private external fun kni_SDL_GL_CreateContext(window: NativePtr): NativePtr

fun SDL_GL_MakeCurrent(window: CValuesRef<SDL_Window>?, context: SDL_GLContext?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _context = context.rawValue
        val res = kni_SDL_GL_MakeCurrent(_window, _context)
        res
    }
}

@SymbolName("sdl_kni_SDL_GL_MakeCurrent")
private external fun kni_SDL_GL_MakeCurrent(window: NativePtr, context: NativePtr): Int

fun SDL_GL_GetCurrentWindow(): CPointer<SDL_Window>? {
    val res = kni_SDL_GL_GetCurrentWindow()
    return interpretCPointer<SDL_Window>(res)
}

@SymbolName("sdl_kni_SDL_GL_GetCurrentWindow")
private external fun kni_SDL_GL_GetCurrentWindow(): NativePtr

fun SDL_GL_GetCurrentContext(): SDL_GLContext? {
    val res = kni_SDL_GL_GetCurrentContext()
    return interpretCPointer<COpaque>(res)
}

@SymbolName("sdl_kni_SDL_GL_GetCurrentContext")
private external fun kni_SDL_GL_GetCurrentContext(): NativePtr

fun SDL_GL_GetDrawableSize(window: CValuesRef<SDL_Window>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _w = w?.getPointer(memScope).rawValue
        val _h = h?.getPointer(memScope).rawValue
        val res = kni_SDL_GL_GetDrawableSize(_window, _w, _h)
        res
    }
}

@SymbolName("sdl_kni_SDL_GL_GetDrawableSize")
private external fun kni_SDL_GL_GetDrawableSize(window: NativePtr, w: NativePtr, h: NativePtr): Unit

fun SDL_GL_SetSwapInterval(interval: Int): Int {
    val _interval = interval
    val res = kni_SDL_GL_SetSwapInterval(_interval)
    return res
}

@SymbolName("sdl_kni_SDL_GL_SetSwapInterval")
private external fun kni_SDL_GL_SetSwapInterval(interval: Int): Int

fun SDL_GL_GetSwapInterval(): Int {
    val res = kni_SDL_GL_GetSwapInterval()
    return res
}

@SymbolName("sdl_kni_SDL_GL_GetSwapInterval")
private external fun kni_SDL_GL_GetSwapInterval(): Int

fun SDL_GL_SwapWindow(window: CValuesRef<SDL_Window>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GL_SwapWindow(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_GL_SwapWindow")
private external fun kni_SDL_GL_SwapWindow(window: NativePtr): Unit

fun SDL_GL_DeleteContext(context: SDL_GLContext?): Unit {
    val _context = context.rawValue
    val res = kni_SDL_GL_DeleteContext(_context)
    return res
}

@SymbolName("sdl_kni_SDL_GL_DeleteContext")
private external fun kni_SDL_GL_DeleteContext(context: NativePtr): Unit

fun SDL_GetKeyboardFocus(): CPointer<SDL_Window>? {
    val res = kni_SDL_GetKeyboardFocus()
    return interpretCPointer<SDL_Window>(res)
}

@SymbolName("sdl_kni_SDL_GetKeyboardFocus")
private external fun kni_SDL_GetKeyboardFocus(): NativePtr

fun SDL_GetKeyboardState(numkeys: CValuesRef<IntVar>?): CPointer<Uint8Var>? {
    return memScoped {
        val _numkeys = numkeys?.getPointer(memScope).rawValue
        val res = kni_SDL_GetKeyboardState(_numkeys)
        interpretCPointer<Uint8Var>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetKeyboardState")
private external fun kni_SDL_GetKeyboardState(numkeys: NativePtr): NativePtr

fun SDL_GetModState(): SDL_Keymod {
    val res = kni_SDL_GetModState()
    return res
}

@SymbolName("sdl_kni_SDL_GetModState")
private external fun kni_SDL_GetModState(): Int

fun SDL_SetModState(modstate: SDL_Keymod): Unit {
    val _modstate = modstate
    val res = kni_SDL_SetModState(_modstate)
    return res
}

@SymbolName("sdl_kni_SDL_SetModState")
private external fun kni_SDL_SetModState(modstate: Int): Unit

fun SDL_GetKeyFromScancode(scancode: SDL_Scancode): SDL_Keycode {
    val _scancode = scancode
    val res = kni_SDL_GetKeyFromScancode(_scancode)
    return res
}

@SymbolName("sdl_kni_SDL_GetKeyFromScancode")
private external fun kni_SDL_GetKeyFromScancode(scancode: Int): Int

fun SDL_GetScancodeFromKey(key: SDL_Keycode): SDL_Scancode {
    val _key = key
    val res = kni_SDL_GetScancodeFromKey(_key)
    return res
}

@SymbolName("sdl_kni_SDL_GetScancodeFromKey")
private external fun kni_SDL_GetScancodeFromKey(key: Int): Int

fun SDL_GetScancodeName(scancode: SDL_Scancode): CPointer<ByteVar>? {
    val _scancode = scancode
    val res = kni_SDL_GetScancodeName(_scancode)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetScancodeName")
private external fun kni_SDL_GetScancodeName(scancode: Int): NativePtr

fun SDL_GetScancodeFromName(name: String?): SDL_Scancode {
    return memScoped {
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GetScancodeFromName(_name)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetScancodeFromName")
private external fun kni_SDL_GetScancodeFromName(name: NativePtr): Int

fun SDL_GetKeyName(key: SDL_Keycode): CPointer<ByteVar>? {
    val _key = key
    val res = kni_SDL_GetKeyName(_key)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetKeyName")
private external fun kni_SDL_GetKeyName(key: Int): NativePtr

fun SDL_GetKeyFromName(name: String?): SDL_Keycode {
    return memScoped {
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GetKeyFromName(_name)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetKeyFromName")
private external fun kni_SDL_GetKeyFromName(name: NativePtr): Int

fun SDL_StartTextInput(): Unit {
    val res = kni_SDL_StartTextInput()
    return res
}

@SymbolName("sdl_kni_SDL_StartTextInput")
private external fun kni_SDL_StartTextInput(): Unit

fun SDL_IsTextInputActive(): SDL_bool {
    val res = kni_SDL_IsTextInputActive()
    return res
}

@SymbolName("sdl_kni_SDL_IsTextInputActive")
private external fun kni_SDL_IsTextInputActive(): Int

fun SDL_StopTextInput(): Unit {
    val res = kni_SDL_StopTextInput()
    return res
}

@SymbolName("sdl_kni_SDL_StopTextInput")
private external fun kni_SDL_StopTextInput(): Unit

fun SDL_SetTextInputRect(rect: CValuesRef<SDL_Rect>?): Unit {
    return memScoped {
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_SetTextInputRect(_rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetTextInputRect")
private external fun kni_SDL_SetTextInputRect(rect: NativePtr): Unit

fun SDL_HasScreenKeyboardSupport(): SDL_bool {
    val res = kni_SDL_HasScreenKeyboardSupport()
    return res
}

@SymbolName("sdl_kni_SDL_HasScreenKeyboardSupport")
private external fun kni_SDL_HasScreenKeyboardSupport(): Int

fun SDL_IsScreenKeyboardShown(window: CValuesRef<SDL_Window>?): SDL_bool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_IsScreenKeyboardShown(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_IsScreenKeyboardShown")
private external fun kni_SDL_IsScreenKeyboardShown(window: NativePtr): Int

fun SDL_GetMouseFocus(): CPointer<SDL_Window>? {
    val res = kni_SDL_GetMouseFocus()
    return interpretCPointer<SDL_Window>(res)
}

@SymbolName("sdl_kni_SDL_GetMouseFocus")
private external fun kni_SDL_GetMouseFocus(): NativePtr

fun SDL_GetMouseState(x: CValuesRef<IntVar>?, y: CValuesRef<IntVar>?): Uint32 {
    return memScoped {
        val _x = x?.getPointer(memScope).rawValue
        val _y = y?.getPointer(memScope).rawValue
        val res = kni_SDL_GetMouseState(_x, _y)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetMouseState")
private external fun kni_SDL_GetMouseState(x: NativePtr, y: NativePtr): Int

fun SDL_GetGlobalMouseState(x: CValuesRef<IntVar>?, y: CValuesRef<IntVar>?): Uint32 {
    return memScoped {
        val _x = x?.getPointer(memScope).rawValue
        val _y = y?.getPointer(memScope).rawValue
        val res = kni_SDL_GetGlobalMouseState(_x, _y)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetGlobalMouseState")
private external fun kni_SDL_GetGlobalMouseState(x: NativePtr, y: NativePtr): Int

fun SDL_GetRelativeMouseState(x: CValuesRef<IntVar>?, y: CValuesRef<IntVar>?): Uint32 {
    return memScoped {
        val _x = x?.getPointer(memScope).rawValue
        val _y = y?.getPointer(memScope).rawValue
        val res = kni_SDL_GetRelativeMouseState(_x, _y)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetRelativeMouseState")
private external fun kni_SDL_GetRelativeMouseState(x: NativePtr, y: NativePtr): Int

fun SDL_WarpMouseInWindow(window: CValuesRef<SDL_Window>?, x: Int, y: Int): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_SDL_WarpMouseInWindow(_window, _x, _y)
        res
    }
}

@SymbolName("sdl_kni_SDL_WarpMouseInWindow")
private external fun kni_SDL_WarpMouseInWindow(window: NativePtr, x: Int, y: Int): Unit

fun SDL_WarpMouseGlobal(x: Int, y: Int): Int {
    val _x = x
    val _y = y
    val res = kni_SDL_WarpMouseGlobal(_x, _y)
    return res
}

@SymbolName("sdl_kni_SDL_WarpMouseGlobal")
private external fun kni_SDL_WarpMouseGlobal(x: Int, y: Int): Int

fun SDL_SetRelativeMouseMode(enabled: SDL_bool): Int {
    val _enabled = enabled
    val res = kni_SDL_SetRelativeMouseMode(_enabled)
    return res
}

@SymbolName("sdl_kni_SDL_SetRelativeMouseMode")
private external fun kni_SDL_SetRelativeMouseMode(enabled: Int): Int

fun SDL_CaptureMouse(enabled: SDL_bool): Int {
    val _enabled = enabled
    val res = kni_SDL_CaptureMouse(_enabled)
    return res
}

@SymbolName("sdl_kni_SDL_CaptureMouse")
private external fun kni_SDL_CaptureMouse(enabled: Int): Int

fun SDL_GetRelativeMouseMode(): SDL_bool {
    val res = kni_SDL_GetRelativeMouseMode()
    return res
}

@SymbolName("sdl_kni_SDL_GetRelativeMouseMode")
private external fun kni_SDL_GetRelativeMouseMode(): Int

fun SDL_CreateCursor(data: CValuesRef<Uint8Var>?, mask: CValuesRef<Uint8Var>?, w: Int, h: Int, hot_x: Int, hot_y: Int): CPointer<SDL_Cursor>? {
    return memScoped {
        val _data = data?.getPointer(memScope).rawValue
        val _mask = mask?.getPointer(memScope).rawValue
        val _w = w
        val _h = h
        val _hot_x = hot_x
        val _hot_y = hot_y
        val res = kni_SDL_CreateCursor(_data, _mask, _w, _h, _hot_x, _hot_y)
        interpretCPointer<SDL_Cursor>(res)
    }
}

@SymbolName("sdl_kni_SDL_CreateCursor")
private external fun kni_SDL_CreateCursor(data: NativePtr, mask: NativePtr, w: Int, h: Int, hot_x: Int, hot_y: Int): NativePtr

fun SDL_CreateColorCursor(surface: CValuesRef<SDL_Surface>?, hot_x: Int, hot_y: Int): CPointer<SDL_Cursor>? {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val _hot_x = hot_x
        val _hot_y = hot_y
        val res = kni_SDL_CreateColorCursor(_surface, _hot_x, _hot_y)
        interpretCPointer<SDL_Cursor>(res)
    }
}

@SymbolName("sdl_kni_SDL_CreateColorCursor")
private external fun kni_SDL_CreateColorCursor(surface: NativePtr, hot_x: Int, hot_y: Int): NativePtr

fun SDL_CreateSystemCursor(id: SDL_SystemCursor): CPointer<SDL_Cursor>? {
    val _id = id.value
    val res = kni_SDL_CreateSystemCursor(_id)
    return interpretCPointer<SDL_Cursor>(res)
}

@SymbolName("sdl_kni_SDL_CreateSystemCursor")
private external fun kni_SDL_CreateSystemCursor(id: Int): NativePtr

fun SDL_SetCursor(cursor: CValuesRef<SDL_Cursor>?): Unit {
    return memScoped {
        val _cursor = cursor?.getPointer(memScope).rawValue
        val res = kni_SDL_SetCursor(_cursor)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetCursor")
private external fun kni_SDL_SetCursor(cursor: NativePtr): Unit

fun SDL_GetCursor(): CPointer<SDL_Cursor>? {
    val res = kni_SDL_GetCursor()
    return interpretCPointer<SDL_Cursor>(res)
}

@SymbolName("sdl_kni_SDL_GetCursor")
private external fun kni_SDL_GetCursor(): NativePtr

fun SDL_GetDefaultCursor(): CPointer<SDL_Cursor>? {
    val res = kni_SDL_GetDefaultCursor()
    return interpretCPointer<SDL_Cursor>(res)
}

@SymbolName("sdl_kni_SDL_GetDefaultCursor")
private external fun kni_SDL_GetDefaultCursor(): NativePtr

fun SDL_FreeCursor(cursor: CValuesRef<SDL_Cursor>?): Unit {
    return memScoped {
        val _cursor = cursor?.getPointer(memScope).rawValue
        val res = kni_SDL_FreeCursor(_cursor)
        res
    }
}

@SymbolName("sdl_kni_SDL_FreeCursor")
private external fun kni_SDL_FreeCursor(cursor: NativePtr): Unit

fun SDL_ShowCursor(toggle: Int): Int {
    val _toggle = toggle
    val res = kni_SDL_ShowCursor(_toggle)
    return res
}

@SymbolName("sdl_kni_SDL_ShowCursor")
private external fun kni_SDL_ShowCursor(toggle: Int): Int

fun SDL_NumJoysticks(): Int {
    val res = kni_SDL_NumJoysticks()
    return res
}

@SymbolName("sdl_kni_SDL_NumJoysticks")
private external fun kni_SDL_NumJoysticks(): Int

fun SDL_JoystickNameForIndex(device_index: Int): CPointer<ByteVar>? {
    val _device_index = device_index
    val res = kni_SDL_JoystickNameForIndex(_device_index)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_JoystickNameForIndex")
private external fun kni_SDL_JoystickNameForIndex(device_index: Int): NativePtr

fun SDL_JoystickGetDeviceGUID(device_index: Int): CValue<SDL_JoystickGUID> {
    return memScoped {
        val _device_index = device_index
        val res = kni_SDL_JoystickGetDeviceGUID(_device_index, alloc<SDL_JoystickGUID>().rawPtr)
        interpretPointed<SDL_JoystickGUID>(res).readValue()
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetDeviceGUID")
private external fun kni_SDL_JoystickGetDeviceGUID(device_index: Int, retValPlacement: NativePtr): NativePtr

fun SDL_JoystickGetDeviceVendor(device_index: Int): Uint16 {
    val _device_index = device_index
    val res = kni_SDL_JoystickGetDeviceVendor(_device_index)
    return res
}

@SymbolName("sdl_kni_SDL_JoystickGetDeviceVendor")
private external fun kni_SDL_JoystickGetDeviceVendor(device_index: Int): Short

fun SDL_JoystickGetDeviceProduct(device_index: Int): Uint16 {
    val _device_index = device_index
    val res = kni_SDL_JoystickGetDeviceProduct(_device_index)
    return res
}

@SymbolName("sdl_kni_SDL_JoystickGetDeviceProduct")
private external fun kni_SDL_JoystickGetDeviceProduct(device_index: Int): Short

fun SDL_JoystickGetDeviceProductVersion(device_index: Int): Uint16 {
    val _device_index = device_index
    val res = kni_SDL_JoystickGetDeviceProductVersion(_device_index)
    return res
}

@SymbolName("sdl_kni_SDL_JoystickGetDeviceProductVersion")
private external fun kni_SDL_JoystickGetDeviceProductVersion(device_index: Int): Short

fun SDL_JoystickGetDeviceType(device_index: Int): SDL_JoystickType {
    val _device_index = device_index
    val res = kni_SDL_JoystickGetDeviceType(_device_index)
    return SDL_JoystickType.byValue(res)
}

@SymbolName("sdl_kni_SDL_JoystickGetDeviceType")
private external fun kni_SDL_JoystickGetDeviceType(device_index: Int): Int

fun SDL_JoystickGetDeviceInstanceID(device_index: Int): SDL_JoystickID {
    val _device_index = device_index
    val res = kni_SDL_JoystickGetDeviceInstanceID(_device_index)
    return res
}

@SymbolName("sdl_kni_SDL_JoystickGetDeviceInstanceID")
private external fun kni_SDL_JoystickGetDeviceInstanceID(device_index: Int): Int

fun SDL_JoystickOpen(device_index: Int): CPointer<SDL_Joystick>? {
    val _device_index = device_index
    val res = kni_SDL_JoystickOpen(_device_index)
    return interpretCPointer<SDL_Joystick>(res)
}

@SymbolName("sdl_kni_SDL_JoystickOpen")
private external fun kni_SDL_JoystickOpen(device_index: Int): NativePtr

fun SDL_JoystickFromInstanceID(joyid: SDL_JoystickID): CPointer<SDL_Joystick>? {
    val _joyid = joyid
    val res = kni_SDL_JoystickFromInstanceID(_joyid)
    return interpretCPointer<SDL_Joystick>(res)
}

@SymbolName("sdl_kni_SDL_JoystickFromInstanceID")
private external fun kni_SDL_JoystickFromInstanceID(joyid: Int): NativePtr

fun SDL_JoystickName(joystick: CValuesRef<SDL_Joystick>?): CPointer<ByteVar>? {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickName(_joystick)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_JoystickName")
private external fun kni_SDL_JoystickName(joystick: NativePtr): NativePtr

fun SDL_JoystickGetGUID(joystick: CValuesRef<SDL_Joystick>?): CValue<SDL_JoystickGUID> {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickGetGUID(_joystick, alloc<SDL_JoystickGUID>().rawPtr)
        interpretPointed<SDL_JoystickGUID>(res).readValue()
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetGUID")
private external fun kni_SDL_JoystickGetGUID(joystick: NativePtr, retValPlacement: NativePtr): NativePtr

fun SDL_JoystickGetVendor(joystick: CValuesRef<SDL_Joystick>?): Uint16 {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickGetVendor(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetVendor")
private external fun kni_SDL_JoystickGetVendor(joystick: NativePtr): Short

fun SDL_JoystickGetProduct(joystick: CValuesRef<SDL_Joystick>?): Uint16 {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickGetProduct(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetProduct")
private external fun kni_SDL_JoystickGetProduct(joystick: NativePtr): Short

fun SDL_JoystickGetProductVersion(joystick: CValuesRef<SDL_Joystick>?): Uint16 {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickGetProductVersion(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetProductVersion")
private external fun kni_SDL_JoystickGetProductVersion(joystick: NativePtr): Short

fun SDL_JoystickGetType(joystick: CValuesRef<SDL_Joystick>?): SDL_JoystickType {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickGetType(_joystick)
        SDL_JoystickType.byValue(res)
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetType")
private external fun kni_SDL_JoystickGetType(joystick: NativePtr): Int

fun SDL_JoystickGetGUIDString(guid: CValue<SDL_JoystickGUID>, pszGUID: CValuesRef<ByteVar>?, cbGUID: Int): Unit {
    return memScoped {
        val _guid = guid.getPointer(memScope).rawValue
        val _pszGUID = pszGUID?.getPointer(memScope).rawValue
        val _cbGUID = cbGUID
        val res = kni_SDL_JoystickGetGUIDString(_guid, _pszGUID, _cbGUID)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetGUIDString")
private external fun kni_SDL_JoystickGetGUIDString(guid: NativePtr, pszGUID: NativePtr, cbGUID: Int): Unit

fun SDL_JoystickGetGUIDFromString(pchGUID: String?): CValue<SDL_JoystickGUID> {
    return memScoped {
        val _pchGUID = pchGUID?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickGetGUIDFromString(_pchGUID, alloc<SDL_JoystickGUID>().rawPtr)
        interpretPointed<SDL_JoystickGUID>(res).readValue()
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetGUIDFromString")
private external fun kni_SDL_JoystickGetGUIDFromString(pchGUID: NativePtr, retValPlacement: NativePtr): NativePtr

fun SDL_JoystickGetAttached(joystick: CValuesRef<SDL_Joystick>?): SDL_bool {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickGetAttached(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetAttached")
private external fun kni_SDL_JoystickGetAttached(joystick: NativePtr): Int

fun SDL_JoystickInstanceID(joystick: CValuesRef<SDL_Joystick>?): SDL_JoystickID {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickInstanceID(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickInstanceID")
private external fun kni_SDL_JoystickInstanceID(joystick: NativePtr): Int

fun SDL_JoystickNumAxes(joystick: CValuesRef<SDL_Joystick>?): Int {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickNumAxes(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickNumAxes")
private external fun kni_SDL_JoystickNumAxes(joystick: NativePtr): Int

fun SDL_JoystickNumBalls(joystick: CValuesRef<SDL_Joystick>?): Int {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickNumBalls(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickNumBalls")
private external fun kni_SDL_JoystickNumBalls(joystick: NativePtr): Int

fun SDL_JoystickNumHats(joystick: CValuesRef<SDL_Joystick>?): Int {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickNumHats(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickNumHats")
private external fun kni_SDL_JoystickNumHats(joystick: NativePtr): Int

fun SDL_JoystickNumButtons(joystick: CValuesRef<SDL_Joystick>?): Int {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickNumButtons(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickNumButtons")
private external fun kni_SDL_JoystickNumButtons(joystick: NativePtr): Int

fun SDL_JoystickUpdate(): Unit {
    val res = kni_SDL_JoystickUpdate()
    return res
}

@SymbolName("sdl_kni_SDL_JoystickUpdate")
private external fun kni_SDL_JoystickUpdate(): Unit

fun SDL_JoystickEventState(state: Int): Int {
    val _state = state
    val res = kni_SDL_JoystickEventState(_state)
    return res
}

@SymbolName("sdl_kni_SDL_JoystickEventState")
private external fun kni_SDL_JoystickEventState(state: Int): Int

fun SDL_JoystickGetAxis(joystick: CValuesRef<SDL_Joystick>?, axis: Int): Sint16 {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val _axis = axis
        val res = kni_SDL_JoystickGetAxis(_joystick, _axis)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetAxis")
private external fun kni_SDL_JoystickGetAxis(joystick: NativePtr, axis: Int): Short

fun SDL_JoystickGetAxisInitialState(joystick: CValuesRef<SDL_Joystick>?, axis: Int, state: CValuesRef<Sint16Var>?): SDL_bool {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val _axis = axis
        val _state = state?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickGetAxisInitialState(_joystick, _axis, _state)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetAxisInitialState")
private external fun kni_SDL_JoystickGetAxisInitialState(joystick: NativePtr, axis: Int, state: NativePtr): Int

fun SDL_JoystickGetHat(joystick: CValuesRef<SDL_Joystick>?, hat: Int): Uint8 {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val _hat = hat
        val res = kni_SDL_JoystickGetHat(_joystick, _hat)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetHat")
private external fun kni_SDL_JoystickGetHat(joystick: NativePtr, hat: Int): Byte

fun SDL_JoystickGetBall(joystick: CValuesRef<SDL_Joystick>?, ball: Int, dx: CValuesRef<IntVar>?, dy: CValuesRef<IntVar>?): Int {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val _ball = ball
        val _dx = dx?.getPointer(memScope).rawValue
        val _dy = dy?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickGetBall(_joystick, _ball, _dx, _dy)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetBall")
private external fun kni_SDL_JoystickGetBall(joystick: NativePtr, ball: Int, dx: NativePtr, dy: NativePtr): Int

fun SDL_JoystickGetButton(joystick: CValuesRef<SDL_Joystick>?, button: Int): Uint8 {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val _button = button
        val res = kni_SDL_JoystickGetButton(_joystick, _button)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickGetButton")
private external fun kni_SDL_JoystickGetButton(joystick: NativePtr, button: Int): Byte

fun SDL_JoystickClose(joystick: CValuesRef<SDL_Joystick>?): Unit {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickClose(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickClose")
private external fun kni_SDL_JoystickClose(joystick: NativePtr): Unit

fun SDL_JoystickCurrentPowerLevel(joystick: CValuesRef<SDL_Joystick>?): SDL_JoystickPowerLevel {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickCurrentPowerLevel(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickCurrentPowerLevel")
private external fun kni_SDL_JoystickCurrentPowerLevel(joystick: NativePtr): Int

fun SDL_GameControllerAddMappingsFromRW(rw: CValuesRef<SDL_RWops>?, freerw: Int): Int {
    return memScoped {
        val _rw = rw?.getPointer(memScope).rawValue
        val _freerw = freerw
        val res = kni_SDL_GameControllerAddMappingsFromRW(_rw, _freerw)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerAddMappingsFromRW")
private external fun kni_SDL_GameControllerAddMappingsFromRW(rw: NativePtr, freerw: Int): Int

fun SDL_GameControllerAddMapping(mappingString: String?): Int {
    return memScoped {
        val _mappingString = mappingString?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerAddMapping(_mappingString)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerAddMapping")
private external fun kni_SDL_GameControllerAddMapping(mappingString: NativePtr): Int

fun SDL_GameControllerNumMappings(): Int {
    val res = kni_SDL_GameControllerNumMappings()
    return res
}

@SymbolName("sdl_kni_SDL_GameControllerNumMappings")
private external fun kni_SDL_GameControllerNumMappings(): Int

fun SDL_GameControllerMappingForIndex(mapping_index: Int): CPointer<ByteVar>? {
    val _mapping_index = mapping_index
    val res = kni_SDL_GameControllerMappingForIndex(_mapping_index)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GameControllerMappingForIndex")
private external fun kni_SDL_GameControllerMappingForIndex(mapping_index: Int): NativePtr

fun SDL_GameControllerMappingForGUID(guid: CValue<SDL_JoystickGUID>): CPointer<ByteVar>? {
    return memScoped {
        val _guid = guid.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerMappingForGUID(_guid)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_GameControllerMappingForGUID")
private external fun kni_SDL_GameControllerMappingForGUID(guid: NativePtr): NativePtr

fun SDL_GameControllerMapping(gamecontroller: CValuesRef<SDL_GameController>?): CPointer<ByteVar>? {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerMapping(_gamecontroller)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_GameControllerMapping")
private external fun kni_SDL_GameControllerMapping(gamecontroller: NativePtr): NativePtr

fun SDL_IsGameController(joystick_index: Int): SDL_bool {
    val _joystick_index = joystick_index
    val res = kni_SDL_IsGameController(_joystick_index)
    return res
}

@SymbolName("sdl_kni_SDL_IsGameController")
private external fun kni_SDL_IsGameController(joystick_index: Int): Int

fun SDL_GameControllerNameForIndex(joystick_index: Int): CPointer<ByteVar>? {
    val _joystick_index = joystick_index
    val res = kni_SDL_GameControllerNameForIndex(_joystick_index)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GameControllerNameForIndex")
private external fun kni_SDL_GameControllerNameForIndex(joystick_index: Int): NativePtr

fun SDL_GameControllerOpen(joystick_index: Int): CPointer<SDL_GameController>? {
    val _joystick_index = joystick_index
    val res = kni_SDL_GameControllerOpen(_joystick_index)
    return interpretCPointer<SDL_GameController>(res)
}

@SymbolName("sdl_kni_SDL_GameControllerOpen")
private external fun kni_SDL_GameControllerOpen(joystick_index: Int): NativePtr

fun SDL_GameControllerFromInstanceID(joyid: SDL_JoystickID): CPointer<SDL_GameController>? {
    val _joyid = joyid
    val res = kni_SDL_GameControllerFromInstanceID(_joyid)
    return interpretCPointer<SDL_GameController>(res)
}

@SymbolName("sdl_kni_SDL_GameControllerFromInstanceID")
private external fun kni_SDL_GameControllerFromInstanceID(joyid: Int): NativePtr

fun SDL_GameControllerName(gamecontroller: CValuesRef<SDL_GameController>?): CPointer<ByteVar>? {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerName(_gamecontroller)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_GameControllerName")
private external fun kni_SDL_GameControllerName(gamecontroller: NativePtr): NativePtr

fun SDL_GameControllerGetVendor(gamecontroller: CValuesRef<SDL_GameController>?): Uint16 {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerGetVendor(_gamecontroller)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetVendor")
private external fun kni_SDL_GameControllerGetVendor(gamecontroller: NativePtr): Short

fun SDL_GameControllerGetProduct(gamecontroller: CValuesRef<SDL_GameController>?): Uint16 {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerGetProduct(_gamecontroller)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetProduct")
private external fun kni_SDL_GameControllerGetProduct(gamecontroller: NativePtr): Short

fun SDL_GameControllerGetProductVersion(gamecontroller: CValuesRef<SDL_GameController>?): Uint16 {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerGetProductVersion(_gamecontroller)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetProductVersion")
private external fun kni_SDL_GameControllerGetProductVersion(gamecontroller: NativePtr): Short

fun SDL_GameControllerGetAttached(gamecontroller: CValuesRef<SDL_GameController>?): SDL_bool {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerGetAttached(_gamecontroller)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetAttached")
private external fun kni_SDL_GameControllerGetAttached(gamecontroller: NativePtr): Int

fun SDL_GameControllerGetJoystick(gamecontroller: CValuesRef<SDL_GameController>?): CPointer<SDL_Joystick>? {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerGetJoystick(_gamecontroller)
        interpretCPointer<SDL_Joystick>(res)
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetJoystick")
private external fun kni_SDL_GameControllerGetJoystick(gamecontroller: NativePtr): NativePtr

fun SDL_GameControllerEventState(state: Int): Int {
    val _state = state
    val res = kni_SDL_GameControllerEventState(_state)
    return res
}

@SymbolName("sdl_kni_SDL_GameControllerEventState")
private external fun kni_SDL_GameControllerEventState(state: Int): Int

fun SDL_GameControllerUpdate(): Unit {
    val res = kni_SDL_GameControllerUpdate()
    return res
}

@SymbolName("sdl_kni_SDL_GameControllerUpdate")
private external fun kni_SDL_GameControllerUpdate(): Unit

fun SDL_GameControllerGetAxisFromString(pchString: String?): SDL_GameControllerAxis {
    return memScoped {
        val _pchString = pchString?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerGetAxisFromString(_pchString)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetAxisFromString")
private external fun kni_SDL_GameControllerGetAxisFromString(pchString: NativePtr): Int

fun SDL_GameControllerGetStringForAxis(axis: SDL_GameControllerAxis): CPointer<ByteVar>? {
    val _axis = axis
    val res = kni_SDL_GameControllerGetStringForAxis(_axis)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GameControllerGetStringForAxis")
private external fun kni_SDL_GameControllerGetStringForAxis(axis: Int): NativePtr

fun SDL_GameControllerGetBindForAxis(gamecontroller: CValuesRef<SDL_GameController>?, axis: SDL_GameControllerAxis): CValue<SDL_GameControllerButtonBind> {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val _axis = axis
        val res = kni_SDL_GameControllerGetBindForAxis(_gamecontroller, _axis, alloc<SDL_GameControllerButtonBind>().rawPtr)
        interpretPointed<SDL_GameControllerButtonBind>(res).readValue()
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetBindForAxis")
private external fun kni_SDL_GameControllerGetBindForAxis(gamecontroller: NativePtr, axis: Int, retValPlacement: NativePtr): NativePtr

fun SDL_GameControllerGetAxis(gamecontroller: CValuesRef<SDL_GameController>?, axis: SDL_GameControllerAxis): Sint16 {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val _axis = axis
        val res = kni_SDL_GameControllerGetAxis(_gamecontroller, _axis)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetAxis")
private external fun kni_SDL_GameControllerGetAxis(gamecontroller: NativePtr, axis: Int): Short

fun SDL_GameControllerGetButtonFromString(pchString: String?): SDL_GameControllerButton {
    return memScoped {
        val _pchString = pchString?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerGetButtonFromString(_pchString)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetButtonFromString")
private external fun kni_SDL_GameControllerGetButtonFromString(pchString: NativePtr): Int

fun SDL_GameControllerGetStringForButton(button: SDL_GameControllerButton): CPointer<ByteVar>? {
    val _button = button
    val res = kni_SDL_GameControllerGetStringForButton(_button)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GameControllerGetStringForButton")
private external fun kni_SDL_GameControllerGetStringForButton(button: Int): NativePtr

fun SDL_GameControllerGetBindForButton(gamecontroller: CValuesRef<SDL_GameController>?, button: SDL_GameControllerButton): CValue<SDL_GameControllerButtonBind> {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val _button = button
        val res = kni_SDL_GameControllerGetBindForButton(_gamecontroller, _button, alloc<SDL_GameControllerButtonBind>().rawPtr)
        interpretPointed<SDL_GameControllerButtonBind>(res).readValue()
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetBindForButton")
private external fun kni_SDL_GameControllerGetBindForButton(gamecontroller: NativePtr, button: Int, retValPlacement: NativePtr): NativePtr

fun SDL_GameControllerGetButton(gamecontroller: CValuesRef<SDL_GameController>?, button: SDL_GameControllerButton): Uint8 {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val _button = button
        val res = kni_SDL_GameControllerGetButton(_gamecontroller, _button)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerGetButton")
private external fun kni_SDL_GameControllerGetButton(gamecontroller: NativePtr, button: Int): Byte

fun SDL_GameControllerClose(gamecontroller: CValuesRef<SDL_GameController>?): Unit {
    return memScoped {
        val _gamecontroller = gamecontroller?.getPointer(memScope).rawValue
        val res = kni_SDL_GameControllerClose(_gamecontroller)
        res
    }
}

@SymbolName("sdl_kni_SDL_GameControllerClose")
private external fun kni_SDL_GameControllerClose(gamecontroller: NativePtr): Unit

fun SDL_GetNumTouchDevices(): Int {
    val res = kni_SDL_GetNumTouchDevices()
    return res
}

@SymbolName("sdl_kni_SDL_GetNumTouchDevices")
private external fun kni_SDL_GetNumTouchDevices(): Int

fun SDL_GetTouchDevice(index: Int): SDL_TouchID {
    val _index = index
    val res = kni_SDL_GetTouchDevice(_index)
    return res
}

@SymbolName("sdl_kni_SDL_GetTouchDevice")
private external fun kni_SDL_GetTouchDevice(index: Int): Long

fun SDL_GetNumTouchFingers(touchID: SDL_TouchID): Int {
    val _touchID = touchID
    val res = kni_SDL_GetNumTouchFingers(_touchID)
    return res
}

@SymbolName("sdl_kni_SDL_GetNumTouchFingers")
private external fun kni_SDL_GetNumTouchFingers(touchID: Long): Int

fun SDL_GetTouchFinger(touchID: SDL_TouchID, index: Int): CPointer<SDL_Finger>? {
    val _touchID = touchID
    val _index = index
    val res = kni_SDL_GetTouchFinger(_touchID, _index)
    return interpretCPointer<SDL_Finger>(res)
}

@SymbolName("sdl_kni_SDL_GetTouchFinger")
private external fun kni_SDL_GetTouchFinger(touchID: Long, index: Int): NativePtr

fun SDL_RecordGesture(touchId: SDL_TouchID): Int {
    val _touchId = touchId
    val res = kni_SDL_RecordGesture(_touchId)
    return res
}

@SymbolName("sdl_kni_SDL_RecordGesture")
private external fun kni_SDL_RecordGesture(touchId: Long): Int

fun SDL_SaveAllDollarTemplates(dst: CValuesRef<SDL_RWops>?): Int {
    return memScoped {
        val _dst = dst?.getPointer(memScope).rawValue
        val res = kni_SDL_SaveAllDollarTemplates(_dst)
        res
    }
}

@SymbolName("sdl_kni_SDL_SaveAllDollarTemplates")
private external fun kni_SDL_SaveAllDollarTemplates(dst: NativePtr): Int

fun SDL_SaveDollarTemplate(gestureId: SDL_GestureID, dst: CValuesRef<SDL_RWops>?): Int {
    return memScoped {
        val _gestureId = gestureId
        val _dst = dst?.getPointer(memScope).rawValue
        val res = kni_SDL_SaveDollarTemplate(_gestureId, _dst)
        res
    }
}

@SymbolName("sdl_kni_SDL_SaveDollarTemplate")
private external fun kni_SDL_SaveDollarTemplate(gestureId: Long, dst: NativePtr): Int

fun SDL_LoadDollarTemplates(touchId: SDL_TouchID, src: CValuesRef<SDL_RWops>?): Int {
    return memScoped {
        val _touchId = touchId
        val _src = src?.getPointer(memScope).rawValue
        val res = kni_SDL_LoadDollarTemplates(_touchId, _src)
        res
    }
}

@SymbolName("sdl_kni_SDL_LoadDollarTemplates")
private external fun kni_SDL_LoadDollarTemplates(touchId: Long, src: NativePtr): Int

fun SDL_PumpEvents(): Unit {
    val res = kni_SDL_PumpEvents()
    return res
}

@SymbolName("sdl_kni_SDL_PumpEvents")
private external fun kni_SDL_PumpEvents(): Unit

fun SDL_PeepEvents(events: CValuesRef<SDL_Event>?, numevents: Int, action: SDL_eventaction, minType: Uint32, maxType: Uint32): Int {
    return memScoped {
        val _events = events?.getPointer(memScope).rawValue
        val _numevents = numevents
        val _action = action.value
        val _minType = minType
        val _maxType = maxType
        val res = kni_SDL_PeepEvents(_events, _numevents, _action, _minType, _maxType)
        res
    }
}

@SymbolName("sdl_kni_SDL_PeepEvents")
private external fun kni_SDL_PeepEvents(events: NativePtr, numevents: Int, action: Int, minType: Int, maxType: Int): Int

fun SDL_HasEvent(type: Uint32): SDL_bool {
    val _type = type
    val res = kni_SDL_HasEvent(_type)
    return res
}

@SymbolName("sdl_kni_SDL_HasEvent")
private external fun kni_SDL_HasEvent(type: Int): Int

fun SDL_HasEvents(minType: Uint32, maxType: Uint32): SDL_bool {
    val _minType = minType
    val _maxType = maxType
    val res = kni_SDL_HasEvents(_minType, _maxType)
    return res
}

@SymbolName("sdl_kni_SDL_HasEvents")
private external fun kni_SDL_HasEvents(minType: Int, maxType: Int): Int

fun SDL_FlushEvent(type: Uint32): Unit {
    val _type = type
    val res = kni_SDL_FlushEvent(_type)
    return res
}

@SymbolName("sdl_kni_SDL_FlushEvent")
private external fun kni_SDL_FlushEvent(type: Int): Unit

fun SDL_FlushEvents(minType: Uint32, maxType: Uint32): Unit {
    val _minType = minType
    val _maxType = maxType
    val res = kni_SDL_FlushEvents(_minType, _maxType)
    return res
}

@SymbolName("sdl_kni_SDL_FlushEvents")
private external fun kni_SDL_FlushEvents(minType: Int, maxType: Int): Unit

fun SDL_PollEvent(event: CValuesRef<SDL_Event>?): Int {
    return memScoped {
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_SDL_PollEvent(_event)
        res
    }
}

@SymbolName("sdl_kni_SDL_PollEvent")
private external fun kni_SDL_PollEvent(event: NativePtr): Int

fun SDL_WaitEvent(event: CValuesRef<SDL_Event>?): Int {
    return memScoped {
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_SDL_WaitEvent(_event)
        res
    }
}

@SymbolName("sdl_kni_SDL_WaitEvent")
private external fun kni_SDL_WaitEvent(event: NativePtr): Int

fun SDL_WaitEventTimeout(event: CValuesRef<SDL_Event>?, timeout: Int): Int {
    return memScoped {
        val _event = event?.getPointer(memScope).rawValue
        val _timeout = timeout
        val res = kni_SDL_WaitEventTimeout(_event, _timeout)
        res
    }
}

@SymbolName("sdl_kni_SDL_WaitEventTimeout")
private external fun kni_SDL_WaitEventTimeout(event: NativePtr, timeout: Int): Int

fun SDL_PushEvent(event: CValuesRef<SDL_Event>?): Int {
    return memScoped {
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_SDL_PushEvent(_event)
        res
    }
}

@SymbolName("sdl_kni_SDL_PushEvent")
private external fun kni_SDL_PushEvent(event: NativePtr): Int

fun SDL_SetEventFilter(filter: SDL_EventFilter?, userdata: COpaquePointer?): Unit {
    val _filter = filter.rawValue
    val _userdata = userdata.rawValue
    val res = kni_SDL_SetEventFilter(_filter, _userdata)
    return res
}

@SymbolName("sdl_kni_SDL_SetEventFilter")
private external fun kni_SDL_SetEventFilter(filter: NativePtr, userdata: NativePtr): Unit

fun SDL_GetEventFilter(filter: CValuesRef<SDL_EventFilterVar>?, userdata: CValuesRef<COpaquePointerVar>?): SDL_bool {
    return memScoped {
        val _filter = filter?.getPointer(memScope).rawValue
        val _userdata = userdata?.getPointer(memScope).rawValue
        val res = kni_SDL_GetEventFilter(_filter, _userdata)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetEventFilter")
private external fun kni_SDL_GetEventFilter(filter: NativePtr, userdata: NativePtr): Int

fun SDL_AddEventWatch(filter: SDL_EventFilter?, userdata: COpaquePointer?): Unit {
    val _filter = filter.rawValue
    val _userdata = userdata.rawValue
    val res = kni_SDL_AddEventWatch(_filter, _userdata)
    return res
}

@SymbolName("sdl_kni_SDL_AddEventWatch")
private external fun kni_SDL_AddEventWatch(filter: NativePtr, userdata: NativePtr): Unit

fun SDL_DelEventWatch(filter: SDL_EventFilter?, userdata: COpaquePointer?): Unit {
    val _filter = filter.rawValue
    val _userdata = userdata.rawValue
    val res = kni_SDL_DelEventWatch(_filter, _userdata)
    return res
}

@SymbolName("sdl_kni_SDL_DelEventWatch")
private external fun kni_SDL_DelEventWatch(filter: NativePtr, userdata: NativePtr): Unit

fun SDL_FilterEvents(filter: SDL_EventFilter?, userdata: COpaquePointer?): Unit {
    val _filter = filter.rawValue
    val _userdata = userdata.rawValue
    val res = kni_SDL_FilterEvents(_filter, _userdata)
    return res
}

@SymbolName("sdl_kni_SDL_FilterEvents")
private external fun kni_SDL_FilterEvents(filter: NativePtr, userdata: NativePtr): Unit

fun SDL_EventState(type: Uint32, state: Int): Uint8 {
    val _type = type
    val _state = state
    val res = kni_SDL_EventState(_type, _state)
    return res
}

@SymbolName("sdl_kni_SDL_EventState")
private external fun kni_SDL_EventState(type: Int, state: Int): Byte

fun SDL_RegisterEvents(numevents: Int): Uint32 {
    val _numevents = numevents
    val res = kni_SDL_RegisterEvents(_numevents)
    return res
}

@SymbolName("sdl_kni_SDL_RegisterEvents")
private external fun kni_SDL_RegisterEvents(numevents: Int): Int

fun SDL_GetBasePath(): CPointer<ByteVar>? {
    val res = kni_SDL_GetBasePath()
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetBasePath")
private external fun kni_SDL_GetBasePath(): NativePtr

fun SDL_GetPrefPath(org: String?, app: String?): CPointer<ByteVar>? {
    return memScoped {
        val _org = org?.cstr?.getPointer(memScope).rawValue
        val _app = app?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GetPrefPath(_org, _app)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetPrefPath")
private external fun kni_SDL_GetPrefPath(org: NativePtr, app: NativePtr): NativePtr

fun SDL_NumHaptics(): Int {
    val res = kni_SDL_NumHaptics()
    return res
}

@SymbolName("sdl_kni_SDL_NumHaptics")
private external fun kni_SDL_NumHaptics(): Int

fun SDL_HapticName(device_index: Int): CPointer<ByteVar>? {
    val _device_index = device_index
    val res = kni_SDL_HapticName(_device_index)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_HapticName")
private external fun kni_SDL_HapticName(device_index: Int): NativePtr

fun SDL_HapticOpen(device_index: Int): CPointer<SDL_Haptic>? {
    val _device_index = device_index
    val res = kni_SDL_HapticOpen(_device_index)
    return interpretCPointer<SDL_Haptic>(res)
}

@SymbolName("sdl_kni_SDL_HapticOpen")
private external fun kni_SDL_HapticOpen(device_index: Int): NativePtr

fun SDL_HapticOpened(device_index: Int): Int {
    val _device_index = device_index
    val res = kni_SDL_HapticOpened(_device_index)
    return res
}

@SymbolName("sdl_kni_SDL_HapticOpened")
private external fun kni_SDL_HapticOpened(device_index: Int): Int

fun SDL_HapticIndex(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticIndex(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticIndex")
private external fun kni_SDL_HapticIndex(haptic: NativePtr): Int

fun SDL_MouseIsHaptic(): Int {
    val res = kni_SDL_MouseIsHaptic()
    return res
}

@SymbolName("sdl_kni_SDL_MouseIsHaptic")
private external fun kni_SDL_MouseIsHaptic(): Int

fun SDL_HapticOpenFromMouse(): CPointer<SDL_Haptic>? {
    val res = kni_SDL_HapticOpenFromMouse()
    return interpretCPointer<SDL_Haptic>(res)
}

@SymbolName("sdl_kni_SDL_HapticOpenFromMouse")
private external fun kni_SDL_HapticOpenFromMouse(): NativePtr

fun SDL_JoystickIsHaptic(joystick: CValuesRef<SDL_Joystick>?): Int {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_JoystickIsHaptic(_joystick)
        res
    }
}

@SymbolName("sdl_kni_SDL_JoystickIsHaptic")
private external fun kni_SDL_JoystickIsHaptic(joystick: NativePtr): Int

fun SDL_HapticOpenFromJoystick(joystick: CValuesRef<SDL_Joystick>?): CPointer<SDL_Haptic>? {
    return memScoped {
        val _joystick = joystick?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticOpenFromJoystick(_joystick)
        interpretCPointer<SDL_Haptic>(res)
    }
}

@SymbolName("sdl_kni_SDL_HapticOpenFromJoystick")
private external fun kni_SDL_HapticOpenFromJoystick(joystick: NativePtr): NativePtr

fun SDL_HapticClose(haptic: CValuesRef<SDL_Haptic>?): Unit {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticClose(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticClose")
private external fun kni_SDL_HapticClose(haptic: NativePtr): Unit

fun SDL_HapticNumEffects(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticNumEffects(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticNumEffects")
private external fun kni_SDL_HapticNumEffects(haptic: NativePtr): Int

fun SDL_HapticNumEffectsPlaying(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticNumEffectsPlaying(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticNumEffectsPlaying")
private external fun kni_SDL_HapticNumEffectsPlaying(haptic: NativePtr): Int

fun SDL_HapticQuery(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticQuery(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticQuery")
private external fun kni_SDL_HapticQuery(haptic: NativePtr): Int

fun SDL_HapticNumAxes(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticNumAxes(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticNumAxes")
private external fun kni_SDL_HapticNumAxes(haptic: NativePtr): Int

fun SDL_HapticEffectSupported(haptic: CValuesRef<SDL_Haptic>?, effect: CValuesRef<SDL_HapticEffect>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val _effect = effect?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticEffectSupported(_haptic, _effect)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticEffectSupported")
private external fun kni_SDL_HapticEffectSupported(haptic: NativePtr, effect: NativePtr): Int

fun SDL_HapticNewEffect(haptic: CValuesRef<SDL_Haptic>?, effect: CValuesRef<SDL_HapticEffect>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val _effect = effect?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticNewEffect(_haptic, _effect)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticNewEffect")
private external fun kni_SDL_HapticNewEffect(haptic: NativePtr, effect: NativePtr): Int

fun SDL_HapticUpdateEffect(haptic: CValuesRef<SDL_Haptic>?, effect: Int, data: CValuesRef<SDL_HapticEffect>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val _effect = effect
        val _data = data?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticUpdateEffect(_haptic, _effect, _data)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticUpdateEffect")
private external fun kni_SDL_HapticUpdateEffect(haptic: NativePtr, effect: Int, data: NativePtr): Int

fun SDL_HapticRunEffect(haptic: CValuesRef<SDL_Haptic>?, effect: Int, iterations: Uint32): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val _effect = effect
        val _iterations = iterations
        val res = kni_SDL_HapticRunEffect(_haptic, _effect, _iterations)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticRunEffect")
private external fun kni_SDL_HapticRunEffect(haptic: NativePtr, effect: Int, iterations: Int): Int

fun SDL_HapticStopEffect(haptic: CValuesRef<SDL_Haptic>?, effect: Int): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val _effect = effect
        val res = kni_SDL_HapticStopEffect(_haptic, _effect)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticStopEffect")
private external fun kni_SDL_HapticStopEffect(haptic: NativePtr, effect: Int): Int

fun SDL_HapticDestroyEffect(haptic: CValuesRef<SDL_Haptic>?, effect: Int): Unit {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val _effect = effect
        val res = kni_SDL_HapticDestroyEffect(_haptic, _effect)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticDestroyEffect")
private external fun kni_SDL_HapticDestroyEffect(haptic: NativePtr, effect: Int): Unit

fun SDL_HapticGetEffectStatus(haptic: CValuesRef<SDL_Haptic>?, effect: Int): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val _effect = effect
        val res = kni_SDL_HapticGetEffectStatus(_haptic, _effect)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticGetEffectStatus")
private external fun kni_SDL_HapticGetEffectStatus(haptic: NativePtr, effect: Int): Int

fun SDL_HapticSetGain(haptic: CValuesRef<SDL_Haptic>?, gain: Int): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val _gain = gain
        val res = kni_SDL_HapticSetGain(_haptic, _gain)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticSetGain")
private external fun kni_SDL_HapticSetGain(haptic: NativePtr, gain: Int): Int

fun SDL_HapticSetAutocenter(haptic: CValuesRef<SDL_Haptic>?, autocenter: Int): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val _autocenter = autocenter
        val res = kni_SDL_HapticSetAutocenter(_haptic, _autocenter)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticSetAutocenter")
private external fun kni_SDL_HapticSetAutocenter(haptic: NativePtr, autocenter: Int): Int

fun SDL_HapticPause(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticPause(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticPause")
private external fun kni_SDL_HapticPause(haptic: NativePtr): Int

fun SDL_HapticUnpause(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticUnpause(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticUnpause")
private external fun kni_SDL_HapticUnpause(haptic: NativePtr): Int

fun SDL_HapticStopAll(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticStopAll(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticStopAll")
private external fun kni_SDL_HapticStopAll(haptic: NativePtr): Int

fun SDL_HapticRumbleSupported(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticRumbleSupported(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticRumbleSupported")
private external fun kni_SDL_HapticRumbleSupported(haptic: NativePtr): Int

fun SDL_HapticRumbleInit(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticRumbleInit(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticRumbleInit")
private external fun kni_SDL_HapticRumbleInit(haptic: NativePtr): Int

fun SDL_HapticRumblePlay(haptic: CValuesRef<SDL_Haptic>?, strength: Float, length: Uint32): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val _strength = strength
        val _length = length
        val res = kni_SDL_HapticRumblePlay(_haptic, _strength, _length)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticRumblePlay")
private external fun kni_SDL_HapticRumblePlay(haptic: NativePtr, strength: Float, length: Int): Int

fun SDL_HapticRumbleStop(haptic: CValuesRef<SDL_Haptic>?): Int {
    return memScoped {
        val _haptic = haptic?.getPointer(memScope).rawValue
        val res = kni_SDL_HapticRumbleStop(_haptic)
        res
    }
}

@SymbolName("sdl_kni_SDL_HapticRumbleStop")
private external fun kni_SDL_HapticRumbleStop(haptic: NativePtr): Int

fun SDL_SetHintWithPriority(name: String?, value: String?, priority: SDL_HintPriority): SDL_bool {
    return memScoped {
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _value = value?.cstr?.getPointer(memScope).rawValue
        val _priority = priority.value
        val res = kni_SDL_SetHintWithPriority(_name, _value, _priority)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetHintWithPriority")
private external fun kni_SDL_SetHintWithPriority(name: NativePtr, value: NativePtr, priority: Int): Int

fun SDL_SetHint(name: String?, value: String?): SDL_bool {
    return memScoped {
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _value = value?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_SetHint(_name, _value)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetHint")
private external fun kni_SDL_SetHint(name: NativePtr, value: NativePtr): Int

fun SDL_GetHint(name: String?): CPointer<ByteVar>? {
    return memScoped {
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_GetHint(_name)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetHint")
private external fun kni_SDL_GetHint(name: NativePtr): NativePtr

fun SDL_GetHintBoolean(name: String?, default_value: SDL_bool): SDL_bool {
    return memScoped {
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _default_value = default_value
        val res = kni_SDL_GetHintBoolean(_name, _default_value)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetHintBoolean")
private external fun kni_SDL_GetHintBoolean(name: NativePtr, default_value: Int): Int

fun SDL_AddHintCallback(name: String?, callback: SDL_HintCallback?, userdata: COpaquePointer?): Unit {
    return memScoped {
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _callback = callback.rawValue
        val _userdata = userdata.rawValue
        val res = kni_SDL_AddHintCallback(_name, _callback, _userdata)
        res
    }
}

@SymbolName("sdl_kni_SDL_AddHintCallback")
private external fun kni_SDL_AddHintCallback(name: NativePtr, callback: NativePtr, userdata: NativePtr): Unit

fun SDL_DelHintCallback(name: String?, callback: SDL_HintCallback?, userdata: COpaquePointer?): Unit {
    return memScoped {
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _callback = callback.rawValue
        val _userdata = userdata.rawValue
        val res = kni_SDL_DelHintCallback(_name, _callback, _userdata)
        res
    }
}

@SymbolName("sdl_kni_SDL_DelHintCallback")
private external fun kni_SDL_DelHintCallback(name: NativePtr, callback: NativePtr, userdata: NativePtr): Unit

fun SDL_ClearHints(): Unit {
    val res = kni_SDL_ClearHints()
    return res
}

@SymbolName("sdl_kni_SDL_ClearHints")
private external fun kni_SDL_ClearHints(): Unit

fun SDL_LoadObject(sofile: String?): COpaquePointer? {
    return memScoped {
        val _sofile = sofile?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_LoadObject(_sofile)
        interpretCPointer<COpaque>(res)
    }
}

@SymbolName("sdl_kni_SDL_LoadObject")
private external fun kni_SDL_LoadObject(sofile: NativePtr): NativePtr

fun SDL_LoadFunction(handle: COpaquePointer?, name: String?): COpaquePointer? {
    return memScoped {
        val _handle = handle.rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_SDL_LoadFunction(_handle, _name)
        interpretCPointer<COpaque>(res)
    }
}

@SymbolName("sdl_kni_SDL_LoadFunction")
private external fun kni_SDL_LoadFunction(handle: NativePtr, name: NativePtr): NativePtr

fun SDL_UnloadObject(handle: COpaquePointer?): Unit {
    val _handle = handle.rawValue
    val res = kni_SDL_UnloadObject(_handle)
    return res
}

@SymbolName("sdl_kni_SDL_UnloadObject")
private external fun kni_SDL_UnloadObject(handle: NativePtr): Unit

fun SDL_LogSetAllPriority(priority: SDL_LogPriority): Unit {
    val _priority = priority
    val res = kni_SDL_LogSetAllPriority(_priority)
    return res
}

@SymbolName("sdl_kni_SDL_LogSetAllPriority")
private external fun kni_SDL_LogSetAllPriority(priority: Int): Unit

fun SDL_LogSetPriority(category: Int, priority: SDL_LogPriority): Unit {
    val _category = category
    val _priority = priority
    val res = kni_SDL_LogSetPriority(_category, _priority)
    return res
}

@SymbolName("sdl_kni_SDL_LogSetPriority")
private external fun kni_SDL_LogSetPriority(category: Int, priority: Int): Unit

fun SDL_LogGetPriority(category: Int): SDL_LogPriority {
    val _category = category
    val res = kni_SDL_LogGetPriority(_category)
    return res
}

@SymbolName("sdl_kni_SDL_LogGetPriority")
private external fun kni_SDL_LogGetPriority(category: Int): Int

fun SDL_LogResetPriorities(): Unit {
    val res = kni_SDL_LogResetPriorities()
    return res
}

@SymbolName("sdl_kni_SDL_LogResetPriorities")
private external fun kni_SDL_LogResetPriorities(): Unit

fun SDL_LogGetOutputFunction(callback: CValuesRef<SDL_LogOutputFunctionVar>?, userdata: CValuesRef<COpaquePointerVar>?): Unit {
    return memScoped {
        val _callback = callback?.getPointer(memScope).rawValue
        val _userdata = userdata?.getPointer(memScope).rawValue
        val res = kni_SDL_LogGetOutputFunction(_callback, _userdata)
        res
    }
}

@SymbolName("sdl_kni_SDL_LogGetOutputFunction")
private external fun kni_SDL_LogGetOutputFunction(callback: NativePtr, userdata: NativePtr): Unit

fun SDL_LogSetOutputFunction(callback: SDL_LogOutputFunction?, userdata: COpaquePointer?): Unit {
    val _callback = callback.rawValue
    val _userdata = userdata.rawValue
    val res = kni_SDL_LogSetOutputFunction(_callback, _userdata)
    return res
}

@SymbolName("sdl_kni_SDL_LogSetOutputFunction")
private external fun kni_SDL_LogSetOutputFunction(callback: NativePtr, userdata: NativePtr): Unit

fun SDL_ShowMessageBox(messageboxdata: CValuesRef<SDL_MessageBoxData>?, buttonid: CValuesRef<IntVar>?): Int {
    return memScoped {
        val _messageboxdata = messageboxdata?.getPointer(memScope).rawValue
        val _buttonid = buttonid?.getPointer(memScope).rawValue
        val res = kni_SDL_ShowMessageBox(_messageboxdata, _buttonid)
        res
    }
}

@SymbolName("sdl_kni_SDL_ShowMessageBox")
private external fun kni_SDL_ShowMessageBox(messageboxdata: NativePtr, buttonid: NativePtr): Int

fun SDL_ShowSimpleMessageBox(flags: Uint32, title: String?, message: String?, window: CValuesRef<SDL_Window>?): Int {
    return memScoped {
        val _flags = flags
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val _message = message?.cstr?.getPointer(memScope).rawValue
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_ShowSimpleMessageBox(_flags, _title, _message, _window)
        res
    }
}

@SymbolName("sdl_kni_SDL_ShowSimpleMessageBox")
private external fun kni_SDL_ShowSimpleMessageBox(flags: Int, title: NativePtr, message: NativePtr, window: NativePtr): Int

fun SDL_GetPowerInfo(secs: CValuesRef<IntVar>?, pct: CValuesRef<IntVar>?): SDL_PowerState {
    return memScoped {
        val _secs = secs?.getPointer(memScope).rawValue
        val _pct = pct?.getPointer(memScope).rawValue
        val res = kni_SDL_GetPowerInfo(_secs, _pct)
        SDL_PowerState.byValue(res)
    }
}

@SymbolName("sdl_kni_SDL_GetPowerInfo")
private external fun kni_SDL_GetPowerInfo(secs: NativePtr, pct: NativePtr): Int

fun SDL_GetNumRenderDrivers(): Int {
    val res = kni_SDL_GetNumRenderDrivers()
    return res
}

@SymbolName("sdl_kni_SDL_GetNumRenderDrivers")
private external fun kni_SDL_GetNumRenderDrivers(): Int

fun SDL_GetRenderDriverInfo(index: Int, info: CValuesRef<SDL_RendererInfo>?): Int {
    return memScoped {
        val _index = index
        val _info = info?.getPointer(memScope).rawValue
        val res = kni_SDL_GetRenderDriverInfo(_index, _info)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetRenderDriverInfo")
private external fun kni_SDL_GetRenderDriverInfo(index: Int, info: NativePtr): Int

fun SDL_CreateWindowAndRenderer(width: Int, height: Int, window_flags: Uint32, window: CValuesRef<CPointerVar<SDL_Window>>?, renderer: CValuesRef<CPointerVar<SDL_Renderer>>?): Int {
    return memScoped {
        val _width = width
        val _height = height
        val _window_flags = window_flags
        val _window = window?.getPointer(memScope).rawValue
        val _renderer = renderer?.getPointer(memScope).rawValue
        val res = kni_SDL_CreateWindowAndRenderer(_width, _height, _window_flags, _window, _renderer)
        res
    }
}

@SymbolName("sdl_kni_SDL_CreateWindowAndRenderer")
private external fun kni_SDL_CreateWindowAndRenderer(width: Int, height: Int, window_flags: Int, window: NativePtr, renderer: NativePtr): Int

fun SDL_CreateRenderer(window: CValuesRef<SDL_Window>?, index: Int, flags: Uint32): CPointer<SDL_Renderer>? {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _index = index
        val _flags = flags
        val res = kni_SDL_CreateRenderer(_window, _index, _flags)
        interpretCPointer<SDL_Renderer>(res)
    }
}

@SymbolName("sdl_kni_SDL_CreateRenderer")
private external fun kni_SDL_CreateRenderer(window: NativePtr, index: Int, flags: Int): NativePtr

fun SDL_CreateSoftwareRenderer(surface: CValuesRef<SDL_Surface>?): CPointer<SDL_Renderer>? {
    return memScoped {
        val _surface = surface?.getPointer(memScope).rawValue
        val res = kni_SDL_CreateSoftwareRenderer(_surface)
        interpretCPointer<SDL_Renderer>(res)
    }
}

@SymbolName("sdl_kni_SDL_CreateSoftwareRenderer")
private external fun kni_SDL_CreateSoftwareRenderer(surface: NativePtr): NativePtr

fun SDL_GetRenderer(window: CValuesRef<SDL_Window>?): CPointer<SDL_Renderer>? {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_GetRenderer(_window)
        interpretCPointer<SDL_Renderer>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetRenderer")
private external fun kni_SDL_GetRenderer(window: NativePtr): NativePtr

fun SDL_GetRendererInfo(renderer: CValuesRef<SDL_Renderer>?, info: CValuesRef<SDL_RendererInfo>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _info = info?.getPointer(memScope).rawValue
        val res = kni_SDL_GetRendererInfo(_renderer, _info)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetRendererInfo")
private external fun kni_SDL_GetRendererInfo(renderer: NativePtr, info: NativePtr): Int

fun SDL_GetRendererOutputSize(renderer: CValuesRef<SDL_Renderer>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _w = w?.getPointer(memScope).rawValue
        val _h = h?.getPointer(memScope).rawValue
        val res = kni_SDL_GetRendererOutputSize(_renderer, _w, _h)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetRendererOutputSize")
private external fun kni_SDL_GetRendererOutputSize(renderer: NativePtr, w: NativePtr, h: NativePtr): Int

fun SDL_CreateTexture(renderer: CValuesRef<SDL_Renderer>?, format: Uint32, access: Int, w: Int, h: Int): CPointer<SDL_Texture>? {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _format = format
        val _access = access
        val _w = w
        val _h = h
        val res = kni_SDL_CreateTexture(_renderer, _format, _access, _w, _h)
        interpretCPointer<SDL_Texture>(res)
    }
}

@SymbolName("sdl_kni_SDL_CreateTexture")
private external fun kni_SDL_CreateTexture(renderer: NativePtr, format: Int, access: Int, w: Int, h: Int): NativePtr

fun SDL_CreateTextureFromSurface(renderer: CValuesRef<SDL_Renderer>?, surface: CValuesRef<SDL_Surface>?): CPointer<SDL_Texture>? {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _surface = surface?.getPointer(memScope).rawValue
        val res = kni_SDL_CreateTextureFromSurface(_renderer, _surface)
        interpretCPointer<SDL_Texture>(res)
    }
}

@SymbolName("sdl_kni_SDL_CreateTextureFromSurface")
private external fun kni_SDL_CreateTextureFromSurface(renderer: NativePtr, surface: NativePtr): NativePtr

fun SDL_QueryTexture(texture: CValuesRef<SDL_Texture>?, format: CValuesRef<Uint32Var>?, access: CValuesRef<IntVar>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _format = format?.getPointer(memScope).rawValue
        val _access = access?.getPointer(memScope).rawValue
        val _w = w?.getPointer(memScope).rawValue
        val _h = h?.getPointer(memScope).rawValue
        val res = kni_SDL_QueryTexture(_texture, _format, _access, _w, _h)
        res
    }
}

@SymbolName("sdl_kni_SDL_QueryTexture")
private external fun kni_SDL_QueryTexture(texture: NativePtr, format: NativePtr, access: NativePtr, w: NativePtr, h: NativePtr): Int

fun SDL_SetTextureColorMod(texture: CValuesRef<SDL_Texture>?, r: Uint8, g: Uint8, b: Uint8): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _r = r
        val _g = g
        val _b = b
        val res = kni_SDL_SetTextureColorMod(_texture, _r, _g, _b)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetTextureColorMod")
private external fun kni_SDL_SetTextureColorMod(texture: NativePtr, r: Byte, g: Byte, b: Byte): Int

fun SDL_GetTextureColorMod(texture: CValuesRef<SDL_Texture>?, r: CValuesRef<Uint8Var>?, g: CValuesRef<Uint8Var>?, b: CValuesRef<Uint8Var>?): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _r = r?.getPointer(memScope).rawValue
        val _g = g?.getPointer(memScope).rawValue
        val _b = b?.getPointer(memScope).rawValue
        val res = kni_SDL_GetTextureColorMod(_texture, _r, _g, _b)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetTextureColorMod")
private external fun kni_SDL_GetTextureColorMod(texture: NativePtr, r: NativePtr, g: NativePtr, b: NativePtr): Int

fun SDL_SetTextureAlphaMod(texture: CValuesRef<SDL_Texture>?, alpha: Uint8): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _alpha = alpha
        val res = kni_SDL_SetTextureAlphaMod(_texture, _alpha)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetTextureAlphaMod")
private external fun kni_SDL_SetTextureAlphaMod(texture: NativePtr, alpha: Byte): Int

fun SDL_GetTextureAlphaMod(texture: CValuesRef<SDL_Texture>?, alpha: CValuesRef<Uint8Var>?): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _alpha = alpha?.getPointer(memScope).rawValue
        val res = kni_SDL_GetTextureAlphaMod(_texture, _alpha)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetTextureAlphaMod")
private external fun kni_SDL_GetTextureAlphaMod(texture: NativePtr, alpha: NativePtr): Int

fun SDL_SetTextureBlendMode(texture: CValuesRef<SDL_Texture>?, blendMode: SDL_BlendMode): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _blendMode = blendMode
        val res = kni_SDL_SetTextureBlendMode(_texture, _blendMode)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetTextureBlendMode")
private external fun kni_SDL_SetTextureBlendMode(texture: NativePtr, blendMode: Int): Int

fun SDL_GetTextureBlendMode(texture: CValuesRef<SDL_Texture>?, blendMode: CValuesRef<SDL_BlendModeVar>?): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _blendMode = blendMode?.getPointer(memScope).rawValue
        val res = kni_SDL_GetTextureBlendMode(_texture, _blendMode)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetTextureBlendMode")
private external fun kni_SDL_GetTextureBlendMode(texture: NativePtr, blendMode: NativePtr): Int

fun SDL_UpdateTexture(texture: CValuesRef<SDL_Texture>?, rect: CValuesRef<SDL_Rect>?, pixels: COpaquePointer?, pitch: Int): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val _pixels = pixels.rawValue
        val _pitch = pitch
        val res = kni_SDL_UpdateTexture(_texture, _rect, _pixels, _pitch)
        res
    }
}

@SymbolName("sdl_kni_SDL_UpdateTexture")
private external fun kni_SDL_UpdateTexture(texture: NativePtr, rect: NativePtr, pixels: NativePtr, pitch: Int): Int

fun SDL_UpdateYUVTexture(texture: CValuesRef<SDL_Texture>?, rect: CValuesRef<SDL_Rect>?, Yplane: CValuesRef<Uint8Var>?, Ypitch: Int, Uplane: CValuesRef<Uint8Var>?, Upitch: Int, Vplane: CValuesRef<Uint8Var>?, Vpitch: Int): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val _Yplane = Yplane?.getPointer(memScope).rawValue
        val _Ypitch = Ypitch
        val _Uplane = Uplane?.getPointer(memScope).rawValue
        val _Upitch = Upitch
        val _Vplane = Vplane?.getPointer(memScope).rawValue
        val _Vpitch = Vpitch
        val res = kni_SDL_UpdateYUVTexture(_texture, _rect, _Yplane, _Ypitch, _Uplane, _Upitch, _Vplane, _Vpitch)
        res
    }
}

@SymbolName("sdl_kni_SDL_UpdateYUVTexture")
private external fun kni_SDL_UpdateYUVTexture(texture: NativePtr, rect: NativePtr, Yplane: NativePtr, Ypitch: Int, Uplane: NativePtr, Upitch: Int, Vplane: NativePtr, Vpitch: Int): Int

fun SDL_LockTexture(texture: CValuesRef<SDL_Texture>?, rect: CValuesRef<SDL_Rect>?, pixels: CValuesRef<COpaquePointerVar>?, pitch: CValuesRef<IntVar>?): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val _pixels = pixels?.getPointer(memScope).rawValue
        val _pitch = pitch?.getPointer(memScope).rawValue
        val res = kni_SDL_LockTexture(_texture, _rect, _pixels, _pitch)
        res
    }
}

@SymbolName("sdl_kni_SDL_LockTexture")
private external fun kni_SDL_LockTexture(texture: NativePtr, rect: NativePtr, pixels: NativePtr, pitch: NativePtr): Int

fun SDL_UnlockTexture(texture: CValuesRef<SDL_Texture>?): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_SDL_UnlockTexture(_texture)
        res
    }
}

@SymbolName("sdl_kni_SDL_UnlockTexture")
private external fun kni_SDL_UnlockTexture(texture: NativePtr): Unit

fun SDL_RenderTargetSupported(renderer: CValuesRef<SDL_Renderer>?): SDL_bool {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderTargetSupported(_renderer)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderTargetSupported")
private external fun kni_SDL_RenderTargetSupported(renderer: NativePtr): Int

fun SDL_SetRenderTarget(renderer: CValuesRef<SDL_Renderer>?, texture: CValuesRef<SDL_Texture>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_SDL_SetRenderTarget(_renderer, _texture)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetRenderTarget")
private external fun kni_SDL_SetRenderTarget(renderer: NativePtr, texture: NativePtr): Int

fun SDL_GetRenderTarget(renderer: CValuesRef<SDL_Renderer>?): CPointer<SDL_Texture>? {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val res = kni_SDL_GetRenderTarget(_renderer)
        interpretCPointer<SDL_Texture>(res)
    }
}

@SymbolName("sdl_kni_SDL_GetRenderTarget")
private external fun kni_SDL_GetRenderTarget(renderer: NativePtr): NativePtr

fun SDL_RenderSetLogicalSize(renderer: CValuesRef<SDL_Renderer>?, w: Int, h: Int): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _w = w
        val _h = h
        val res = kni_SDL_RenderSetLogicalSize(_renderer, _w, _h)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderSetLogicalSize")
private external fun kni_SDL_RenderSetLogicalSize(renderer: NativePtr, w: Int, h: Int): Int

fun SDL_RenderGetLogicalSize(renderer: CValuesRef<SDL_Renderer>?, w: CValuesRef<IntVar>?, h: CValuesRef<IntVar>?): Unit {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _w = w?.getPointer(memScope).rawValue
        val _h = h?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderGetLogicalSize(_renderer, _w, _h)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderGetLogicalSize")
private external fun kni_SDL_RenderGetLogicalSize(renderer: NativePtr, w: NativePtr, h: NativePtr): Unit

fun SDL_RenderSetIntegerScale(renderer: CValuesRef<SDL_Renderer>?, enable: SDL_bool): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _enable = enable
        val res = kni_SDL_RenderSetIntegerScale(_renderer, _enable)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderSetIntegerScale")
private external fun kni_SDL_RenderSetIntegerScale(renderer: NativePtr, enable: Int): Int

fun SDL_RenderGetIntegerScale(renderer: CValuesRef<SDL_Renderer>?): SDL_bool {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderGetIntegerScale(_renderer)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderGetIntegerScale")
private external fun kni_SDL_RenderGetIntegerScale(renderer: NativePtr): Int

fun SDL_RenderSetViewport(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderSetViewport(_renderer, _rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderSetViewport")
private external fun kni_SDL_RenderSetViewport(renderer: NativePtr, rect: NativePtr): Int

fun SDL_RenderGetViewport(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Unit {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderGetViewport(_renderer, _rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderGetViewport")
private external fun kni_SDL_RenderGetViewport(renderer: NativePtr, rect: NativePtr): Unit

fun SDL_RenderSetClipRect(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderSetClipRect(_renderer, _rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderSetClipRect")
private external fun kni_SDL_RenderSetClipRect(renderer: NativePtr, rect: NativePtr): Int

fun SDL_RenderGetClipRect(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Unit {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderGetClipRect(_renderer, _rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderGetClipRect")
private external fun kni_SDL_RenderGetClipRect(renderer: NativePtr, rect: NativePtr): Unit

fun SDL_RenderIsClipEnabled(renderer: CValuesRef<SDL_Renderer>?): SDL_bool {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderIsClipEnabled(_renderer)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderIsClipEnabled")
private external fun kni_SDL_RenderIsClipEnabled(renderer: NativePtr): Int

fun SDL_RenderSetScale(renderer: CValuesRef<SDL_Renderer>?, scaleX: Float, scaleY: Float): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _scaleX = scaleX
        val _scaleY = scaleY
        val res = kni_SDL_RenderSetScale(_renderer, _scaleX, _scaleY)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderSetScale")
private external fun kni_SDL_RenderSetScale(renderer: NativePtr, scaleX: Float, scaleY: Float): Int

fun SDL_RenderGetScale(renderer: CValuesRef<SDL_Renderer>?, scaleX: CValuesRef<FloatVar>?, scaleY: CValuesRef<FloatVar>?): Unit {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _scaleX = scaleX?.getPointer(memScope).rawValue
        val _scaleY = scaleY?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderGetScale(_renderer, _scaleX, _scaleY)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderGetScale")
private external fun kni_SDL_RenderGetScale(renderer: NativePtr, scaleX: NativePtr, scaleY: NativePtr): Unit

fun SDL_SetRenderDrawColor(renderer: CValuesRef<SDL_Renderer>?, r: Uint8, g: Uint8, b: Uint8, a: Uint8): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _r = r
        val _g = g
        val _b = b
        val _a = a
        val res = kni_SDL_SetRenderDrawColor(_renderer, _r, _g, _b, _a)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetRenderDrawColor")
private external fun kni_SDL_SetRenderDrawColor(renderer: NativePtr, r: Byte, g: Byte, b: Byte, a: Byte): Int

fun SDL_GetRenderDrawColor(renderer: CValuesRef<SDL_Renderer>?, r: CValuesRef<Uint8Var>?, g: CValuesRef<Uint8Var>?, b: CValuesRef<Uint8Var>?, a: CValuesRef<Uint8Var>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _r = r?.getPointer(memScope).rawValue
        val _g = g?.getPointer(memScope).rawValue
        val _b = b?.getPointer(memScope).rawValue
        val _a = a?.getPointer(memScope).rawValue
        val res = kni_SDL_GetRenderDrawColor(_renderer, _r, _g, _b, _a)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetRenderDrawColor")
private external fun kni_SDL_GetRenderDrawColor(renderer: NativePtr, r: NativePtr, g: NativePtr, b: NativePtr, a: NativePtr): Int

fun SDL_SetRenderDrawBlendMode(renderer: CValuesRef<SDL_Renderer>?, blendMode: SDL_BlendMode): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _blendMode = blendMode
        val res = kni_SDL_SetRenderDrawBlendMode(_renderer, _blendMode)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetRenderDrawBlendMode")
private external fun kni_SDL_SetRenderDrawBlendMode(renderer: NativePtr, blendMode: Int): Int

fun SDL_GetRenderDrawBlendMode(renderer: CValuesRef<SDL_Renderer>?, blendMode: CValuesRef<SDL_BlendModeVar>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _blendMode = blendMode?.getPointer(memScope).rawValue
        val res = kni_SDL_GetRenderDrawBlendMode(_renderer, _blendMode)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetRenderDrawBlendMode")
private external fun kni_SDL_GetRenderDrawBlendMode(renderer: NativePtr, blendMode: NativePtr): Int

fun SDL_RenderClear(renderer: CValuesRef<SDL_Renderer>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderClear(_renderer)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderClear")
private external fun kni_SDL_RenderClear(renderer: NativePtr): Int

fun SDL_RenderDrawPoint(renderer: CValuesRef<SDL_Renderer>?, x: Int, y: Int): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_SDL_RenderDrawPoint(_renderer, _x, _y)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderDrawPoint")
private external fun kni_SDL_RenderDrawPoint(renderer: NativePtr, x: Int, y: Int): Int

fun SDL_RenderDrawPoints(renderer: CValuesRef<SDL_Renderer>?, points: CValuesRef<SDL_Point>?, count: Int): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _points = points?.getPointer(memScope).rawValue
        val _count = count
        val res = kni_SDL_RenderDrawPoints(_renderer, _points, _count)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderDrawPoints")
private external fun kni_SDL_RenderDrawPoints(renderer: NativePtr, points: NativePtr, count: Int): Int

fun SDL_RenderDrawLine(renderer: CValuesRef<SDL_Renderer>?, x1: Int, y1: Int, x2: Int, y2: Int): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _x1 = x1
        val _y1 = y1
        val _x2 = x2
        val _y2 = y2
        val res = kni_SDL_RenderDrawLine(_renderer, _x1, _y1, _x2, _y2)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderDrawLine")
private external fun kni_SDL_RenderDrawLine(renderer: NativePtr, x1: Int, y1: Int, x2: Int, y2: Int): Int

fun SDL_RenderDrawLines(renderer: CValuesRef<SDL_Renderer>?, points: CValuesRef<SDL_Point>?, count: Int): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _points = points?.getPointer(memScope).rawValue
        val _count = count
        val res = kni_SDL_RenderDrawLines(_renderer, _points, _count)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderDrawLines")
private external fun kni_SDL_RenderDrawLines(renderer: NativePtr, points: NativePtr, count: Int): Int

fun SDL_RenderDrawRect(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderDrawRect(_renderer, _rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderDrawRect")
private external fun kni_SDL_RenderDrawRect(renderer: NativePtr, rect: NativePtr): Int

fun SDL_RenderDrawRects(renderer: CValuesRef<SDL_Renderer>?, rects: CValuesRef<SDL_Rect>?, count: Int): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _rects = rects?.getPointer(memScope).rawValue
        val _count = count
        val res = kni_SDL_RenderDrawRects(_renderer, _rects, _count)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderDrawRects")
private external fun kni_SDL_RenderDrawRects(renderer: NativePtr, rects: NativePtr, count: Int): Int

fun SDL_RenderFillRect(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderFillRect(_renderer, _rect)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderFillRect")
private external fun kni_SDL_RenderFillRect(renderer: NativePtr, rect: NativePtr): Int

fun SDL_RenderFillRects(renderer: CValuesRef<SDL_Renderer>?, rects: CValuesRef<SDL_Rect>?, count: Int): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _rects = rects?.getPointer(memScope).rawValue
        val _count = count
        val res = kni_SDL_RenderFillRects(_renderer, _rects, _count)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderFillRects")
private external fun kni_SDL_RenderFillRects(renderer: NativePtr, rects: NativePtr, count: Int): Int

fun SDL_RenderCopy(renderer: CValuesRef<SDL_Renderer>?, texture: CValuesRef<SDL_Texture>?, srcrect: CValuesRef<SDL_Rect>?, dstrect: CValuesRef<SDL_Rect>?): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _srcrect = srcrect?.getPointer(memScope).rawValue
        val _dstrect = dstrect?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderCopy(_renderer, _texture, _srcrect, _dstrect)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderCopy")
private external fun kni_SDL_RenderCopy(renderer: NativePtr, texture: NativePtr, srcrect: NativePtr, dstrect: NativePtr): Int

fun SDL_RenderCopyEx(renderer: CValuesRef<SDL_Renderer>?, texture: CValuesRef<SDL_Texture>?, srcrect: CValuesRef<SDL_Rect>?, dstrect: CValuesRef<SDL_Rect>?, angle: Double, center: CValuesRef<SDL_Point>?, flip: SDL_RendererFlip): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _srcrect = srcrect?.getPointer(memScope).rawValue
        val _dstrect = dstrect?.getPointer(memScope).rawValue
        val _angle = angle
        val _center = center?.getPointer(memScope).rawValue
        val _flip = flip
        val res = kni_SDL_RenderCopyEx(_renderer, _texture, _srcrect, _dstrect, _angle, _center, _flip)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderCopyEx")
private external fun kni_SDL_RenderCopyEx(renderer: NativePtr, texture: NativePtr, srcrect: NativePtr, dstrect: NativePtr, angle: Double, center: NativePtr, flip: Int): Int

fun SDL_RenderReadPixels(renderer: CValuesRef<SDL_Renderer>?, rect: CValuesRef<SDL_Rect>?, format: Uint32, pixels: COpaquePointer?, pitch: Int): Int {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val _rect = rect?.getPointer(memScope).rawValue
        val _format = format
        val _pixels = pixels.rawValue
        val _pitch = pitch
        val res = kni_SDL_RenderReadPixels(_renderer, _rect, _format, _pixels, _pitch)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderReadPixels")
private external fun kni_SDL_RenderReadPixels(renderer: NativePtr, rect: NativePtr, format: Int, pixels: NativePtr, pitch: Int): Int

fun SDL_RenderPresent(renderer: CValuesRef<SDL_Renderer>?): Unit {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderPresent(_renderer)
        res
    }
}

@SymbolName("sdl_kni_SDL_RenderPresent")
private external fun kni_SDL_RenderPresent(renderer: NativePtr): Unit

fun SDL_DestroyTexture(texture: CValuesRef<SDL_Texture>?): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_SDL_DestroyTexture(_texture)
        res
    }
}

@SymbolName("sdl_kni_SDL_DestroyTexture")
private external fun kni_SDL_DestroyTexture(texture: NativePtr): Unit

fun SDL_DestroyRenderer(renderer: CValuesRef<SDL_Renderer>?): Unit {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val res = kni_SDL_DestroyRenderer(_renderer)
        res
    }
}

@SymbolName("sdl_kni_SDL_DestroyRenderer")
private external fun kni_SDL_DestroyRenderer(renderer: NativePtr): Unit

fun SDL_GL_BindTexture(texture: CValuesRef<SDL_Texture>?, texw: CValuesRef<FloatVar>?, texh: CValuesRef<FloatVar>?): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _texw = texw?.getPointer(memScope).rawValue
        val _texh = texh?.getPointer(memScope).rawValue
        val res = kni_SDL_GL_BindTexture(_texture, _texw, _texh)
        res
    }
}

@SymbolName("sdl_kni_SDL_GL_BindTexture")
private external fun kni_SDL_GL_BindTexture(texture: NativePtr, texw: NativePtr, texh: NativePtr): Int

fun SDL_GL_UnbindTexture(texture: CValuesRef<SDL_Texture>?): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_SDL_GL_UnbindTexture(_texture)
        res
    }
}

@SymbolName("sdl_kni_SDL_GL_UnbindTexture")
private external fun kni_SDL_GL_UnbindTexture(texture: NativePtr): Int

fun SDL_CreateShapedWindow(title: String?, x: Int, y: Int, w: Int, h: Int, flags: Uint32): CPointer<SDL_Window>? {
    return memScoped {
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val _w = w
        val _h = h
        val _flags = flags
        val res = kni_SDL_CreateShapedWindow(_title, _x, _y, _w, _h, _flags)
        interpretCPointer<SDL_Window>(res)
    }
}

@SymbolName("sdl_kni_SDL_CreateShapedWindow")
private external fun kni_SDL_CreateShapedWindow(title: NativePtr, x: Int, y: Int, w: Int, h: Int, flags: Int): NativePtr

fun SDL_IsShapedWindow(window: CValuesRef<SDL_Window>?): SDL_bool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_SDL_IsShapedWindow(_window)
        res
    }
}

@SymbolName("sdl_kni_SDL_IsShapedWindow")
private external fun kni_SDL_IsShapedWindow(window: NativePtr): Int

fun SDL_SetWindowShape(window: CValuesRef<SDL_Window>?, shape: CValuesRef<SDL_Surface>?, shape_mode: CValuesRef<SDL_WindowShapeMode>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _shape = shape?.getPointer(memScope).rawValue
        val _shape_mode = shape_mode?.getPointer(memScope).rawValue
        val res = kni_SDL_SetWindowShape(_window, _shape, _shape_mode)
        res
    }
}

@SymbolName("sdl_kni_SDL_SetWindowShape")
private external fun kni_SDL_SetWindowShape(window: NativePtr, shape: NativePtr, shape_mode: NativePtr): Int

fun SDL_GetShapedWindowMode(window: CValuesRef<SDL_Window>?, shape_mode: CValuesRef<SDL_WindowShapeMode>?): Int {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _shape_mode = shape_mode?.getPointer(memScope).rawValue
        val res = kni_SDL_GetShapedWindowMode(_window, _shape_mode)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetShapedWindowMode")
private external fun kni_SDL_GetShapedWindowMode(window: NativePtr, shape_mode: NativePtr): Int

fun SDL_SetWindowsMessageHook(callback: SDL_WindowsMessageHook?, userdata: COpaquePointer?): Unit {
    val _callback = callback.rawValue
    val _userdata = userdata.rawValue
    val res = kni_SDL_SetWindowsMessageHook(_callback, _userdata)
    return res
}

@SymbolName("sdl_kni_SDL_SetWindowsMessageHook")
private external fun kni_SDL_SetWindowsMessageHook(callback: NativePtr, userdata: NativePtr): Unit

fun SDL_Direct3D9GetAdapterIndex(displayIndex: Int): Int {
    val _displayIndex = displayIndex
    val res = kni_SDL_Direct3D9GetAdapterIndex(_displayIndex)
    return res
}

@SymbolName("sdl_kni_SDL_Direct3D9GetAdapterIndex")
private external fun kni_SDL_Direct3D9GetAdapterIndex(displayIndex: Int): Int

fun SDL_RenderGetD3D9Device(renderer: CValuesRef<SDL_Renderer>?): CPointer<IDirect3DDevice9>? {
    return memScoped {
        val _renderer = renderer?.getPointer(memScope).rawValue
        val res = kni_SDL_RenderGetD3D9Device(_renderer)
        interpretCPointer<IDirect3DDevice9>(res)
    }
}

@SymbolName("sdl_kni_SDL_RenderGetD3D9Device")
private external fun kni_SDL_RenderGetD3D9Device(renderer: NativePtr): NativePtr

fun SDL_DXGIGetOutputInfo(displayIndex: Int, adapterIndex: CValuesRef<IntVar>?, outputIndex: CValuesRef<IntVar>?): SDL_bool {
    return memScoped {
        val _displayIndex = displayIndex
        val _adapterIndex = adapterIndex?.getPointer(memScope).rawValue
        val _outputIndex = outputIndex?.getPointer(memScope).rawValue
        val res = kni_SDL_DXGIGetOutputInfo(_displayIndex, _adapterIndex, _outputIndex)
        res
    }
}

@SymbolName("sdl_kni_SDL_DXGIGetOutputInfo")
private external fun kni_SDL_DXGIGetOutputInfo(displayIndex: Int, adapterIndex: NativePtr, outputIndex: NativePtr): Int

fun SDL_GetTicks(): Uint32 {
    val res = kni_SDL_GetTicks()
    return res
}

@SymbolName("sdl_kni_SDL_GetTicks")
private external fun kni_SDL_GetTicks(): Int

fun SDL_GetPerformanceCounter(): Uint64 {
    val res = kni_SDL_GetPerformanceCounter()
    return res
}

@SymbolName("sdl_kni_SDL_GetPerformanceCounter")
private external fun kni_SDL_GetPerformanceCounter(): Long

fun SDL_GetPerformanceFrequency(): Uint64 {
    val res = kni_SDL_GetPerformanceFrequency()
    return res
}

@SymbolName("sdl_kni_SDL_GetPerformanceFrequency")
private external fun kni_SDL_GetPerformanceFrequency(): Long

fun SDL_Delay(ms: Uint32): Unit {
    val _ms = ms
    val res = kni_SDL_Delay(_ms)
    return res
}

@SymbolName("sdl_kni_SDL_Delay")
private external fun kni_SDL_Delay(ms: Int): Unit

fun SDL_AddTimer(interval: Uint32, callback: SDL_TimerCallback?, param: COpaquePointer?): SDL_TimerID {
    val _interval = interval
    val _callback = callback.rawValue
    val _param = param.rawValue
    val res = kni_SDL_AddTimer(_interval, _callback, _param)
    return res
}

@SymbolName("sdl_kni_SDL_AddTimer")
private external fun kni_SDL_AddTimer(interval: Int, callback: NativePtr, param: NativePtr): Int

fun SDL_RemoveTimer(id: SDL_TimerID): SDL_bool {
    val _id = id
    val res = kni_SDL_RemoveTimer(_id)
    return res
}

@SymbolName("sdl_kni_SDL_RemoveTimer")
private external fun kni_SDL_RemoveTimer(id: Int): Int

fun SDL_GetVersion(ver: CValuesRef<SDL_version>?): Unit {
    return memScoped {
        val _ver = ver?.getPointer(memScope).rawValue
        val res = kni_SDL_GetVersion(_ver)
        res
    }
}

@SymbolName("sdl_kni_SDL_GetVersion")
private external fun kni_SDL_GetVersion(ver: NativePtr): Unit

fun SDL_GetRevision(): CPointer<ByteVar>? {
    val res = kni_SDL_GetRevision()
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sdl_kni_SDL_GetRevision")
private external fun kni_SDL_GetRevision(): NativePtr

fun SDL_GetRevisionNumber(): Int {
    val res = kni_SDL_GetRevisionNumber()
    return res
}

@SymbolName("sdl_kni_SDL_GetRevisionNumber")
private external fun kni_SDL_GetRevisionNumber(): Int

fun SDL_Init(flags: Uint32): Int {
    val _flags = flags
    val res = kni_SDL_Init(_flags)
    return res
}

@SymbolName("sdl_kni_SDL_Init")
private external fun kni_SDL_Init(flags: Int): Int

fun SDL_InitSubSystem(flags: Uint32): Int {
    val _flags = flags
    val res = kni_SDL_InitSubSystem(_flags)
    return res
}

@SymbolName("sdl_kni_SDL_InitSubSystem")
private external fun kni_SDL_InitSubSystem(flags: Int): Int

fun SDL_QuitSubSystem(flags: Uint32): Unit {
    val _flags = flags
    val res = kni_SDL_QuitSubSystem(_flags)
    return res
}

@SymbolName("sdl_kni_SDL_QuitSubSystem")
private external fun kni_SDL_QuitSubSystem(flags: Int): Unit

fun SDL_WasInit(flags: Uint32): Uint32 {
    val _flags = flags
    val res = kni_SDL_WasInit(_flags)
    return res
}

@SymbolName("sdl_kni_SDL_WasInit")
private external fun kni_SDL_WasInit(flags: Int): Int

fun SDL_Quit(): Unit {
    val res = kni_SDL_Quit()
    return res
}

@SymbolName("sdl_kni_SDL_Quit")
private external fun kni_SDL_Quit(): Unit

fun _get_daylight(_Daylight: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __Daylight = _Daylight?.getPointer(memScope).rawValue
        val res = kni__get_daylight(__Daylight)
        res
    }
}

@SymbolName("sdl_kni__get_daylight")
private external fun kni__get_daylight(_Daylight: NativePtr): Int

fun _get_dstbias(_Daylight_savings_bias: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __Daylight_savings_bias = _Daylight_savings_bias?.getPointer(memScope).rawValue
        val res = kni__get_dstbias(__Daylight_savings_bias)
        res
    }
}

@SymbolName("sdl_kni__get_dstbias")
private external fun kni__get_dstbias(_Daylight_savings_bias: NativePtr): Int

fun _get_timezone(_Timezone: CValuesRef<IntVar>?): errno_t {
    return memScoped {
        val __Timezone = _Timezone?.getPointer(memScope).rawValue
        val res = kni__get_timezone(__Timezone)
        res
    }
}

@SymbolName("sdl_kni__get_timezone")
private external fun kni__get_timezone(_Timezone: NativePtr): Int

fun _get_tzname(_ReturnValue: CValuesRef<size_tVar>?, _Buffer: CValuesRef<ByteVar>?, _SizeInBytes: size_t, _Index: Int): errno_t {
    return memScoped {
        val __ReturnValue = _ReturnValue?.getPointer(memScope).rawValue
        val __Buffer = _Buffer?.getPointer(memScope).rawValue
        val __SizeInBytes = _SizeInBytes
        val __Index = _Index
        val res = kni__get_tzname(__ReturnValue, __Buffer, __SizeInBytes, __Index)
        res
    }
}

@SymbolName("sdl_kni__get_tzname")
private external fun kni__get_tzname(_ReturnValue: NativePtr, _Buffer: NativePtr, _SizeInBytes: Long, _Index: Int): Int

fun asctime(_Tm: CValuesRef<tm>?): CPointer<ByteVar>? {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni_asctime(__Tm)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_asctime")
private external fun kni_asctime(_Tm: NativePtr): NativePtr

fun asctime_s(_Buf: CValuesRef<ByteVar>?, _SizeInWords: size_t, _Tm: CValuesRef<tm>?): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInWords = _SizeInWords
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni_asctime_s(__Buf, __SizeInWords, __Tm)
        res
    }
}

@SymbolName("sdl_kni_asctime_s")
private external fun kni_asctime_s(_Buf: NativePtr, _SizeInWords: Long, _Tm: NativePtr): Int

fun _ctime32(_Time: CValuesRef<__time32_tVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__ctime32(__Time)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__ctime32")
private external fun kni__ctime32(_Time: NativePtr): NativePtr

fun _ctime32_s(_Buf: CValuesRef<ByteVar>?, _SizeInBytes: size_t, _Time: CValuesRef<__time32_tVar>?): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInBytes = _SizeInBytes
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__ctime32_s(__Buf, __SizeInBytes, __Time)
        res
    }
}

@SymbolName("sdl_kni__ctime32_s")
private external fun kni__ctime32_s(_Buf: NativePtr, _SizeInBytes: Long, _Time: NativePtr): Int

fun clock(): clock_t {
    val res = kni_clock()
    return res
}

@SymbolName("sdl_kni_clock")
private external fun kni_clock(): Int

fun _difftime32(_Time1: __time32_t, _Time2: __time32_t): Double {
    val __Time1 = _Time1
    val __Time2 = _Time2
    val res = kni__difftime32(__Time1, __Time2)
    return res
}

@SymbolName("sdl_kni__difftime32")
private external fun kni__difftime32(_Time1: Int, _Time2: Int): Double

fun _gmtime32(_Time: CValuesRef<__time32_tVar>?): CPointer<tm>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__gmtime32(__Time)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("sdl_kni__gmtime32")
private external fun kni__gmtime32(_Time: NativePtr): NativePtr

fun _gmtime32_s(_Tm: CValuesRef<tm>?, _Time: CValuesRef<__time32_tVar>?): errno_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__gmtime32_s(__Tm, __Time)
        res
    }
}

@SymbolName("sdl_kni__gmtime32_s")
private external fun kni__gmtime32_s(_Tm: NativePtr, _Time: NativePtr): Int

fun _localtime32(_Time: CValuesRef<__time32_tVar>?): CPointer<tm>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__localtime32(__Time)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("sdl_kni__localtime32")
private external fun kni__localtime32(_Time: NativePtr): NativePtr

fun _localtime32_s(_Tm: CValuesRef<tm>?, _Time: CValuesRef<__time32_tVar>?): errno_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__localtime32_s(__Tm, __Time)
        res
    }
}

@SymbolName("sdl_kni__localtime32_s")
private external fun kni__localtime32_s(_Tm: NativePtr, _Time: NativePtr): Int

fun strftime(_Buf: CValuesRef<ByteVar>?, _SizeInBytes: size_t, _Format: String?, _Tm: CValuesRef<tm>?): size_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInBytes = _SizeInBytes
        val __Format = _Format?.cstr?.getPointer(memScope).rawValue
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni_strftime(__Buf, __SizeInBytes, __Format, __Tm)
        res
    }
}

@SymbolName("sdl_kni_strftime")
private external fun kni_strftime(_Buf: NativePtr, _SizeInBytes: Long, _Format: NativePtr, _Tm: NativePtr): Long

fun _strftime_l(_Buf: CValuesRef<ByteVar>?, _Max_size: size_t, _Format: String?, _Tm: CValuesRef<tm>?, _Locale: _locale_t?): size_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __Max_size = _Max_size
        val __Format = _Format?.cstr?.getPointer(memScope).rawValue
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__strftime_l(__Buf, __Max_size, __Format, __Tm, __Locale)
        res
    }
}

@SymbolName("sdl_kni__strftime_l")
private external fun kni__strftime_l(_Buf: NativePtr, _Max_size: Long, _Format: NativePtr, _Tm: NativePtr, _Locale: NativePtr): Long

fun _strdate(_Buffer: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Buffer = _Buffer?.getPointer(memScope).rawValue
        val res = kni__strdate(__Buffer)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__strdate")
private external fun kni__strdate(_Buffer: NativePtr): NativePtr

fun _strdate_s(_Buf: CValuesRef<ByteVar>?, _SizeInBytes: size_t): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInBytes = _SizeInBytes
        val res = kni__strdate_s(__Buf, __SizeInBytes)
        res
    }
}

@SymbolName("sdl_kni__strdate_s")
private external fun kni__strdate_s(_Buf: NativePtr, _SizeInBytes: Long): Int

fun _strtime(_Buffer: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Buffer = _Buffer?.getPointer(memScope).rawValue
        val res = kni__strtime(__Buffer)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__strtime")
private external fun kni__strtime(_Buffer: NativePtr): NativePtr

fun _strtime_s(_Buf: CValuesRef<ByteVar>?, _SizeInBytes: size_t): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInBytes = _SizeInBytes
        val res = kni__strtime_s(__Buf, __SizeInBytes)
        res
    }
}

@SymbolName("sdl_kni__strtime_s")
private external fun kni__strtime_s(_Buf: NativePtr, _SizeInBytes: Long): Int

fun _time32(_Time: CValuesRef<__time32_tVar>?): __time32_t {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__time32(__Time)
        res
    }
}

@SymbolName("sdl_kni__time32")
private external fun kni__time32(_Time: NativePtr): Int

fun _mktime32(_Tm: CValuesRef<tm>?): __time32_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni__mktime32(__Tm)
        res
    }
}

@SymbolName("sdl_kni__mktime32")
private external fun kni__mktime32(_Tm: NativePtr): Int

fun _mkgmtime32(_Tm: CValuesRef<tm>?): __time32_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni__mkgmtime32(__Tm)
        res
    }
}

@SymbolName("sdl_kni__mkgmtime32")
private external fun kni__mkgmtime32(_Tm: NativePtr): Int

fun tzset(): Unit {
    val res = kni_tzset()
    return res
}

@SymbolName("sdl_kni_tzset")
private external fun kni_tzset(): Unit

fun _tzset(): Unit {
    val res = kni__tzset()
    return res
}

@SymbolName("sdl_kni__tzset")
private external fun kni__tzset(): Unit

fun _difftime64(_Time1: __time64_t, _Time2: __time64_t): Double {
    val __Time1 = _Time1
    val __Time2 = _Time2
    val res = kni__difftime64(__Time1, __Time2)
    return res
}

@SymbolName("sdl_kni__difftime64")
private external fun kni__difftime64(_Time1: Long, _Time2: Long): Double

fun _ctime64(_Time: CValuesRef<__time64_tVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__ctime64(__Time)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni__ctime64")
private external fun kni__ctime64(_Time: NativePtr): NativePtr

fun _ctime64_s(_Buf: CValuesRef<ByteVar>?, _SizeInBytes: size_t, _Time: CValuesRef<__time64_tVar>?): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInBytes = _SizeInBytes
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__ctime64_s(__Buf, __SizeInBytes, __Time)
        res
    }
}

@SymbolName("sdl_kni__ctime64_s")
private external fun kni__ctime64_s(_Buf: NativePtr, _SizeInBytes: Long, _Time: NativePtr): Int

fun _gmtime64(_Time: CValuesRef<__time64_tVar>?): CPointer<tm>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__gmtime64(__Time)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("sdl_kni__gmtime64")
private external fun kni__gmtime64(_Time: NativePtr): NativePtr

fun _gmtime64_s(_Tm: CValuesRef<tm>?, _Time: CValuesRef<__time64_tVar>?): errno_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__gmtime64_s(__Tm, __Time)
        res
    }
}

@SymbolName("sdl_kni__gmtime64_s")
private external fun kni__gmtime64_s(_Tm: NativePtr, _Time: NativePtr): Int

fun _localtime64(_Time: CValuesRef<__time64_tVar>?): CPointer<tm>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__localtime64(__Time)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("sdl_kni__localtime64")
private external fun kni__localtime64(_Time: NativePtr): NativePtr

fun _localtime64_s(_Tm: CValuesRef<tm>?, _Time: CValuesRef<__time64_tVar>?): errno_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__localtime64_s(__Tm, __Time)
        res
    }
}

@SymbolName("sdl_kni__localtime64_s")
private external fun kni__localtime64_s(_Tm: NativePtr, _Time: NativePtr): Int

fun _mktime64(_Tm: CValuesRef<tm>?): __time64_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni__mktime64(__Tm)
        res
    }
}

@SymbolName("sdl_kni__mktime64")
private external fun kni__mktime64(_Tm: NativePtr): Long

fun _mkgmtime64(_Tm: CValuesRef<tm>?): __time64_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni__mkgmtime64(__Tm)
        res
    }
}

@SymbolName("sdl_kni__mkgmtime64")
private external fun kni__mkgmtime64(_Tm: NativePtr): Long

fun _time64(_Time: CValuesRef<__time64_tVar>?): __time64_t {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__time64(__Time)
        res
    }
}

@SymbolName("sdl_kni__time64")
private external fun kni__time64(_Time: NativePtr): Long

fun _getsystime(_Tm: CValuesRef<tm>?): Int {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni__getsystime(__Tm)
        res
    }
}

@SymbolName("sdl_kni__getsystime")
private external fun kni__getsystime(_Tm: NativePtr): Int

fun _setsystime(_Tm: CValuesRef<tm>?, _MilliSec: Int): Int {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val __MilliSec = _MilliSec
        val res = kni__setsystime(__Tm, __MilliSec)
        res
    }
}

@SymbolName("sdl_kni__setsystime")
private external fun kni__setsystime(_Tm: NativePtr, _MilliSec: Int): Int

fun _wasctime(_Tm: CValuesRef<tm>?): CPointer<wchar_tVar>? {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni__wasctime(__Tm)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__wasctime")
private external fun kni__wasctime(_Tm: NativePtr): NativePtr

fun _wasctime_s(_Buf: CValuesRef<wchar_tVar>?, _SizeInWords: size_t, _Tm: CValuesRef<tm>?): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInWords = _SizeInWords
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni__wasctime_s(__Buf, __SizeInWords, __Tm)
        res
    }
}

@SymbolName("sdl_kni__wasctime_s")
private external fun kni__wasctime_s(_Buf: NativePtr, _SizeInWords: Long, _Tm: NativePtr): Int

fun _wctime32(_Time: CValuesRef<__time32_tVar>?): CPointer<wchar_tVar>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__wctime32(__Time)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__wctime32")
private external fun kni__wctime32(_Time: NativePtr): NativePtr

fun _wctime32_s(_Buf: CValuesRef<wchar_tVar>?, _SizeInWords: size_t, _Time: CValuesRef<__time32_tVar>?): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInWords = _SizeInWords
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__wctime32_s(__Buf, __SizeInWords, __Time)
        res
    }
}

@SymbolName("sdl_kni__wctime32_s")
private external fun kni__wctime32_s(_Buf: NativePtr, _SizeInWords: Long, _Time: NativePtr): Int

fun wcsftime(_Buf: CValuesRef<wchar_tVar>?, _SizeInWords: size_t, _Format: CValuesRef<wchar_tVar>?, _Tm: CValuesRef<tm>?): size_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInWords = _SizeInWords
        val __Format = _Format?.getPointer(memScope).rawValue
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni_wcsftime(__Buf, __SizeInWords, __Format, __Tm)
        res
    }
}

@SymbolName("sdl_kni_wcsftime")
private external fun kni_wcsftime(_Buf: NativePtr, _SizeInWords: Long, _Format: NativePtr, _Tm: NativePtr): Long

fun _wcsftime_l(_Buf: CValuesRef<wchar_tVar>?, _SizeInWords: size_t, _Format: CValuesRef<wchar_tVar>?, _Tm: CValuesRef<tm>?, _Locale: _locale_t?): size_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInWords = _SizeInWords
        val __Format = _Format?.getPointer(memScope).rawValue
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val __Locale = _Locale.rawValue
        val res = kni__wcsftime_l(__Buf, __SizeInWords, __Format, __Tm, __Locale)
        res
    }
}

@SymbolName("sdl_kni__wcsftime_l")
private external fun kni__wcsftime_l(_Buf: NativePtr, _SizeInWords: Long, _Format: NativePtr, _Tm: NativePtr, _Locale: NativePtr): Long

fun _wstrdate(_Buffer: CValuesRef<wchar_tVar>?): CPointer<wchar_tVar>? {
    return memScoped {
        val __Buffer = _Buffer?.getPointer(memScope).rawValue
        val res = kni__wstrdate(__Buffer)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__wstrdate")
private external fun kni__wstrdate(_Buffer: NativePtr): NativePtr

fun _wstrdate_s(_Buf: CValuesRef<wchar_tVar>?, _SizeInWords: size_t): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInWords = _SizeInWords
        val res = kni__wstrdate_s(__Buf, __SizeInWords)
        res
    }
}

@SymbolName("sdl_kni__wstrdate_s")
private external fun kni__wstrdate_s(_Buf: NativePtr, _SizeInWords: Long): Int

fun _wstrtime(_Buffer: CValuesRef<wchar_tVar>?): CPointer<wchar_tVar>? {
    return memScoped {
        val __Buffer = _Buffer?.getPointer(memScope).rawValue
        val res = kni__wstrtime(__Buffer)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__wstrtime")
private external fun kni__wstrtime(_Buffer: NativePtr): NativePtr

fun _wstrtime_s(_Buf: CValuesRef<wchar_tVar>?, _SizeInWords: size_t): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInWords = _SizeInWords
        val res = kni__wstrtime_s(__Buf, __SizeInWords)
        res
    }
}

@SymbolName("sdl_kni__wstrtime_s")
private external fun kni__wstrtime_s(_Buf: NativePtr, _SizeInWords: Long): Int

fun _wctime64(_Time: CValuesRef<__time64_tVar>?): CPointer<wchar_tVar>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__wctime64(__Time)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__wctime64")
private external fun kni__wctime64(_Time: NativePtr): NativePtr

fun _wctime64_s(_Buf: CValuesRef<wchar_tVar>?, _SizeInWords: size_t, _Time: CValuesRef<__time64_tVar>?): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInWords = _SizeInWords
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni__wctime64_s(__Buf, __SizeInWords, __Time)
        res
    }
}

@SymbolName("sdl_kni__wctime64_s")
private external fun kni__wctime64_s(_Buf: NativePtr, _SizeInWords: Long, _Time: NativePtr): Int

fun _wctime(arg0: CValuesRef<time_tVar>?): CPointer<wchar_tVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni__wctime(_arg0)
        interpretCPointer<wchar_tVar>(res)
    }
}

@SymbolName("sdl_kni__wctime")
private external fun kni__wctime(arg0: NativePtr): NativePtr

fun _wctime_s(arg0: CValuesRef<wchar_tVar>?, arg1: size_t, arg2: CValuesRef<time_tVar>?): errno_t {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val _arg2 = arg2?.getPointer(memScope).rawValue
        val res = kni__wctime_s(_arg0, _arg1, _arg2)
        res
    }
}

@SymbolName("sdl_kni__wctime_s")
private external fun kni__wctime_s(arg0: NativePtr, arg1: Long, arg2: NativePtr): Int

fun difftime(_Time1: time_t, _Time2: time_t): Double {
    val __Time1 = _Time1
    val __Time2 = _Time2
    val res = kni_difftime(__Time1, __Time2)
    return res
}

@SymbolName("sdl_kni_difftime")
private external fun kni_difftime(_Time1: Long, _Time2: Long): Double

fun ctime(_Time: CValuesRef<time_tVar>?): CPointer<ByteVar>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni_ctime(__Time)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sdl_kni_ctime")
private external fun kni_ctime(_Time: NativePtr): NativePtr

fun gmtime(_Time: CValuesRef<time_tVar>?): CPointer<tm>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni_gmtime(__Time)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("sdl_kni_gmtime")
private external fun kni_gmtime(_Time: NativePtr): NativePtr

fun localtime(_Time: CValuesRef<time_tVar>?): CPointer<tm>? {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni_localtime(__Time)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("sdl_kni_localtime")
private external fun kni_localtime(_Time: NativePtr): NativePtr

fun mktime(_Tm: CValuesRef<tm>?): time_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni_mktime(__Tm)
        res
    }
}

@SymbolName("sdl_kni_mktime")
private external fun kni_mktime(_Tm: NativePtr): Long

fun _mkgmtime(_Tm: CValuesRef<tm>?): time_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val res = kni__mkgmtime(__Tm)
        res
    }
}

@SymbolName("sdl_kni__mkgmtime")
private external fun kni__mkgmtime(_Tm: NativePtr): Long

fun time(_Time: CValuesRef<time_tVar>?): time_t {
    return memScoped {
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni_time(__Time)
        res
    }
}

@SymbolName("sdl_kni_time")
private external fun kni_time(_Time: NativePtr): Long

fun localtime_s(_Tm: CValuesRef<tm>?, _Time: CValuesRef<time_tVar>?): errno_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni_localtime_s(__Tm, __Time)
        res
    }
}

@SymbolName("sdl_kni_localtime_s")
private external fun kni_localtime_s(_Tm: NativePtr, _Time: NativePtr): Int

fun gmtime_s(_Tm: CValuesRef<tm>?, _Time: CValuesRef<time_tVar>?): errno_t {
    return memScoped {
        val __Tm = _Tm?.getPointer(memScope).rawValue
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni_gmtime_s(__Tm, __Time)
        res
    }
}

@SymbolName("sdl_kni_gmtime_s")
private external fun kni_gmtime_s(_Tm: NativePtr, _Time: NativePtr): Int

fun ctime_s(_Buf: CValuesRef<ByteVar>?, _SizeInBytes: size_t, _Time: CValuesRef<time_tVar>?): errno_t {
    return memScoped {
        val __Buf = _Buf?.getPointer(memScope).rawValue
        val __SizeInBytes = _SizeInBytes
        val __Time = _Time?.getPointer(memScope).rawValue
        val res = kni_ctime_s(__Buf, __SizeInBytes, __Time)
        res
    }
}

@SymbolName("sdl_kni_ctime_s")
private external fun kni_ctime_s(_Buf: NativePtr, _SizeInBytes: Long, _Time: NativePtr): Int

fun mingw_gettimeofday(p: CValuesRef<timeval>?, z: CValuesRef<timezone>?): Int {
    return memScoped {
        val _p = p?.getPointer(memScope).rawValue
        val _z = z?.getPointer(memScope).rawValue
        val res = kni_mingw_gettimeofday(_p, _z)
        res
    }
}

@SymbolName("sdl_kni_mingw_gettimeofday")
private external fun kni_mingw_gettimeofday(p: NativePtr, z: NativePtr): Int

val HAVE_WINAPIFAMILY_H: Int = 0

val WINAPI_FAMILY_WINRT: Int = 0

val __WINDOWS__: Int = 1

val __WIN32__: Int = 1

val HAVE_STDINT_H: Int = 1

val SIZEOF_VOIDP: Int = 8

val HAVE_DDRAW_H: Int = 1

val HAVE_DINPUT_H: Int = 1

val HAVE_DSOUND_H: Int = 1

val HAVE_DXGI_H: Int = 1

val HAVE_XINPUT_H: Int = 1

val HAVE_STDARG_H: Int = 1

val HAVE_STDDEF_H: Int = 1

val SDL_AUDIO_DRIVER_WASAPI: Int = 1

val SDL_AUDIO_DRIVER_DSOUND: Int = 1

val SDL_AUDIO_DRIVER_XAUDIO2: Int = 0

val SDL_AUDIO_DRIVER_WINMM: Int = 1

val SDL_AUDIO_DRIVER_DISK: Int = 1

val SDL_AUDIO_DRIVER_DUMMY: Int = 1

val SDL_JOYSTICK_DINPUT: Int = 1

val SDL_JOYSTICK_XINPUT: Int = 1

val SDL_HAPTIC_DINPUT: Int = 1

val SDL_HAPTIC_XINPUT: Int = 1

val SDL_LOADSO_WINDOWS: Int = 1

val SDL_THREAD_WINDOWS: Int = 1

val SDL_TIMER_WINDOWS: Int = 1

val SDL_VIDEO_DRIVER_DUMMY: Int = 1

val SDL_VIDEO_DRIVER_WINDOWS: Int = 1

val SDL_VIDEO_RENDER_D3D: Int = 1

val SDL_VIDEO_RENDER_D3D11: Int = 0

val SDL_VIDEO_OPENGL: Int = 1

val SDL_VIDEO_OPENGL_WGL: Int = 1

val SDL_VIDEO_RENDER_OGL: Int = 1

val SDL_VIDEO_RENDER_OGL_ES2: Int = 1

val SDL_VIDEO_OPENGL_ES2: Int = 1

val SDL_VIDEO_OPENGL_EGL: Int = 1

val SDL_VIDEO_VULKAN: Int = 1

val SDL_POWER_WINDOWS: Int = 1

val SDL_FILESYSTEM_WINDOWS: Int = 1

val M_PI: Double = bitsToDouble(4614256656552045848) /* == 3.141592653589793 */

val SDL_ICONV_ERROR: size_t = -1

val SDL_ICONV_E2BIG: size_t = -2

val SDL_ICONV_EILSEQ: size_t = -3

val SDL_ICONV_EINVAL: size_t = -4

val SDL_ASSERT_LEVEL: Int = 2

val SDL_LINE: Int = 1

val SDL_NULL_WHILE_LOOP_CONDITION: Int = 0

val SDL_LIL_ENDIAN: Int = 1234

val SDL_BIG_ENDIAN: Int = 4321

val SDL_BYTEORDER: Int = 1234

val SDL_MUTEX_TIMEDOUT: Int = 1

val SDL_MUTEX_MAXWAIT: Uint32 = -1

val SDL_RWOPS_UNKNOWN: Int = 0

val SDL_RWOPS_WINFILE: Int = 1

val SDL_RWOPS_STDFILE: Int = 2

val SDL_RWOPS_JNIFILE: Int = 3

val SDL_RWOPS_MEMORY: Int = 4

val SDL_RWOPS_MEMORY_RO: Int = 5

val RW_SEEK_SET: Int = 0

val RW_SEEK_CUR: Int = 1

val RW_SEEK_END: Int = 2

val SDL_AUDIO_MASK_BITSIZE: Int = 255

val SDL_AUDIO_MASK_DATATYPE: Int = 256

val SDL_AUDIO_MASK_ENDIAN: Int = 4096

val SDL_AUDIO_MASK_SIGNED: Int = 32768

val AUDIO_U8: Int = 8

val AUDIO_S8: Int = 32776

val AUDIO_U16LSB: Int = 16

val AUDIO_S16LSB: Int = 32784

val AUDIO_U16MSB: Int = 4112

val AUDIO_S16MSB: Int = 36880

val AUDIO_U16: Int = 16

val AUDIO_S16: Int = 32784

val AUDIO_S32LSB: Int = 32800

val AUDIO_S32MSB: Int = 36896

val AUDIO_S32: Int = 32800

val AUDIO_F32LSB: Int = 33056

val AUDIO_F32MSB: Int = 37152

val AUDIO_F32: Int = 33056

val AUDIO_U16SYS: Int = 16

val AUDIO_S16SYS: Int = 32784

val AUDIO_S32SYS: Int = 32800

val AUDIO_F32SYS: Int = 33056

val SDL_AUDIO_ALLOW_FREQUENCY_CHANGE: Int = 1

val SDL_AUDIO_ALLOW_FORMAT_CHANGE: Int = 2

val SDL_AUDIO_ALLOW_CHANNELS_CHANGE: Int = 4

val SDL_AUDIO_ALLOW_ANY_CHANGE: Int = 7

val SDL_AUDIOCVT_MAX_FILTERS: Int = 9

val SDL_MIX_MAXVOLUME: Int = 128

val __USE_MINGW_STRTOX: Int = 1

val EXIT_SUCCESS: Int = 0

val EXIT_FAILURE: Int = 1

val RAND_MAX: Int = 32767

val _MAX_PATH: Int = 260

val _MAX_DRIVE: Int = 3

val _MAX_DIR: Int = 256

val _MAX_FNAME: Int = 256

val _MAX_EXT: Int = 256

val _OUT_TO_DEFAULT: Int = 0

val _OUT_TO_STDERR: Int = 1

val _OUT_TO_MSGBOX: Int = 2

val _REPORT_ERRMODE: Int = 3

val _WRITE_ABORT_MSG: Int = 1

val _CALL_REPORTFAULT: Int = 2

val _MAX_ENV: Int = 32767

val _CVTBUFSIZE: Int = 349

val SDL_CACHELINE_SIZE: Int = 128

val SDL_ALPHA_OPAQUE: Int = 255

val SDL_ALPHA_TRANSPARENT: Int = 0

val SDL_SWSURFACE: Int = 0

val SDL_PREALLOC: Int = 1

val SDL_RLEACCEL: Int = 2

val SDL_DONTFREE: Int = 4

val SDL_WINDOWPOS_UNDEFINED_MASK: Int = 536805376

val SDL_WINDOWPOS_UNDEFINED: Int = 536805376

val SDL_WINDOWPOS_CENTERED_MASK: Int = 805240832

val SDL_WINDOWPOS_CENTERED: Int = 805240832

val SDLK_SCANCODE_MASK: Int = 1073741824

val KMOD_CTRL: Int = 192

val KMOD_SHIFT: Int = 3

val KMOD_ALT: Int = 768

val KMOD_GUI: Int = 3072

val SDL_BUTTON_LEFT: Int = 1

val SDL_BUTTON_MIDDLE: Int = 2

val SDL_BUTTON_RIGHT: Int = 3

val SDL_BUTTON_X1: Int = 4

val SDL_BUTTON_X2: Int = 5

val SDL_BUTTON_LMASK: Int = 1

val SDL_BUTTON_MMASK: Int = 2

val SDL_BUTTON_RMASK: Int = 4

val SDL_BUTTON_X1MASK: Int = 8

val SDL_BUTTON_X2MASK: Int = 16

val SDL_JOYSTICK_AXIS_MAX: Int = 32767

val SDL_JOYSTICK_AXIS_MIN: Int = -32768

val SDL_HAT_CENTERED: Int = 0

val SDL_HAT_UP: Int = 1

val SDL_HAT_RIGHT: Int = 2

val SDL_HAT_DOWN: Int = 4

val SDL_HAT_LEFT: Int = 8

val SDL_HAT_RIGHTUP: Int = 3

val SDL_HAT_RIGHTDOWN: Int = 6

val SDL_HAT_LEFTUP: Int = 9

val SDL_HAT_LEFTDOWN: Int = 12

val SDL_TOUCH_MOUSEID: Uint32 = -1

val SDL_RELEASED: Int = 0

val SDL_PRESSED: Int = 1

val SDL_TEXTEDITINGEVENT_TEXT_SIZE: Int = 32

val SDL_TEXTINPUTEVENT_TEXT_SIZE: Int = 32

val SDL_QUERY: Int = -1

val SDL_IGNORE: Int = 0

val SDL_DISABLE: Int = 0

val SDL_ENABLE: Int = 1

val SDL_HAPTIC_CONSTANT: Int = 1

val SDL_HAPTIC_SINE: Int = 2

val SDL_HAPTIC_LEFTRIGHT: Int = 4

val SDL_HAPTIC_TRIANGLE: Int = 8

val SDL_HAPTIC_SAWTOOTHUP: Int = 16

val SDL_HAPTIC_SAWTOOTHDOWN: Int = 32

val SDL_HAPTIC_RAMP: Int = 64

val SDL_HAPTIC_SPRING: Int = 128

val SDL_HAPTIC_DAMPER: Int = 256

val SDL_HAPTIC_INERTIA: Int = 512

val SDL_HAPTIC_FRICTION: Int = 1024

val SDL_HAPTIC_CUSTOM: Int = 2048

val SDL_HAPTIC_GAIN: Int = 4096

val SDL_HAPTIC_AUTOCENTER: Int = 8192

val SDL_HAPTIC_STATUS: Int = 16384

val SDL_HAPTIC_PAUSE: Int = 32768

val SDL_HAPTIC_POLAR: Int = 0

val SDL_HAPTIC_CARTESIAN: Int = 1

val SDL_HAPTIC_SPHERICAL: Int = 2

val SDL_HAPTIC_INFINITY: Int = -1

val SDL_MAX_LOG_MESSAGE: Int = 4096

val SDL_NONSHAPEABLE_WINDOW: Int = -1

val SDL_INVALID_SHAPE_ARGUMENT: Int = -2

val SDL_WINDOW_LACKS_SHAPE: Int = -3

val SDL_MAJOR_VERSION: Int = 2

val SDL_MINOR_VERSION: Int = 0

val SDL_PATCHLEVEL: Int = 6

val SDL_COMPILEDVERSION: Int = 2006

val SDL_INIT_TIMER: Int = 1

val SDL_INIT_AUDIO: Int = 16

val SDL_INIT_VIDEO: Int = 32

val SDL_INIT_JOYSTICK: Int = 512

val SDL_INIT_HAPTIC: Int = 4096

val SDL_INIT_GAMECONTROLLER: Int = 8192

val SDL_INIT_EVENTS: Int = 16384

val SDL_INIT_NOPARACHUTE: Int = 1048576

val SDL_INIT_EVERYTHING: Int = 29233

val CLOCKS_PER_SEC: Int = 1000

val CLK_TCK: Int = 1000

class _SDL_iconv_t(override val rawPtr: NativePtr) : COpaque

class SDL_AssertData(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(48, 8)
    
    var always_ignore: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var trigger_count: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var condition: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var filename: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var linenum: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var function: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
    var next: CPointer<SDL_AssertData>?
        get() = memberAt<CPointerVar<SDL_AssertData>>(40).value
        set(value) { memberAt<CPointerVar<SDL_AssertData>>(40).value = value }
    
}

class SDL_atomic_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(4, 4)
    
    var value: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
}

class SDL_mutex(override val rawPtr: NativePtr) : COpaque

class SDL_semaphore(override val rawPtr: NativePtr) : COpaque

class SDL_cond(override val rawPtr: NativePtr) : COpaque

class SDL_Thread(override val rawPtr: NativePtr) : COpaque

class SDL_RWops(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(88, 8)
    
    var size: CPointer<CFunction<(CPointer<SDL_RWops>?) -> Sint64>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?) -> Sint64>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?) -> Sint64>>>(0).value = value }
    
    var seek: CPointer<CFunction<(CPointer<SDL_RWops>?, Sint64, Int) -> Sint64>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, Sint64, Int) -> Sint64>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, Sint64, Int) -> Sint64>>>(8).value = value }
    
    var read: CPointer<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>>(16).value = value }
    
    var write: CPointer<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?, COpaquePointer?, size_t, size_t) -> size_t>>>(24).value = value }
    
    var close: CPointer<CFunction<(CPointer<SDL_RWops>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?) -> Int>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<SDL_RWops>?) -> Int>>>(32).value = value }
    
    var type: Uint32
        get() = memberAt<Uint32Var>(40).value
        set(value) { memberAt<Uint32Var>(40).value = value }
    
    val hidden: anonymousStruct1
        get() = memberAt(48)
    
}

class anonymousStruct1(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(40, 8)
    
    val windowsio: anonymousStruct2
        get() = memberAt(0)
    
    val mem: anonymousStruct3
        get() = memberAt(0)
    
    val unknown: anonymousStruct4
        get() = memberAt(0)
    
}

class anonymousStruct2(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(40, 8)
    
    var append: SDL_bool
        get() = memberAt<SDL_boolVar>(0).value
        set(value) { memberAt<SDL_boolVar>(0).value = value }
    
    var h: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    val buffer: anonymousStruct5
        get() = memberAt(16)
    
}

class anonymousStruct5(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var size: size_t
        get() = memberAt<size_tVar>(8).value
        set(value) { memberAt<size_tVar>(8).value = value }
    
    var left: size_t
        get() = memberAt<size_tVar>(16).value
        set(value) { memberAt<size_tVar>(16).value = value }
    
}

class anonymousStruct3(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var base: CPointer<Uint8Var>?
        get() = memberAt<CPointerVar<Uint8Var>>(0).value
        set(value) { memberAt<CPointerVar<Uint8Var>>(0).value = value }
    
    var here: CPointer<Uint8Var>?
        get() = memberAt<CPointerVar<Uint8Var>>(8).value
        set(value) { memberAt<CPointerVar<Uint8Var>>(8).value = value }
    
    var stop: CPointer<Uint8Var>?
        get() = memberAt<CPointerVar<Uint8Var>>(16).value
        set(value) { memberAt<CPointerVar<Uint8Var>>(16).value = value }
    
}

class anonymousStruct4(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var data1: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var data2: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
}

class SDL_AudioSpec(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(32, 8)
    
    var freq: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var format: SDL_AudioFormat
        get() = memberAt<SDL_AudioFormatVar>(4).value
        set(value) { memberAt<SDL_AudioFormatVar>(4).value = value }
    
    var channels: Uint8
        get() = memberAt<Uint8Var>(6).value
        set(value) { memberAt<Uint8Var>(6).value = value }
    
    var silence: Uint8
        get() = memberAt<Uint8Var>(7).value
        set(value) { memberAt<Uint8Var>(7).value = value }
    
    var samples: Uint16
        get() = memberAt<Uint16Var>(8).value
        set(value) { memberAt<Uint16Var>(8).value = value }
    
    var padding: Uint16
        get() = memberAt<Uint16Var>(10).value
        set(value) { memberAt<Uint16Var>(10).value = value }
    
    var size: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
    var callback: SDL_AudioCallback?
        get() = memberAt<SDL_AudioCallbackVar>(16).value
        set(value) { memberAt<SDL_AudioCallbackVar>(16).value = value }
    
    var userdata: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(24).value
        set(value) { memberAt<COpaquePointerVar>(24).value = value }
    
}

class SDL_AudioCVT(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(128, 1)
    
    var needed: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var src_format: SDL_AudioFormat
        get() = memberAt<SDL_AudioFormatVar>(4).value
        set(value) { memberAt<SDL_AudioFormatVar>(4).value = value }
    
    var dst_format: SDL_AudioFormat
        get() = memberAt<SDL_AudioFormatVar>(6).value
        set(value) { memberAt<SDL_AudioFormatVar>(6).value = value }
    
    var rate_incr: Double
        get() = memberAt<DoubleVar>(8).value
        set(value) { memberAt<DoubleVar>(8).value = value }
    
    var buf: CPointer<Uint8Var>?
        get() = memberAt<CPointerVar<Uint8Var>>(16).value
        set(value) { memberAt<CPointerVar<Uint8Var>>(16).value = value }
    
    var len: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var len_cvt: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var len_mult: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var len_ratio: Double
        get() = memberAt<DoubleVar>(36).value
        set(value) { memberAt<DoubleVar>(36).value = value }
    
    val filters: CArrayPointer<SDL_AudioFilterVar>
        get() = arrayMemberAt(44)
    
    var filter_index: Int
        get() = memberAt<IntVar>(124).value
        set(value) { memberAt<IntVar>(124).value = value }
    
}

class _div_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var quot: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var rem: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class _ldiv_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var quot: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var rem: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class _LDOUBLE(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(10, 1)
    
    val ld: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
}

class _CRT_DOUBLE(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 8)
    
    var x: Double
        get() = memberAt<DoubleVar>(0).value
        set(value) { memberAt<DoubleVar>(0).value = value }
    
}

class _CRT_FLOAT(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(4, 4)
    
    var f: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
}

class _LONGDOUBLE(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 16)
    
}

class _LDBL12(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 1)
    
    val ld12: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
}

class localeinfo_struct(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var locinfo: pthreadlocinfo?
        get() = memberAt<pthreadlocinfoVar>(0).value
        set(value) { memberAt<pthreadlocinfoVar>(0).value = value }
    
    var mbcinfo: pthreadmbcinfo?
        get() = memberAt<pthreadmbcinfoVar>(8).value
        set(value) { memberAt<pthreadmbcinfoVar>(8).value = value }
    
}

class threadlocaleinfostruct(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(352, 8)
    
    var refcount: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var lc_codepage: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var lc_collate_cp: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    val lc_handle: CArrayPointer<IntVar>
        get() = arrayMemberAt(12)
    
    val lc_id: CArrayPointer<LC_ID>
        get() = arrayMemberAt(36)
    
    val lc_category: CArrayPointer<anonymousStruct6>
        get() = arrayMemberAt(72)
    
    var lc_clike: Int
        get() = memberAt<IntVar>(264).value
        set(value) { memberAt<IntVar>(264).value = value }
    
    var mb_cur_max: Int
        get() = memberAt<IntVar>(268).value
        set(value) { memberAt<IntVar>(268).value = value }
    
    var lconv_intl_refcount: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(272).value
        set(value) { memberAt<CPointerVar<IntVar>>(272).value = value }
    
    var lconv_num_refcount: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(280).value
        set(value) { memberAt<CPointerVar<IntVar>>(280).value = value }
    
    var lconv_mon_refcount: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(288).value
        set(value) { memberAt<CPointerVar<IntVar>>(288).value = value }
    
    var lconv: CPointer<lconvStruct>?
        get() = memberAt<CPointerVar<lconvStruct>>(296).value
        set(value) { memberAt<CPointerVar<lconvStruct>>(296).value = value }
    
    var ctype1_refcount: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(304).value
        set(value) { memberAt<CPointerVar<IntVar>>(304).value = value }
    
    var ctype1: CPointer<ShortVar>?
        get() = memberAt<CPointerVar<ShortVar>>(312).value
        set(value) { memberAt<CPointerVar<ShortVar>>(312).value = value }
    
    var pctype: CPointer<ShortVar>?
        get() = memberAt<CPointerVar<ShortVar>>(320).value
        set(value) { memberAt<CPointerVar<ShortVar>>(320).value = value }
    
    var pclmap: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(328).value
        set(value) { memberAt<CPointerVar<ByteVar>>(328).value = value }
    
    var pcumap: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(336).value
        set(value) { memberAt<CPointerVar<ByteVar>>(336).value = value }
    
    var lc_time_curr: CPointer<__lc_time_data>?
        get() = memberAt<CPointerVar<__lc_time_data>>(344).value
        set(value) { memberAt<CPointerVar<__lc_time_data>>(344).value = value }
    
}

class tagLC_ID(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(6, 2)
    
    var wLanguage: Short
        get() = memberAt<ShortVar>(0).value
        set(value) { memberAt<ShortVar>(0).value = value }
    
    var wCountry: Short
        get() = memberAt<ShortVar>(2).value
        set(value) { memberAt<ShortVar>(2).value = value }
    
    var wCodePage: Short
        get() = memberAt<ShortVar>(4).value
        set(value) { memberAt<ShortVar>(4).value = value }
    
}

class anonymousStruct6(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(32, 8)
    
    var locale: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var wlocale: CPointer<wchar_tVar>?
        get() = memberAt<CPointerVar<wchar_tVar>>(8).value
        set(value) { memberAt<CPointerVar<wchar_tVar>>(8).value = value }
    
    var refcount: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(16).value
        set(value) { memberAt<CPointerVar<IntVar>>(16).value = value }
    
    var wrefcount: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(24).value
        set(value) { memberAt<CPointerVar<IntVar>>(24).value = value }
    
}

class lconvStruct(override val rawPtr: NativePtr) : COpaque

class __lc_time_data(override val rawPtr: NativePtr) : COpaque

class threadmbcinfostruct(override val rawPtr: NativePtr) : COpaque

class lldiv_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var quot: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    var rem: Long
        get() = memberAt<LongVar>(8).value
        set(value) { memberAt<LongVar>(8).value = value }
    
}

class SDL_Color(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(4, 1)
    
    var r: Uint8
        get() = memberAt<Uint8Var>(0).value
        set(value) { memberAt<Uint8Var>(0).value = value }
    
    var g: Uint8
        get() = memberAt<Uint8Var>(1).value
        set(value) { memberAt<Uint8Var>(1).value = value }
    
    var b: Uint8
        get() = memberAt<Uint8Var>(2).value
        set(value) { memberAt<Uint8Var>(2).value = value }
    
    var a: Uint8
        get() = memberAt<Uint8Var>(3).value
        set(value) { memberAt<Uint8Var>(3).value = value }
    
}

class SDL_Palette(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var ncolors: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var colors: CPointer<SDL_Color>?
        get() = memberAt<CPointerVar<SDL_Color>>(8).value
        set(value) { memberAt<CPointerVar<SDL_Color>>(8).value = value }
    
    var version: Uint32
        get() = memberAt<Uint32Var>(16).value
        set(value) { memberAt<Uint32Var>(16).value = value }
    
    var refcount: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
}

class SDL_PixelFormat(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(56, 8)
    
    var format: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var palette: CPointer<SDL_Palette>?
        get() = memberAt<CPointerVar<SDL_Palette>>(8).value
        set(value) { memberAt<CPointerVar<SDL_Palette>>(8).value = value }
    
    var BitsPerPixel: Uint8
        get() = memberAt<Uint8Var>(16).value
        set(value) { memberAt<Uint8Var>(16).value = value }
    
    var BytesPerPixel: Uint8
        get() = memberAt<Uint8Var>(17).value
        set(value) { memberAt<Uint8Var>(17).value = value }
    
    val padding: CArrayPointer<Uint8Var>
        get() = arrayMemberAt(18)
    
    var Rmask: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var Gmask: Uint32
        get() = memberAt<Uint32Var>(24).value
        set(value) { memberAt<Uint32Var>(24).value = value }
    
    var Bmask: Uint32
        get() = memberAt<Uint32Var>(28).value
        set(value) { memberAt<Uint32Var>(28).value = value }
    
    var Amask: Uint32
        get() = memberAt<Uint32Var>(32).value
        set(value) { memberAt<Uint32Var>(32).value = value }
    
    var Rloss: Uint8
        get() = memberAt<Uint8Var>(36).value
        set(value) { memberAt<Uint8Var>(36).value = value }
    
    var Gloss: Uint8
        get() = memberAt<Uint8Var>(37).value
        set(value) { memberAt<Uint8Var>(37).value = value }
    
    var Bloss: Uint8
        get() = memberAt<Uint8Var>(38).value
        set(value) { memberAt<Uint8Var>(38).value = value }
    
    var Aloss: Uint8
        get() = memberAt<Uint8Var>(39).value
        set(value) { memberAt<Uint8Var>(39).value = value }
    
    var Rshift: Uint8
        get() = memberAt<Uint8Var>(40).value
        set(value) { memberAt<Uint8Var>(40).value = value }
    
    var Gshift: Uint8
        get() = memberAt<Uint8Var>(41).value
        set(value) { memberAt<Uint8Var>(41).value = value }
    
    var Bshift: Uint8
        get() = memberAt<Uint8Var>(42).value
        set(value) { memberAt<Uint8Var>(42).value = value }
    
    var Ashift: Uint8
        get() = memberAt<Uint8Var>(43).value
        set(value) { memberAt<Uint8Var>(43).value = value }
    
    var refcount: Int
        get() = memberAt<IntVar>(44).value
        set(value) { memberAt<IntVar>(44).value = value }
    
    var next: CPointer<SDL_PixelFormat>?
        get() = memberAt<CPointerVar<SDL_PixelFormat>>(48).value
        set(value) { memberAt<CPointerVar<SDL_PixelFormat>>(48).value = value }
    
}

class SDL_Point(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class SDL_Rect(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var w: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var h: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class SDL_Surface(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(96, 8)
    
    var flags: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var format: CPointer<SDL_PixelFormat>?
        get() = memberAt<CPointerVar<SDL_PixelFormat>>(8).value
        set(value) { memberAt<CPointerVar<SDL_PixelFormat>>(8).value = value }
    
    var w: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var h: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var pitch: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var pixels: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(32).value
        set(value) { memberAt<COpaquePointerVar>(32).value = value }
    
    var userdata: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(40).value
        set(value) { memberAt<COpaquePointerVar>(40).value = value }
    
    var locked: Int
        get() = memberAt<IntVar>(48).value
        set(value) { memberAt<IntVar>(48).value = value }
    
    var lock_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(56).value
        set(value) { memberAt<COpaquePointerVar>(56).value = value }
    
    val clip_rect: SDL_Rect
        get() = memberAt(64)
    
    var map: CPointer<SDL_BlitMap>?
        get() = memberAt<CPointerVar<SDL_BlitMap>>(80).value
        set(value) { memberAt<CPointerVar<SDL_BlitMap>>(80).value = value }
    
    var refcount: Int
        get() = memberAt<IntVar>(88).value
        set(value) { memberAt<IntVar>(88).value = value }
    
}

class SDL_BlitMap(override val rawPtr: NativePtr) : COpaque

class SDL_DisplayMode(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var format: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var w: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var h: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var refresh_rate: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var driverdata: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
}

class SDL_Window(override val rawPtr: NativePtr) : COpaque

class SDL_Keysym(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var scancode: SDL_Scancode
        get() = memberAt<SDL_ScancodeVar>(0).value
        set(value) { memberAt<SDL_ScancodeVar>(0).value = value }
    
    var sym: SDL_Keycode
        get() = memberAt<SDL_KeycodeVar>(4).value
        set(value) { memberAt<SDL_KeycodeVar>(4).value = value }
    
    var mod: Uint16
        get() = memberAt<Uint16Var>(8).value
        set(value) { memberAt<Uint16Var>(8).value = value }
    
    var unused: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
}

class SDL_Cursor(override val rawPtr: NativePtr) : COpaque

class _SDL_Joystick(override val rawPtr: NativePtr) : COpaque

class SDL_JoystickGUID(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 1)
    
    val data: CArrayPointer<Uint8Var>
        get() = arrayMemberAt(0)
    
}

class _SDL_GameController(override val rawPtr: NativePtr) : COpaque

class SDL_GameControllerButtonBind(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var bindType: SDL_GameControllerBindType
        get() = memberAt<SDL_GameControllerBindTypeVar>(0).value
        set(value) { memberAt<SDL_GameControllerBindTypeVar>(0).value = value }
    
    val value: anonymousStruct7
        get() = memberAt(4)
    
}

class anonymousStruct7(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var button: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var axis: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    val hat: anonymousStruct8
        get() = memberAt(0)
    
}

class anonymousStruct8(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var hat: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var hat_mask: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class SDL_Finger(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var id: SDL_FingerID
        get() = memberAt<SDL_FingerIDVar>(0).value
        set(value) { memberAt<SDL_FingerIDVar>(0).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
    var pressure: Float
        get() = memberAt<FloatVar>(16).value
        set(value) { memberAt<FloatVar>(16).value = value }
    
}

class SDL_CommonEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
}

class SDL_WindowEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var event: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    var data1: Sint32
        get() = memberAt<Sint32Var>(16).value
        set(value) { memberAt<Sint32Var>(16).value = value }
    
    var data2: Sint32
        get() = memberAt<Sint32Var>(20).value
        set(value) { memberAt<Sint32Var>(20).value = value }
    
}

class SDL_KeyboardEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(32, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var state: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var repeat: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    val keysym: SDL_Keysym
        get() = memberAt(16)
    
}

class SDL_TextEditingEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(52, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    val text: CArrayPointer<ByteVar>
        get() = arrayMemberAt(12)
    
    var start: Sint32
        get() = memberAt<Sint32Var>(44).value
        set(value) { memberAt<Sint32Var>(44).value = value }
    
    var length: Sint32
        get() = memberAt<Sint32Var>(48).value
        set(value) { memberAt<Sint32Var>(48).value = value }
    
}

class SDL_TextInputEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(44, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    val text: CArrayPointer<ByteVar>
        get() = arrayMemberAt(12)
    
}

class SDL_MouseMotionEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(36, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var which: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
    var state: Uint32
        get() = memberAt<Uint32Var>(16).value
        set(value) { memberAt<Uint32Var>(16).value = value }
    
    var x: Sint32
        get() = memberAt<Sint32Var>(20).value
        set(value) { memberAt<Sint32Var>(20).value = value }
    
    var y: Sint32
        get() = memberAt<Sint32Var>(24).value
        set(value) { memberAt<Sint32Var>(24).value = value }
    
    var xrel: Sint32
        get() = memberAt<Sint32Var>(28).value
        set(value) { memberAt<Sint32Var>(28).value = value }
    
    var yrel: Sint32
        get() = memberAt<Sint32Var>(32).value
        set(value) { memberAt<Sint32Var>(32).value = value }
    
}

class SDL_MouseButtonEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(28, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var which: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
    var button: Uint8
        get() = memberAt<Uint8Var>(16).value
        set(value) { memberAt<Uint8Var>(16).value = value }
    
    var state: Uint8
        get() = memberAt<Uint8Var>(17).value
        set(value) { memberAt<Uint8Var>(17).value = value }
    
    var clicks: Uint8
        get() = memberAt<Uint8Var>(18).value
        set(value) { memberAt<Uint8Var>(18).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(19).value
        set(value) { memberAt<Uint8Var>(19).value = value }
    
    var x: Sint32
        get() = memberAt<Sint32Var>(20).value
        set(value) { memberAt<Sint32Var>(20).value = value }
    
    var y: Sint32
        get() = memberAt<Sint32Var>(24).value
        set(value) { memberAt<Sint32Var>(24).value = value }
    
}

class SDL_MouseWheelEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(28, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var which: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
    var x: Sint32
        get() = memberAt<Sint32Var>(16).value
        set(value) { memberAt<Sint32Var>(16).value = value }
    
    var y: Sint32
        get() = memberAt<Sint32Var>(20).value
        set(value) { memberAt<Sint32Var>(20).value = value }
    
    var direction: Uint32
        get() = memberAt<Uint32Var>(24).value
        set(value) { memberAt<Uint32Var>(24).value = value }
    
}

class SDL_JoyAxisEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(20, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var axis: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    var value: Sint16
        get() = memberAt<Sint16Var>(16).value
        set(value) { memberAt<Sint16Var>(16).value = value }
    
    var padding4: Uint16
        get() = memberAt<Uint16Var>(18).value
        set(value) { memberAt<Uint16Var>(18).value = value }
    
}

class SDL_JoyBallEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(20, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var ball: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    var xrel: Sint16
        get() = memberAt<Sint16Var>(16).value
        set(value) { memberAt<Sint16Var>(16).value = value }
    
    var yrel: Sint16
        get() = memberAt<Sint16Var>(18).value
        set(value) { memberAt<Sint16Var>(18).value = value }
    
}

class SDL_JoyHatEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var hat: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var value: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
}

class SDL_JoyButtonEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var button: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var state: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
}

class SDL_JoyDeviceEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: Sint32
        get() = memberAt<Sint32Var>(8).value
        set(value) { memberAt<Sint32Var>(8).value = value }
    
}

class SDL_ControllerAxisEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(20, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var axis: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
    var value: Sint16
        get() = memberAt<Sint16Var>(16).value
        set(value) { memberAt<Sint16Var>(16).value = value }
    
    var padding4: Uint16
        get() = memberAt<Uint16Var>(18).value
        set(value) { memberAt<Uint16Var>(18).value = value }
    
}

class SDL_ControllerButtonEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: SDL_JoystickID
        get() = memberAt<SDL_JoystickIDVar>(8).value
        set(value) { memberAt<SDL_JoystickIDVar>(8).value = value }
    
    var button: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var state: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
}

class SDL_ControllerDeviceEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: Sint32
        get() = memberAt<Sint32Var>(8).value
        set(value) { memberAt<Sint32Var>(8).value = value }
    
}

class SDL_AudioDeviceEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var which: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var iscapture: Uint8
        get() = memberAt<Uint8Var>(12).value
        set(value) { memberAt<Uint8Var>(12).value = value }
    
    var padding1: Uint8
        get() = memberAt<Uint8Var>(13).value
        set(value) { memberAt<Uint8Var>(13).value = value }
    
    var padding2: Uint8
        get() = memberAt<Uint8Var>(14).value
        set(value) { memberAt<Uint8Var>(14).value = value }
    
    var padding3: Uint8
        get() = memberAt<Uint8Var>(15).value
        set(value) { memberAt<Uint8Var>(15).value = value }
    
}

class SDL_TouchFingerEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(48, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var touchId: SDL_TouchID
        get() = memberAt<SDL_TouchIDVar>(8).value
        set(value) { memberAt<SDL_TouchIDVar>(8).value = value }
    
    var fingerId: SDL_FingerID
        get() = memberAt<SDL_FingerIDVar>(16).value
        set(value) { memberAt<SDL_FingerIDVar>(16).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(24).value
        set(value) { memberAt<FloatVar>(24).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(28).value
        set(value) { memberAt<FloatVar>(28).value = value }
    
    var dx: Float
        get() = memberAt<FloatVar>(32).value
        set(value) { memberAt<FloatVar>(32).value = value }
    
    var dy: Float
        get() = memberAt<FloatVar>(36).value
        set(value) { memberAt<FloatVar>(36).value = value }
    
    var pressure: Float
        get() = memberAt<FloatVar>(40).value
        set(value) { memberAt<FloatVar>(40).value = value }
    
}

class SDL_MultiGestureEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(40, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var touchId: SDL_TouchID
        get() = memberAt<SDL_TouchIDVar>(8).value
        set(value) { memberAt<SDL_TouchIDVar>(8).value = value }
    
    var dTheta: Float
        get() = memberAt<FloatVar>(16).value
        set(value) { memberAt<FloatVar>(16).value = value }
    
    var dDist: Float
        get() = memberAt<FloatVar>(20).value
        set(value) { memberAt<FloatVar>(20).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(24).value
        set(value) { memberAt<FloatVar>(24).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(28).value
        set(value) { memberAt<FloatVar>(28).value = value }
    
    var numFingers: Uint16
        get() = memberAt<Uint16Var>(32).value
        set(value) { memberAt<Uint16Var>(32).value = value }
    
    var padding: Uint16
        get() = memberAt<Uint16Var>(34).value
        set(value) { memberAt<Uint16Var>(34).value = value }
    
}

class SDL_DollarGestureEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(40, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var touchId: SDL_TouchID
        get() = memberAt<SDL_TouchIDVar>(8).value
        set(value) { memberAt<SDL_TouchIDVar>(8).value = value }
    
    var gestureId: SDL_GestureID
        get() = memberAt<SDL_GestureIDVar>(16).value
        set(value) { memberAt<SDL_GestureIDVar>(16).value = value }
    
    var numFingers: Uint32
        get() = memberAt<Uint32Var>(24).value
        set(value) { memberAt<Uint32Var>(24).value = value }
    
    var error: Float
        get() = memberAt<FloatVar>(28).value
        set(value) { memberAt<FloatVar>(28).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(32).value
        set(value) { memberAt<FloatVar>(32).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(36).value
        set(value) { memberAt<FloatVar>(36).value = value }
    
}

class SDL_DropEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var file: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(16).value
        set(value) { memberAt<Uint32Var>(16).value = value }
    
}

class SDL_QuitEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
}

class SDL_OSEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
}

class SDL_UserEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(32, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var windowID: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var code: Sint32
        get() = memberAt<Sint32Var>(12).value
        set(value) { memberAt<Sint32Var>(12).value = value }
    
    var data1: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
    var data2: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(24).value
        set(value) { memberAt<COpaquePointerVar>(24).value = value }
    
}

class SDL_SysWMmsg(override val rawPtr: NativePtr) : COpaque

class SDL_SysWMEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var timestamp: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var msg: CPointer<SDL_SysWMmsg>?
        get() = memberAt<CPointerVar<SDL_SysWMmsg>>(8).value
        set(value) { memberAt<CPointerVar<SDL_SysWMmsg>>(8).value = value }
    
}

class SDL_Event(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(56, 8)
    
    var type: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    val common: SDL_CommonEvent
        get() = memberAt(0)
    
    val window: SDL_WindowEvent
        get() = memberAt(0)
    
    val key: SDL_KeyboardEvent
        get() = memberAt(0)
    
    val edit: SDL_TextEditingEvent
        get() = memberAt(0)
    
    val text: SDL_TextInputEvent
        get() = memberAt(0)
    
    val motion: SDL_MouseMotionEvent
        get() = memberAt(0)
    
    val button: SDL_MouseButtonEvent
        get() = memberAt(0)
    
    val wheel: SDL_MouseWheelEvent
        get() = memberAt(0)
    
    val jaxis: SDL_JoyAxisEvent
        get() = memberAt(0)
    
    val jball: SDL_JoyBallEvent
        get() = memberAt(0)
    
    val jhat: SDL_JoyHatEvent
        get() = memberAt(0)
    
    val jbutton: SDL_JoyButtonEvent
        get() = memberAt(0)
    
    val jdevice: SDL_JoyDeviceEvent
        get() = memberAt(0)
    
    val caxis: SDL_ControllerAxisEvent
        get() = memberAt(0)
    
    val cbutton: SDL_ControllerButtonEvent
        get() = memberAt(0)
    
    val cdevice: SDL_ControllerDeviceEvent
        get() = memberAt(0)
    
    val adevice: SDL_AudioDeviceEvent
        get() = memberAt(0)
    
    val quit: SDL_QuitEvent
        get() = memberAt(0)
    
    val user: SDL_UserEvent
        get() = memberAt(0)
    
    val syswm: SDL_SysWMEvent
        get() = memberAt(0)
    
    val tfinger: SDL_TouchFingerEvent
        get() = memberAt(0)
    
    val mgesture: SDL_MultiGestureEvent
        get() = memberAt(0)
    
    val dgesture: SDL_DollarGestureEvent
        get() = memberAt(0)
    
    val drop: SDL_DropEvent
        get() = memberAt(0)
    
    val padding: CArrayPointer<Uint8Var>
        get() = arrayMemberAt(0)
    
}

class _SDL_Haptic(override val rawPtr: NativePtr) : COpaque

class SDL_HapticDirection(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: Uint8
        get() = memberAt<Uint8Var>(0).value
        set(value) { memberAt<Uint8Var>(0).value = value }
    
    val dir: CArrayPointer<Sint32Var>
        get() = arrayMemberAt(4)
    
}

class SDL_HapticConstant(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(40, 4)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val direction: SDL_HapticDirection
        get() = memberAt(4)
    
    var length: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var delay: Uint16
        get() = memberAt<Uint16Var>(24).value
        set(value) { memberAt<Uint16Var>(24).value = value }
    
    var button: Uint16
        get() = memberAt<Uint16Var>(26).value
        set(value) { memberAt<Uint16Var>(26).value = value }
    
    var interval: Uint16
        get() = memberAt<Uint16Var>(28).value
        set(value) { memberAt<Uint16Var>(28).value = value }
    
    var level: Sint16
        get() = memberAt<Sint16Var>(30).value
        set(value) { memberAt<Sint16Var>(30).value = value }
    
    var attack_length: Uint16
        get() = memberAt<Uint16Var>(32).value
        set(value) { memberAt<Uint16Var>(32).value = value }
    
    var attack_level: Uint16
        get() = memberAt<Uint16Var>(34).value
        set(value) { memberAt<Uint16Var>(34).value = value }
    
    var fade_length: Uint16
        get() = memberAt<Uint16Var>(36).value
        set(value) { memberAt<Uint16Var>(36).value = value }
    
    var fade_level: Uint16
        get() = memberAt<Uint16Var>(38).value
        set(value) { memberAt<Uint16Var>(38).value = value }
    
}

class SDL_HapticPeriodic(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(48, 4)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val direction: SDL_HapticDirection
        get() = memberAt(4)
    
    var length: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var delay: Uint16
        get() = memberAt<Uint16Var>(24).value
        set(value) { memberAt<Uint16Var>(24).value = value }
    
    var button: Uint16
        get() = memberAt<Uint16Var>(26).value
        set(value) { memberAt<Uint16Var>(26).value = value }
    
    var interval: Uint16
        get() = memberAt<Uint16Var>(28).value
        set(value) { memberAt<Uint16Var>(28).value = value }
    
    var period: Uint16
        get() = memberAt<Uint16Var>(30).value
        set(value) { memberAt<Uint16Var>(30).value = value }
    
    var magnitude: Sint16
        get() = memberAt<Sint16Var>(32).value
        set(value) { memberAt<Sint16Var>(32).value = value }
    
    var offset: Sint16
        get() = memberAt<Sint16Var>(34).value
        set(value) { memberAt<Sint16Var>(34).value = value }
    
    var phase: Uint16
        get() = memberAt<Uint16Var>(36).value
        set(value) { memberAt<Uint16Var>(36).value = value }
    
    var attack_length: Uint16
        get() = memberAt<Uint16Var>(38).value
        set(value) { memberAt<Uint16Var>(38).value = value }
    
    var attack_level: Uint16
        get() = memberAt<Uint16Var>(40).value
        set(value) { memberAt<Uint16Var>(40).value = value }
    
    var fade_length: Uint16
        get() = memberAt<Uint16Var>(42).value
        set(value) { memberAt<Uint16Var>(42).value = value }
    
    var fade_level: Uint16
        get() = memberAt<Uint16Var>(44).value
        set(value) { memberAt<Uint16Var>(44).value = value }
    
}

class SDL_HapticCondition(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(68, 4)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val direction: SDL_HapticDirection
        get() = memberAt(4)
    
    var length: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var delay: Uint16
        get() = memberAt<Uint16Var>(24).value
        set(value) { memberAt<Uint16Var>(24).value = value }
    
    var button: Uint16
        get() = memberAt<Uint16Var>(26).value
        set(value) { memberAt<Uint16Var>(26).value = value }
    
    var interval: Uint16
        get() = memberAt<Uint16Var>(28).value
        set(value) { memberAt<Uint16Var>(28).value = value }
    
    val right_sat: CArrayPointer<Uint16Var>
        get() = arrayMemberAt(30)
    
    val left_sat: CArrayPointer<Uint16Var>
        get() = arrayMemberAt(36)
    
    val right_coeff: CArrayPointer<Sint16Var>
        get() = arrayMemberAt(42)
    
    val left_coeff: CArrayPointer<Sint16Var>
        get() = arrayMemberAt(48)
    
    val deadband: CArrayPointer<Uint16Var>
        get() = arrayMemberAt(54)
    
    val center: CArrayPointer<Sint16Var>
        get() = arrayMemberAt(60)
    
}

class SDL_HapticRamp(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(44, 4)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val direction: SDL_HapticDirection
        get() = memberAt(4)
    
    var length: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var delay: Uint16
        get() = memberAt<Uint16Var>(24).value
        set(value) { memberAt<Uint16Var>(24).value = value }
    
    var button: Uint16
        get() = memberAt<Uint16Var>(26).value
        set(value) { memberAt<Uint16Var>(26).value = value }
    
    var interval: Uint16
        get() = memberAt<Uint16Var>(28).value
        set(value) { memberAt<Uint16Var>(28).value = value }
    
    var start: Sint16
        get() = memberAt<Sint16Var>(30).value
        set(value) { memberAt<Sint16Var>(30).value = value }
    
    var end: Sint16
        get() = memberAt<Sint16Var>(32).value
        set(value) { memberAt<Sint16Var>(32).value = value }
    
    var attack_length: Uint16
        get() = memberAt<Uint16Var>(34).value
        set(value) { memberAt<Uint16Var>(34).value = value }
    
    var attack_level: Uint16
        get() = memberAt<Uint16Var>(36).value
        set(value) { memberAt<Uint16Var>(36).value = value }
    
    var fade_length: Uint16
        get() = memberAt<Uint16Var>(38).value
        set(value) { memberAt<Uint16Var>(38).value = value }
    
    var fade_level: Uint16
        get() = memberAt<Uint16Var>(40).value
        set(value) { memberAt<Uint16Var>(40).value = value }
    
}

class SDL_HapticLeftRight(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    var length: Uint32
        get() = memberAt<Uint32Var>(4).value
        set(value) { memberAt<Uint32Var>(4).value = value }
    
    var large_magnitude: Uint16
        get() = memberAt<Uint16Var>(8).value
        set(value) { memberAt<Uint16Var>(8).value = value }
    
    var small_magnitude: Uint16
        get() = memberAt<Uint16Var>(10).value
        set(value) { memberAt<Uint16Var>(10).value = value }
    
}

class SDL_HapticCustom(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(56, 8)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val direction: SDL_HapticDirection
        get() = memberAt(4)
    
    var length: Uint32
        get() = memberAt<Uint32Var>(20).value
        set(value) { memberAt<Uint32Var>(20).value = value }
    
    var delay: Uint16
        get() = memberAt<Uint16Var>(24).value
        set(value) { memberAt<Uint16Var>(24).value = value }
    
    var button: Uint16
        get() = memberAt<Uint16Var>(26).value
        set(value) { memberAt<Uint16Var>(26).value = value }
    
    var interval: Uint16
        get() = memberAt<Uint16Var>(28).value
        set(value) { memberAt<Uint16Var>(28).value = value }
    
    var channels: Uint8
        get() = memberAt<Uint8Var>(30).value
        set(value) { memberAt<Uint8Var>(30).value = value }
    
    var period: Uint16
        get() = memberAt<Uint16Var>(32).value
        set(value) { memberAt<Uint16Var>(32).value = value }
    
    var samples: Uint16
        get() = memberAt<Uint16Var>(34).value
        set(value) { memberAt<Uint16Var>(34).value = value }
    
    var data: CPointer<Uint16Var>?
        get() = memberAt<CPointerVar<Uint16Var>>(40).value
        set(value) { memberAt<CPointerVar<Uint16Var>>(40).value = value }
    
    var attack_length: Uint16
        get() = memberAt<Uint16Var>(48).value
        set(value) { memberAt<Uint16Var>(48).value = value }
    
    var attack_level: Uint16
        get() = memberAt<Uint16Var>(50).value
        set(value) { memberAt<Uint16Var>(50).value = value }
    
    var fade_length: Uint16
        get() = memberAt<Uint16Var>(52).value
        set(value) { memberAt<Uint16Var>(52).value = value }
    
    var fade_level: Uint16
        get() = memberAt<Uint16Var>(54).value
        set(value) { memberAt<Uint16Var>(54).value = value }
    
}

class SDL_HapticEffect(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(72, 8)
    
    var type: Uint16
        get() = memberAt<Uint16Var>(0).value
        set(value) { memberAt<Uint16Var>(0).value = value }
    
    val constant: SDL_HapticConstant
        get() = memberAt(0)
    
    val periodic: SDL_HapticPeriodic
        get() = memberAt(0)
    
    val condition: SDL_HapticCondition
        get() = memberAt(0)
    
    val ramp: SDL_HapticRamp
        get() = memberAt(0)
    
    val leftright: SDL_HapticLeftRight
        get() = memberAt(0)
    
    val custom: SDL_HapticCustom
        get() = memberAt(0)
    
}

class SDL_MessageBoxButtonData(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var flags: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var buttonid: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var text: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
}

class SDL_MessageBoxColor(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(3, 1)
    
    var r: Uint8
        get() = memberAt<Uint8Var>(0).value
        set(value) { memberAt<Uint8Var>(0).value = value }
    
    var g: Uint8
        get() = memberAt<Uint8Var>(1).value
        set(value) { memberAt<Uint8Var>(1).value = value }
    
    var b: Uint8
        get() = memberAt<Uint8Var>(2).value
        set(value) { memberAt<Uint8Var>(2).value = value }
    
}

class SDL_MessageBoxColorScheme(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(15, 1)
    
    val colors: CArrayPointer<SDL_MessageBoxColor>
        get() = arrayMemberAt(0)
    
}

class SDL_MessageBoxData(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(56, 8)
    
    var flags: Uint32
        get() = memberAt<Uint32Var>(0).value
        set(value) { memberAt<Uint32Var>(0).value = value }
    
    var window: CPointer<SDL_Window>?
        get() = memberAt<CPointerVar<SDL_Window>>(8).value
        set(value) { memberAt<CPointerVar<SDL_Window>>(8).value = value }
    
    var title: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var message: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var numbuttons: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var buttons: CPointer<SDL_MessageBoxButtonData>?
        get() = memberAt<CPointerVar<SDL_MessageBoxButtonData>>(40).value
        set(value) { memberAt<CPointerVar<SDL_MessageBoxButtonData>>(40).value = value }
    
    var colorScheme: CPointer<SDL_MessageBoxColorScheme>?
        get() = memberAt<CPointerVar<SDL_MessageBoxColorScheme>>(48).value
        set(value) { memberAt<CPointerVar<SDL_MessageBoxColorScheme>>(48).value = value }
    
}

class SDL_RendererInfo(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(88, 8)
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var flags: Uint32
        get() = memberAt<Uint32Var>(8).value
        set(value) { memberAt<Uint32Var>(8).value = value }
    
    var num_texture_formats: Uint32
        get() = memberAt<Uint32Var>(12).value
        set(value) { memberAt<Uint32Var>(12).value = value }
    
    val texture_formats: CArrayPointer<Uint32Var>
        get() = arrayMemberAt(16)
    
    var max_texture_width: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var max_texture_height: Int
        get() = memberAt<IntVar>(84).value
        set(value) { memberAt<IntVar>(84).value = value }
    
}

class SDL_Renderer(override val rawPtr: NativePtr) : COpaque

class SDL_Texture(override val rawPtr: NativePtr) : COpaque

class SDL_WindowShapeParams(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(4, 1)
    
    var binarizationCutoff: Uint8
        get() = memberAt<Uint8Var>(0).value
        set(value) { memberAt<Uint8Var>(0).value = value }
    
    val colorKey: SDL_Color
        get() = memberAt(0)
    
}

class SDL_WindowShapeMode(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var mode: WindowShapeMode
        get() = memberAt<WindowShapeMode.Var>(0).value
        set(value) { memberAt<WindowShapeMode.Var>(0).value = value }
    
    val parameters: SDL_WindowShapeParams
        get() = memberAt(4)
    
}

class IDirect3DDevice9(override val rawPtr: NativePtr) : COpaque

class SDL_version(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(3, 1)
    
    var major: Uint8
        get() = memberAt<Uint8Var>(0).value
        set(value) { memberAt<Uint8Var>(0).value = value }
    
    var minor: Uint8
        get() = memberAt<Uint8Var>(1).value
        set(value) { memberAt<Uint8Var>(1).value = value }
    
    var patch: Uint8
        get() = memberAt<Uint8Var>(2).value
        set(value) { memberAt<Uint8Var>(2).value = value }
    
}

class tm(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(36, 4)
    
    var tm_sec: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var tm_min: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var tm_hour: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var tm_mday: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var tm_mon: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var tm_year: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var tm_wday: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var tm_yday: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var tm_isdst: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
}

class timezone(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var tz_minuteswest: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var tz_dsttime: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class timeval(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var tv_sec: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var tv_usec: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

typealias SDL_boolVar = IntVarOf<SDL_bool>
typealias SDL_bool = Int

val SDL_FALSE: SDL_bool = 0
val SDL_TRUE: SDL_bool = 1

enum class SDL_DUMMY_ENUM(override val value: Int) : CEnum {
    DUMMY_ENUM_VALUE(0),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_DUMMY_ENUM.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_DUMMY_ENUM
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class SDL_AssertState(override val value: Int) : CEnum {
    SDL_ASSERTION_RETRY(0),
    SDL_ASSERTION_BREAK(1),
    SDL_ASSERTION_ABORT(2),
    SDL_ASSERTION_IGNORE(3),
    SDL_ASSERTION_ALWAYS_IGNORE(4),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_AssertState.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_AssertState
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class SDL_errorcode(override val value: Int) : CEnum {
    SDL_ENOMEM(0),
    SDL_EFREAD(1),
    SDL_EFWRITE(2),
    SDL_EFSEEK(3),
    SDL_UNSUPPORTED(4),
    SDL_LASTERROR(5),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_errorcode.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_errorcode
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class SDL_ThreadPriority(override val value: Int) : CEnum {
    SDL_THREAD_PRIORITY_LOW(0),
    SDL_THREAD_PRIORITY_NORMAL(1),
    SDL_THREAD_PRIORITY_HIGH(2),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_ThreadPriority.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_ThreadPriority
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias SDL_AudioStatusVar = IntVarOf<SDL_AudioStatus>
typealias SDL_AudioStatus = Int

val SDL_AUDIO_STOPPED: SDL_AudioStatus = 0
val SDL_AUDIO_PLAYING: SDL_AudioStatus = 1
val SDL_AUDIO_PAUSED: SDL_AudioStatus = 2

// enum (anonymous at \msys64\mingw64\include\SDL2\SDL_pixels.h:51:1):
val SDL_PIXELTYPE_UNKNOWN: Int = 0
val SDL_PIXELTYPE_INDEX1: Int = 1
val SDL_PIXELTYPE_INDEX4: Int = 2
val SDL_PIXELTYPE_INDEX8: Int = 3
val SDL_PIXELTYPE_PACKED8: Int = 4
val SDL_PIXELTYPE_PACKED16: Int = 5
val SDL_PIXELTYPE_PACKED32: Int = 6
val SDL_PIXELTYPE_ARRAYU8: Int = 7
val SDL_PIXELTYPE_ARRAYU16: Int = 8
val SDL_PIXELTYPE_ARRAYU32: Int = 9
val SDL_PIXELTYPE_ARRAYF16: Int = 10
val SDL_PIXELTYPE_ARRAYF32: Int = 11

// enum (anonymous at \msys64\mingw64\include\SDL2\SDL_pixels.h:68:1):
val SDL_BITMAPORDER_NONE: Int = 0
val SDL_BITMAPORDER_4321: Int = 1
val SDL_BITMAPORDER_1234: Int = 2

// enum (anonymous at \msys64\mingw64\include\SDL2\SDL_pixels.h:76:1):
val SDL_PACKEDORDER_NONE: Int = 0
val SDL_PACKEDORDER_XRGB: Int = 1
val SDL_PACKEDORDER_RGBX: Int = 2
val SDL_PACKEDORDER_ARGB: Int = 3
val SDL_PACKEDORDER_RGBA: Int = 4
val SDL_PACKEDORDER_XBGR: Int = 5
val SDL_PACKEDORDER_BGRX: Int = 6
val SDL_PACKEDORDER_ABGR: Int = 7
val SDL_PACKEDORDER_BGRA: Int = 8

// enum (anonymous at \msys64\mingw64\include\SDL2\SDL_pixels.h:92:1):
val SDL_ARRAYORDER_NONE: Int = 0
val SDL_ARRAYORDER_RGB: Int = 1
val SDL_ARRAYORDER_RGBA: Int = 2
val SDL_ARRAYORDER_ARGB: Int = 3
val SDL_ARRAYORDER_BGR: Int = 4
val SDL_ARRAYORDER_BGRA: Int = 5
val SDL_ARRAYORDER_ABGR: Int = 6

// enum (anonymous at \msys64\mingw64\include\SDL2\SDL_pixels.h:104:1):
val SDL_PACKEDLAYOUT_NONE: Int = 0
val SDL_PACKEDLAYOUT_332: Int = 1
val SDL_PACKEDLAYOUT_4444: Int = 2
val SDL_PACKEDLAYOUT_1555: Int = 3
val SDL_PACKEDLAYOUT_5551: Int = 4
val SDL_PACKEDLAYOUT_565: Int = 5
val SDL_PACKEDLAYOUT_8888: Int = 6
val SDL_PACKEDLAYOUT_2101010: Int = 7
val SDL_PACKEDLAYOUT_1010102: Int = 8

// enum (anonymous at \msys64\mingw64\include\SDL2\SDL_pixels.h:171:1):
val SDL_PIXELFORMAT_UNKNOWN: Int = 0
val SDL_PIXELFORMAT_INDEX1LSB: Int = 286261504
val SDL_PIXELFORMAT_INDEX1MSB: Int = 287310080
val SDL_PIXELFORMAT_INDEX4LSB: Int = 303039488
val SDL_PIXELFORMAT_INDEX4MSB: Int = 304088064
val SDL_PIXELFORMAT_INDEX8: Int = 318769153
val SDL_PIXELFORMAT_RGB332: Int = 336660481
val SDL_PIXELFORMAT_RGB444: Int = 353504258
val SDL_PIXELFORMAT_RGB555: Int = 353570562
val SDL_PIXELFORMAT_BGR555: Int = 357764866
val SDL_PIXELFORMAT_ARGB4444: Int = 355602434
val SDL_PIXELFORMAT_RGBA4444: Int = 356651010
val SDL_PIXELFORMAT_ABGR4444: Int = 359796738
val SDL_PIXELFORMAT_BGRA4444: Int = 360845314
val SDL_PIXELFORMAT_ARGB1555: Int = 355667970
val SDL_PIXELFORMAT_RGBA5551: Int = 356782082
val SDL_PIXELFORMAT_ABGR1555: Int = 359862274
val SDL_PIXELFORMAT_BGRA5551: Int = 360976386
val SDL_PIXELFORMAT_RGB565: Int = 353701890
val SDL_PIXELFORMAT_BGR565: Int = 357896194
val SDL_PIXELFORMAT_RGB24: Int = 386930691
val SDL_PIXELFORMAT_BGR24: Int = 390076419
val SDL_PIXELFORMAT_RGB888: Int = 370546692
val SDL_PIXELFORMAT_RGBX8888: Int = 371595268
val SDL_PIXELFORMAT_BGR888: Int = 374740996
val SDL_PIXELFORMAT_BGRX8888: Int = 375789572
val SDL_PIXELFORMAT_ARGB8888: Int = 372645892
val SDL_PIXELFORMAT_RGBA8888: Int = 373694468
val SDL_PIXELFORMAT_ABGR8888: Int = 376840196
val SDL_PIXELFORMAT_BGRA8888: Int = 377888772
val SDL_PIXELFORMAT_ARGB2101010: Int = 372711428
val SDL_PIXELFORMAT_RGBA32: Int = 376840196
val SDL_PIXELFORMAT_ARGB32: Int = 377888772
val SDL_PIXELFORMAT_BGRA32: Int = 372645892
val SDL_PIXELFORMAT_ABGR32: Int = 373694468
val SDL_PIXELFORMAT_YV12: Int = 842094169
val SDL_PIXELFORMAT_IYUV: Int = 1448433993
val SDL_PIXELFORMAT_YUY2: Int = 844715353
val SDL_PIXELFORMAT_UYVY: Int = 1498831189
val SDL_PIXELFORMAT_YVYU: Int = 1431918169
val SDL_PIXELFORMAT_NV12: Int = 842094158
val SDL_PIXELFORMAT_NV21: Int = 825382478

typealias SDL_BlendModeVar = IntVarOf<SDL_BlendMode>
typealias SDL_BlendMode = Int

val SDL_BLENDMODE_NONE: SDL_BlendMode = 0
val SDL_BLENDMODE_BLEND: SDL_BlendMode = 1
val SDL_BLENDMODE_ADD: SDL_BlendMode = 2
val SDL_BLENDMODE_MOD: SDL_BlendMode = 4
val SDL_BLENDMODE_INVALID: SDL_BlendMode = 2147483647

typealias SDL_BlendOperationVar = IntVarOf<SDL_BlendOperation>
typealias SDL_BlendOperation = Int

val SDL_BLENDOPERATION_ADD: SDL_BlendOperation = 1
val SDL_BLENDOPERATION_SUBTRACT: SDL_BlendOperation = 2
val SDL_BLENDOPERATION_REV_SUBTRACT: SDL_BlendOperation = 3
val SDL_BLENDOPERATION_MINIMUM: SDL_BlendOperation = 4
val SDL_BLENDOPERATION_MAXIMUM: SDL_BlendOperation = 5

typealias SDL_BlendFactorVar = IntVarOf<SDL_BlendFactor>
typealias SDL_BlendFactor = Int

val SDL_BLENDFACTOR_ZERO: SDL_BlendFactor = 1
val SDL_BLENDFACTOR_ONE: SDL_BlendFactor = 2
val SDL_BLENDFACTOR_SRC_COLOR: SDL_BlendFactor = 3
val SDL_BLENDFACTOR_ONE_MINUS_SRC_COLOR: SDL_BlendFactor = 4
val SDL_BLENDFACTOR_SRC_ALPHA: SDL_BlendFactor = 5
val SDL_BLENDFACTOR_ONE_MINUS_SRC_ALPHA: SDL_BlendFactor = 6
val SDL_BLENDFACTOR_DST_COLOR: SDL_BlendFactor = 7
val SDL_BLENDFACTOR_ONE_MINUS_DST_COLOR: SDL_BlendFactor = 8
val SDL_BLENDFACTOR_DST_ALPHA: SDL_BlendFactor = 9
val SDL_BLENDFACTOR_ONE_MINUS_DST_ALPHA: SDL_BlendFactor = 10

typealias SDL_WindowFlagsVar = IntVarOf<SDL_WindowFlags>
typealias SDL_WindowFlags = Int

val SDL_WINDOW_FULLSCREEN: SDL_WindowFlags = 1
val SDL_WINDOW_OPENGL: SDL_WindowFlags = 2
val SDL_WINDOW_SHOWN: SDL_WindowFlags = 4
val SDL_WINDOW_HIDDEN: SDL_WindowFlags = 8
val SDL_WINDOW_BORDERLESS: SDL_WindowFlags = 16
val SDL_WINDOW_RESIZABLE: SDL_WindowFlags = 32
val SDL_WINDOW_MINIMIZED: SDL_WindowFlags = 64
val SDL_WINDOW_MAXIMIZED: SDL_WindowFlags = 128
val SDL_WINDOW_INPUT_GRABBED: SDL_WindowFlags = 256
val SDL_WINDOW_INPUT_FOCUS: SDL_WindowFlags = 512
val SDL_WINDOW_MOUSE_FOCUS: SDL_WindowFlags = 1024
val SDL_WINDOW_FULLSCREEN_DESKTOP: SDL_WindowFlags = 4097
val SDL_WINDOW_FOREIGN: SDL_WindowFlags = 2048
val SDL_WINDOW_ALLOW_HIGHDPI: SDL_WindowFlags = 8192
val SDL_WINDOW_MOUSE_CAPTURE: SDL_WindowFlags = 16384
val SDL_WINDOW_ALWAYS_ON_TOP: SDL_WindowFlags = 32768
val SDL_WINDOW_SKIP_TASKBAR: SDL_WindowFlags = 65536
val SDL_WINDOW_UTILITY: SDL_WindowFlags = 131072
val SDL_WINDOW_TOOLTIP: SDL_WindowFlags = 262144
val SDL_WINDOW_POPUP_MENU: SDL_WindowFlags = 524288
val SDL_WINDOW_VULKAN: SDL_WindowFlags = 268435456

enum class SDL_WindowEventID(override val value: Int) : CEnum {
    SDL_WINDOWEVENT_NONE(0),
    SDL_WINDOWEVENT_SHOWN(1),
    SDL_WINDOWEVENT_HIDDEN(2),
    SDL_WINDOWEVENT_EXPOSED(3),
    SDL_WINDOWEVENT_MOVED(4),
    SDL_WINDOWEVENT_RESIZED(5),
    SDL_WINDOWEVENT_SIZE_CHANGED(6),
    SDL_WINDOWEVENT_MINIMIZED(7),
    SDL_WINDOWEVENT_MAXIMIZED(8),
    SDL_WINDOWEVENT_RESTORED(9),
    SDL_WINDOWEVENT_ENTER(10),
    SDL_WINDOWEVENT_LEAVE(11),
    SDL_WINDOWEVENT_FOCUS_GAINED(12),
    SDL_WINDOWEVENT_FOCUS_LOST(13),
    SDL_WINDOWEVENT_CLOSE(14),
    SDL_WINDOWEVENT_TAKE_FOCUS(15),
    SDL_WINDOWEVENT_HIT_TEST(16),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_WindowEventID.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_WindowEventID
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class SDL_GLattr(override val value: Int) : CEnum {
    SDL_GL_RED_SIZE(0),
    SDL_GL_GREEN_SIZE(1),
    SDL_GL_BLUE_SIZE(2),
    SDL_GL_ALPHA_SIZE(3),
    SDL_GL_BUFFER_SIZE(4),
    SDL_GL_DOUBLEBUFFER(5),
    SDL_GL_DEPTH_SIZE(6),
    SDL_GL_STENCIL_SIZE(7),
    SDL_GL_ACCUM_RED_SIZE(8),
    SDL_GL_ACCUM_GREEN_SIZE(9),
    SDL_GL_ACCUM_BLUE_SIZE(10),
    SDL_GL_ACCUM_ALPHA_SIZE(11),
    SDL_GL_STEREO(12),
    SDL_GL_MULTISAMPLEBUFFERS(13),
    SDL_GL_MULTISAMPLESAMPLES(14),
    SDL_GL_ACCELERATED_VISUAL(15),
    SDL_GL_RETAINED_BACKING(16),
    SDL_GL_CONTEXT_MAJOR_VERSION(17),
    SDL_GL_CONTEXT_MINOR_VERSION(18),
    SDL_GL_CONTEXT_EGL(19),
    SDL_GL_CONTEXT_FLAGS(20),
    SDL_GL_CONTEXT_PROFILE_MASK(21),
    SDL_GL_SHARE_WITH_CURRENT_CONTEXT(22),
    SDL_GL_FRAMEBUFFER_SRGB_CAPABLE(23),
    SDL_GL_CONTEXT_RELEASE_BEHAVIOR(24),
    SDL_GL_CONTEXT_RESET_NOTIFICATION(25),
    SDL_GL_CONTEXT_NO_ERROR(26),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_GLattr.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_GLattr
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias SDL_GLprofileVar = IntVarOf<SDL_GLprofile>
typealias SDL_GLprofile = Int

val SDL_GL_CONTEXT_PROFILE_CORE: SDL_GLprofile = 1
val SDL_GL_CONTEXT_PROFILE_COMPATIBILITY: SDL_GLprofile = 2
val SDL_GL_CONTEXT_PROFILE_ES: SDL_GLprofile = 4

typealias SDL_GLcontextFlagVar = IntVarOf<SDL_GLcontextFlag>
typealias SDL_GLcontextFlag = Int

val SDL_GL_CONTEXT_DEBUG_FLAG: SDL_GLcontextFlag = 1
val SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG: SDL_GLcontextFlag = 2
val SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG: SDL_GLcontextFlag = 4
val SDL_GL_CONTEXT_RESET_ISOLATION_FLAG: SDL_GLcontextFlag = 8

typealias SDL_GLcontextReleaseFlagVar = IntVarOf<SDL_GLcontextReleaseFlag>
typealias SDL_GLcontextReleaseFlag = Int

val SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE: SDL_GLcontextReleaseFlag = 0
val SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH: SDL_GLcontextReleaseFlag = 1

typealias SDL_GLContextResetNotificationVar = IntVarOf<SDL_GLContextResetNotification>
typealias SDL_GLContextResetNotification = Int

val SDL_GL_CONTEXT_RESET_NO_NOTIFICATION: SDL_GLContextResetNotification = 0
val SDL_GL_CONTEXT_RESET_LOSE_CONTEXT: SDL_GLContextResetNotification = 1

enum class SDL_HitTestResult(override val value: Int) : CEnum {
    SDL_HITTEST_NORMAL(0),
    SDL_HITTEST_DRAGGABLE(1),
    SDL_HITTEST_RESIZE_TOPLEFT(2),
    SDL_HITTEST_RESIZE_TOP(3),
    SDL_HITTEST_RESIZE_TOPRIGHT(4),
    SDL_HITTEST_RESIZE_RIGHT(5),
    SDL_HITTEST_RESIZE_BOTTOMRIGHT(6),
    SDL_HITTEST_RESIZE_BOTTOM(7),
    SDL_HITTEST_RESIZE_BOTTOMLEFT(8),
    SDL_HITTEST_RESIZE_LEFT(9),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_HitTestResult.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_HitTestResult
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias SDL_ScancodeVar = IntVarOf<SDL_Scancode>
typealias SDL_Scancode = Int

val SDL_SCANCODE_UNKNOWN: SDL_Scancode = 0
val SDL_SCANCODE_A: SDL_Scancode = 4
val SDL_SCANCODE_B: SDL_Scancode = 5
val SDL_SCANCODE_C: SDL_Scancode = 6
val SDL_SCANCODE_D: SDL_Scancode = 7
val SDL_SCANCODE_E: SDL_Scancode = 8
val SDL_SCANCODE_F: SDL_Scancode = 9
val SDL_SCANCODE_G: SDL_Scancode = 10
val SDL_SCANCODE_H: SDL_Scancode = 11
val SDL_SCANCODE_I: SDL_Scancode = 12
val SDL_SCANCODE_J: SDL_Scancode = 13
val SDL_SCANCODE_K: SDL_Scancode = 14
val SDL_SCANCODE_L: SDL_Scancode = 15
val SDL_SCANCODE_M: SDL_Scancode = 16
val SDL_SCANCODE_N: SDL_Scancode = 17
val SDL_SCANCODE_O: SDL_Scancode = 18
val SDL_SCANCODE_P: SDL_Scancode = 19
val SDL_SCANCODE_Q: SDL_Scancode = 20
val SDL_SCANCODE_R: SDL_Scancode = 21
val SDL_SCANCODE_S: SDL_Scancode = 22
val SDL_SCANCODE_T: SDL_Scancode = 23
val SDL_SCANCODE_U: SDL_Scancode = 24
val SDL_SCANCODE_V: SDL_Scancode = 25
val SDL_SCANCODE_W: SDL_Scancode = 26
val SDL_SCANCODE_X: SDL_Scancode = 27
val SDL_SCANCODE_Y: SDL_Scancode = 28
val SDL_SCANCODE_Z: SDL_Scancode = 29
val SDL_SCANCODE_1: SDL_Scancode = 30
val SDL_SCANCODE_2: SDL_Scancode = 31
val SDL_SCANCODE_3: SDL_Scancode = 32
val SDL_SCANCODE_4: SDL_Scancode = 33
val SDL_SCANCODE_5: SDL_Scancode = 34
val SDL_SCANCODE_6: SDL_Scancode = 35
val SDL_SCANCODE_7: SDL_Scancode = 36
val SDL_SCANCODE_8: SDL_Scancode = 37
val SDL_SCANCODE_9: SDL_Scancode = 38
val SDL_SCANCODE_0: SDL_Scancode = 39
val SDL_SCANCODE_RETURN: SDL_Scancode = 40
val SDL_SCANCODE_ESCAPE: SDL_Scancode = 41
val SDL_SCANCODE_BACKSPACE: SDL_Scancode = 42
val SDL_SCANCODE_TAB: SDL_Scancode = 43
val SDL_SCANCODE_SPACE: SDL_Scancode = 44
val SDL_SCANCODE_MINUS: SDL_Scancode = 45
val SDL_SCANCODE_EQUALS: SDL_Scancode = 46
val SDL_SCANCODE_LEFTBRACKET: SDL_Scancode = 47
val SDL_SCANCODE_RIGHTBRACKET: SDL_Scancode = 48
val SDL_SCANCODE_BACKSLASH: SDL_Scancode = 49
val SDL_SCANCODE_NONUSHASH: SDL_Scancode = 50
val SDL_SCANCODE_SEMICOLON: SDL_Scancode = 51
val SDL_SCANCODE_APOSTROPHE: SDL_Scancode = 52
val SDL_SCANCODE_GRAVE: SDL_Scancode = 53
val SDL_SCANCODE_COMMA: SDL_Scancode = 54
val SDL_SCANCODE_PERIOD: SDL_Scancode = 55
val SDL_SCANCODE_SLASH: SDL_Scancode = 56
val SDL_SCANCODE_CAPSLOCK: SDL_Scancode = 57
val SDL_SCANCODE_F1: SDL_Scancode = 58
val SDL_SCANCODE_F2: SDL_Scancode = 59
val SDL_SCANCODE_F3: SDL_Scancode = 60
val SDL_SCANCODE_F4: SDL_Scancode = 61
val SDL_SCANCODE_F5: SDL_Scancode = 62
val SDL_SCANCODE_F6: SDL_Scancode = 63
val SDL_SCANCODE_F7: SDL_Scancode = 64
val SDL_SCANCODE_F8: SDL_Scancode = 65
val SDL_SCANCODE_F9: SDL_Scancode = 66
val SDL_SCANCODE_F10: SDL_Scancode = 67
val SDL_SCANCODE_F11: SDL_Scancode = 68
val SDL_SCANCODE_F12: SDL_Scancode = 69
val SDL_SCANCODE_PRINTSCREEN: SDL_Scancode = 70
val SDL_SCANCODE_SCROLLLOCK: SDL_Scancode = 71
val SDL_SCANCODE_PAUSE: SDL_Scancode = 72
val SDL_SCANCODE_INSERT: SDL_Scancode = 73
val SDL_SCANCODE_HOME: SDL_Scancode = 74
val SDL_SCANCODE_PAGEUP: SDL_Scancode = 75
val SDL_SCANCODE_DELETE: SDL_Scancode = 76
val SDL_SCANCODE_END: SDL_Scancode = 77
val SDL_SCANCODE_PAGEDOWN: SDL_Scancode = 78
val SDL_SCANCODE_RIGHT: SDL_Scancode = 79
val SDL_SCANCODE_LEFT: SDL_Scancode = 80
val SDL_SCANCODE_DOWN: SDL_Scancode = 81
val SDL_SCANCODE_UP: SDL_Scancode = 82
val SDL_SCANCODE_NUMLOCKCLEAR: SDL_Scancode = 83
val SDL_SCANCODE_KP_DIVIDE: SDL_Scancode = 84
val SDL_SCANCODE_KP_MULTIPLY: SDL_Scancode = 85
val SDL_SCANCODE_KP_MINUS: SDL_Scancode = 86
val SDL_SCANCODE_KP_PLUS: SDL_Scancode = 87
val SDL_SCANCODE_KP_ENTER: SDL_Scancode = 88
val SDL_SCANCODE_KP_1: SDL_Scancode = 89
val SDL_SCANCODE_KP_2: SDL_Scancode = 90
val SDL_SCANCODE_KP_3: SDL_Scancode = 91
val SDL_SCANCODE_KP_4: SDL_Scancode = 92
val SDL_SCANCODE_KP_5: SDL_Scancode = 93
val SDL_SCANCODE_KP_6: SDL_Scancode = 94
val SDL_SCANCODE_KP_7: SDL_Scancode = 95
val SDL_SCANCODE_KP_8: SDL_Scancode = 96
val SDL_SCANCODE_KP_9: SDL_Scancode = 97
val SDL_SCANCODE_KP_0: SDL_Scancode = 98
val SDL_SCANCODE_KP_PERIOD: SDL_Scancode = 99
val SDL_SCANCODE_NONUSBACKSLASH: SDL_Scancode = 100
val SDL_SCANCODE_APPLICATION: SDL_Scancode = 101
val SDL_SCANCODE_POWER: SDL_Scancode = 102
val SDL_SCANCODE_KP_EQUALS: SDL_Scancode = 103
val SDL_SCANCODE_F13: SDL_Scancode = 104
val SDL_SCANCODE_F14: SDL_Scancode = 105
val SDL_SCANCODE_F15: SDL_Scancode = 106
val SDL_SCANCODE_F16: SDL_Scancode = 107
val SDL_SCANCODE_F17: SDL_Scancode = 108
val SDL_SCANCODE_F18: SDL_Scancode = 109
val SDL_SCANCODE_F19: SDL_Scancode = 110
val SDL_SCANCODE_F20: SDL_Scancode = 111
val SDL_SCANCODE_F21: SDL_Scancode = 112
val SDL_SCANCODE_F22: SDL_Scancode = 113
val SDL_SCANCODE_F23: SDL_Scancode = 114
val SDL_SCANCODE_F24: SDL_Scancode = 115
val SDL_SCANCODE_EXECUTE: SDL_Scancode = 116
val SDL_SCANCODE_HELP: SDL_Scancode = 117
val SDL_SCANCODE_MENU: SDL_Scancode = 118
val SDL_SCANCODE_SELECT: SDL_Scancode = 119
val SDL_SCANCODE_STOP: SDL_Scancode = 120
val SDL_SCANCODE_AGAIN: SDL_Scancode = 121
val SDL_SCANCODE_UNDO: SDL_Scancode = 122
val SDL_SCANCODE_CUT: SDL_Scancode = 123
val SDL_SCANCODE_COPY: SDL_Scancode = 124
val SDL_SCANCODE_PASTE: SDL_Scancode = 125
val SDL_SCANCODE_FIND: SDL_Scancode = 126
val SDL_SCANCODE_MUTE: SDL_Scancode = 127
val SDL_SCANCODE_VOLUMEUP: SDL_Scancode = 128
val SDL_SCANCODE_VOLUMEDOWN: SDL_Scancode = 129
val SDL_SCANCODE_KP_COMMA: SDL_Scancode = 133
val SDL_SCANCODE_KP_EQUALSAS400: SDL_Scancode = 134
val SDL_SCANCODE_INTERNATIONAL1: SDL_Scancode = 135
val SDL_SCANCODE_INTERNATIONAL2: SDL_Scancode = 136
val SDL_SCANCODE_INTERNATIONAL3: SDL_Scancode = 137
val SDL_SCANCODE_INTERNATIONAL4: SDL_Scancode = 138
val SDL_SCANCODE_INTERNATIONAL5: SDL_Scancode = 139
val SDL_SCANCODE_INTERNATIONAL6: SDL_Scancode = 140
val SDL_SCANCODE_INTERNATIONAL7: SDL_Scancode = 141
val SDL_SCANCODE_INTERNATIONAL8: SDL_Scancode = 142
val SDL_SCANCODE_INTERNATIONAL9: SDL_Scancode = 143
val SDL_SCANCODE_LANG1: SDL_Scancode = 144
val SDL_SCANCODE_LANG2: SDL_Scancode = 145
val SDL_SCANCODE_LANG3: SDL_Scancode = 146
val SDL_SCANCODE_LANG4: SDL_Scancode = 147
val SDL_SCANCODE_LANG5: SDL_Scancode = 148
val SDL_SCANCODE_LANG6: SDL_Scancode = 149
val SDL_SCANCODE_LANG7: SDL_Scancode = 150
val SDL_SCANCODE_LANG8: SDL_Scancode = 151
val SDL_SCANCODE_LANG9: SDL_Scancode = 152
val SDL_SCANCODE_ALTERASE: SDL_Scancode = 153
val SDL_SCANCODE_SYSREQ: SDL_Scancode = 154
val SDL_SCANCODE_CANCEL: SDL_Scancode = 155
val SDL_SCANCODE_CLEAR: SDL_Scancode = 156
val SDL_SCANCODE_PRIOR: SDL_Scancode = 157
val SDL_SCANCODE_RETURN2: SDL_Scancode = 158
val SDL_SCANCODE_SEPARATOR: SDL_Scancode = 159
val SDL_SCANCODE_OUT: SDL_Scancode = 160
val SDL_SCANCODE_OPER: SDL_Scancode = 161
val SDL_SCANCODE_CLEARAGAIN: SDL_Scancode = 162
val SDL_SCANCODE_CRSEL: SDL_Scancode = 163
val SDL_SCANCODE_EXSEL: SDL_Scancode = 164
val SDL_SCANCODE_KP_00: SDL_Scancode = 176
val SDL_SCANCODE_KP_000: SDL_Scancode = 177
val SDL_SCANCODE_THOUSANDSSEPARATOR: SDL_Scancode = 178
val SDL_SCANCODE_DECIMALSEPARATOR: SDL_Scancode = 179
val SDL_SCANCODE_CURRENCYUNIT: SDL_Scancode = 180
val SDL_SCANCODE_CURRENCYSUBUNIT: SDL_Scancode = 181
val SDL_SCANCODE_KP_LEFTPAREN: SDL_Scancode = 182
val SDL_SCANCODE_KP_RIGHTPAREN: SDL_Scancode = 183
val SDL_SCANCODE_KP_LEFTBRACE: SDL_Scancode = 184
val SDL_SCANCODE_KP_RIGHTBRACE: SDL_Scancode = 185
val SDL_SCANCODE_KP_TAB: SDL_Scancode = 186
val SDL_SCANCODE_KP_BACKSPACE: SDL_Scancode = 187
val SDL_SCANCODE_KP_A: SDL_Scancode = 188
val SDL_SCANCODE_KP_B: SDL_Scancode = 189
val SDL_SCANCODE_KP_C: SDL_Scancode = 190
val SDL_SCANCODE_KP_D: SDL_Scancode = 191
val SDL_SCANCODE_KP_E: SDL_Scancode = 192
val SDL_SCANCODE_KP_F: SDL_Scancode = 193
val SDL_SCANCODE_KP_XOR: SDL_Scancode = 194
val SDL_SCANCODE_KP_POWER: SDL_Scancode = 195
val SDL_SCANCODE_KP_PERCENT: SDL_Scancode = 196
val SDL_SCANCODE_KP_LESS: SDL_Scancode = 197
val SDL_SCANCODE_KP_GREATER: SDL_Scancode = 198
val SDL_SCANCODE_KP_AMPERSAND: SDL_Scancode = 199
val SDL_SCANCODE_KP_DBLAMPERSAND: SDL_Scancode = 200
val SDL_SCANCODE_KP_VERTICALBAR: SDL_Scancode = 201
val SDL_SCANCODE_KP_DBLVERTICALBAR: SDL_Scancode = 202
val SDL_SCANCODE_KP_COLON: SDL_Scancode = 203
val SDL_SCANCODE_KP_HASH: SDL_Scancode = 204
val SDL_SCANCODE_KP_SPACE: SDL_Scancode = 205
val SDL_SCANCODE_KP_AT: SDL_Scancode = 206
val SDL_SCANCODE_KP_EXCLAM: SDL_Scancode = 207
val SDL_SCANCODE_KP_MEMSTORE: SDL_Scancode = 208
val SDL_SCANCODE_KP_MEMRECALL: SDL_Scancode = 209
val SDL_SCANCODE_KP_MEMCLEAR: SDL_Scancode = 210
val SDL_SCANCODE_KP_MEMADD: SDL_Scancode = 211
val SDL_SCANCODE_KP_MEMSUBTRACT: SDL_Scancode = 212
val SDL_SCANCODE_KP_MEMMULTIPLY: SDL_Scancode = 213
val SDL_SCANCODE_KP_MEMDIVIDE: SDL_Scancode = 214
val SDL_SCANCODE_KP_PLUSMINUS: SDL_Scancode = 215
val SDL_SCANCODE_KP_CLEAR: SDL_Scancode = 216
val SDL_SCANCODE_KP_CLEARENTRY: SDL_Scancode = 217
val SDL_SCANCODE_KP_BINARY: SDL_Scancode = 218
val SDL_SCANCODE_KP_OCTAL: SDL_Scancode = 219
val SDL_SCANCODE_KP_DECIMAL: SDL_Scancode = 220
val SDL_SCANCODE_KP_HEXADECIMAL: SDL_Scancode = 221
val SDL_SCANCODE_LCTRL: SDL_Scancode = 224
val SDL_SCANCODE_LSHIFT: SDL_Scancode = 225
val SDL_SCANCODE_LALT: SDL_Scancode = 226
val SDL_SCANCODE_LGUI: SDL_Scancode = 227
val SDL_SCANCODE_RCTRL: SDL_Scancode = 228
val SDL_SCANCODE_RSHIFT: SDL_Scancode = 229
val SDL_SCANCODE_RALT: SDL_Scancode = 230
val SDL_SCANCODE_RGUI: SDL_Scancode = 231
val SDL_SCANCODE_MODE: SDL_Scancode = 257
val SDL_SCANCODE_AUDIONEXT: SDL_Scancode = 258
val SDL_SCANCODE_AUDIOPREV: SDL_Scancode = 259
val SDL_SCANCODE_AUDIOSTOP: SDL_Scancode = 260
val SDL_SCANCODE_AUDIOPLAY: SDL_Scancode = 261
val SDL_SCANCODE_AUDIOMUTE: SDL_Scancode = 262
val SDL_SCANCODE_MEDIASELECT: SDL_Scancode = 263
val SDL_SCANCODE_WWW: SDL_Scancode = 264
val SDL_SCANCODE_MAIL: SDL_Scancode = 265
val SDL_SCANCODE_CALCULATOR: SDL_Scancode = 266
val SDL_SCANCODE_COMPUTER: SDL_Scancode = 267
val SDL_SCANCODE_AC_SEARCH: SDL_Scancode = 268
val SDL_SCANCODE_AC_HOME: SDL_Scancode = 269
val SDL_SCANCODE_AC_BACK: SDL_Scancode = 270
val SDL_SCANCODE_AC_FORWARD: SDL_Scancode = 271
val SDL_SCANCODE_AC_STOP: SDL_Scancode = 272
val SDL_SCANCODE_AC_REFRESH: SDL_Scancode = 273
val SDL_SCANCODE_AC_BOOKMARKS: SDL_Scancode = 274
val SDL_SCANCODE_BRIGHTNESSDOWN: SDL_Scancode = 275
val SDL_SCANCODE_BRIGHTNESSUP: SDL_Scancode = 276
val SDL_SCANCODE_DISPLAYSWITCH: SDL_Scancode = 277
val SDL_SCANCODE_KBDILLUMTOGGLE: SDL_Scancode = 278
val SDL_SCANCODE_KBDILLUMDOWN: SDL_Scancode = 279
val SDL_SCANCODE_KBDILLUMUP: SDL_Scancode = 280
val SDL_SCANCODE_EJECT: SDL_Scancode = 281
val SDL_SCANCODE_SLEEP: SDL_Scancode = 282
val SDL_SCANCODE_APP1: SDL_Scancode = 283
val SDL_SCANCODE_APP2: SDL_Scancode = 284
val SDL_SCANCODE_AUDIOREWIND: SDL_Scancode = 285
val SDL_SCANCODE_AUDIOFASTFORWARD: SDL_Scancode = 286
val SDL_NUM_SCANCODES: SDL_Scancode = 512

// enum (anonymous at \msys64\mingw64\include\SDL2\SDL_keycode.h:50:1):
val SDLK_UNKNOWN: Int = 0
val SDLK_RETURN: Int = 13
val SDLK_ESCAPE: Int = 27
val SDLK_BACKSPACE: Int = 8
val SDLK_TAB: Int = 9
val SDLK_SPACE: Int = 32
val SDLK_EXCLAIM: Int = 33
val SDLK_QUOTEDBL: Int = 34
val SDLK_HASH: Int = 35
val SDLK_PERCENT: Int = 37
val SDLK_DOLLAR: Int = 36
val SDLK_AMPERSAND: Int = 38
val SDLK_QUOTE: Int = 39
val SDLK_LEFTPAREN: Int = 40
val SDLK_RIGHTPAREN: Int = 41
val SDLK_ASTERISK: Int = 42
val SDLK_PLUS: Int = 43
val SDLK_COMMA: Int = 44
val SDLK_MINUS: Int = 45
val SDLK_PERIOD: Int = 46
val SDLK_SLASH: Int = 47
val SDLK_0: Int = 48
val SDLK_1: Int = 49
val SDLK_2: Int = 50
val SDLK_3: Int = 51
val SDLK_4: Int = 52
val SDLK_5: Int = 53
val SDLK_6: Int = 54
val SDLK_7: Int = 55
val SDLK_8: Int = 56
val SDLK_9: Int = 57
val SDLK_COLON: Int = 58
val SDLK_SEMICOLON: Int = 59
val SDLK_LESS: Int = 60
val SDLK_EQUALS: Int = 61
val SDLK_GREATER: Int = 62
val SDLK_QUESTION: Int = 63
val SDLK_AT: Int = 64
val SDLK_LEFTBRACKET: Int = 91
val SDLK_BACKSLASH: Int = 92
val SDLK_RIGHTBRACKET: Int = 93
val SDLK_CARET: Int = 94
val SDLK_UNDERSCORE: Int = 95
val SDLK_BACKQUOTE: Int = 96
val SDLK_a: Int = 97
val SDLK_b: Int = 98
val SDLK_c: Int = 99
val SDLK_d: Int = 100
val SDLK_e: Int = 101
val SDLK_f: Int = 102
val SDLK_g: Int = 103
val SDLK_h: Int = 104
val SDLK_i: Int = 105
val SDLK_j: Int = 106
val SDLK_k: Int = 107
val SDLK_l: Int = 108
val SDLK_m: Int = 109
val SDLK_n: Int = 110
val SDLK_o: Int = 111
val SDLK_p: Int = 112
val SDLK_q: Int = 113
val SDLK_r: Int = 114
val SDLK_s: Int = 115
val SDLK_t: Int = 116
val SDLK_u: Int = 117
val SDLK_v: Int = 118
val SDLK_w: Int = 119
val SDLK_x: Int = 120
val SDLK_y: Int = 121
val SDLK_z: Int = 122
val SDLK_CAPSLOCK: Int = 1073741881
val SDLK_F1: Int = 1073741882
val SDLK_F2: Int = 1073741883
val SDLK_F3: Int = 1073741884
val SDLK_F4: Int = 1073741885
val SDLK_F5: Int = 1073741886
val SDLK_F6: Int = 1073741887
val SDLK_F7: Int = 1073741888
val SDLK_F8: Int = 1073741889
val SDLK_F9: Int = 1073741890
val SDLK_F10: Int = 1073741891
val SDLK_F11: Int = 1073741892
val SDLK_F12: Int = 1073741893
val SDLK_PRINTSCREEN: Int = 1073741894
val SDLK_SCROLLLOCK: Int = 1073741895
val SDLK_PAUSE: Int = 1073741896
val SDLK_INSERT: Int = 1073741897
val SDLK_HOME: Int = 1073741898
val SDLK_PAGEUP: Int = 1073741899
val SDLK_DELETE: Int = 127
val SDLK_END: Int = 1073741901
val SDLK_PAGEDOWN: Int = 1073741902
val SDLK_RIGHT: Int = 1073741903
val SDLK_LEFT: Int = 1073741904
val SDLK_DOWN: Int = 1073741905
val SDLK_UP: Int = 1073741906
val SDLK_NUMLOCKCLEAR: Int = 1073741907
val SDLK_KP_DIVIDE: Int = 1073741908
val SDLK_KP_MULTIPLY: Int = 1073741909
val SDLK_KP_MINUS: Int = 1073741910
val SDLK_KP_PLUS: Int = 1073741911
val SDLK_KP_ENTER: Int = 1073741912
val SDLK_KP_1: Int = 1073741913
val SDLK_KP_2: Int = 1073741914
val SDLK_KP_3: Int = 1073741915
val SDLK_KP_4: Int = 1073741916
val SDLK_KP_5: Int = 1073741917
val SDLK_KP_6: Int = 1073741918
val SDLK_KP_7: Int = 1073741919
val SDLK_KP_8: Int = 1073741920
val SDLK_KP_9: Int = 1073741921
val SDLK_KP_0: Int = 1073741922
val SDLK_KP_PERIOD: Int = 1073741923
val SDLK_APPLICATION: Int = 1073741925
val SDLK_POWER: Int = 1073741926
val SDLK_KP_EQUALS: Int = 1073741927
val SDLK_F13: Int = 1073741928
val SDLK_F14: Int = 1073741929
val SDLK_F15: Int = 1073741930
val SDLK_F16: Int = 1073741931
val SDLK_F17: Int = 1073741932
val SDLK_F18: Int = 1073741933
val SDLK_F19: Int = 1073741934
val SDLK_F20: Int = 1073741935
val SDLK_F21: Int = 1073741936
val SDLK_F22: Int = 1073741937
val SDLK_F23: Int = 1073741938
val SDLK_F24: Int = 1073741939
val SDLK_EXECUTE: Int = 1073741940
val SDLK_HELP: Int = 1073741941
val SDLK_MENU: Int = 1073741942
val SDLK_SELECT: Int = 1073741943
val SDLK_STOP: Int = 1073741944
val SDLK_AGAIN: Int = 1073741945
val SDLK_UNDO: Int = 1073741946
val SDLK_CUT: Int = 1073741947
val SDLK_COPY: Int = 1073741948
val SDLK_PASTE: Int = 1073741949
val SDLK_FIND: Int = 1073741950
val SDLK_MUTE: Int = 1073741951
val SDLK_VOLUMEUP: Int = 1073741952
val SDLK_VOLUMEDOWN: Int = 1073741953
val SDLK_KP_COMMA: Int = 1073741957
val SDLK_KP_EQUALSAS400: Int = 1073741958
val SDLK_ALTERASE: Int = 1073741977
val SDLK_SYSREQ: Int = 1073741978
val SDLK_CANCEL: Int = 1073741979
val SDLK_CLEAR: Int = 1073741980
val SDLK_PRIOR: Int = 1073741981
val SDLK_RETURN2: Int = 1073741982
val SDLK_SEPARATOR: Int = 1073741983
val SDLK_OUT: Int = 1073741984
val SDLK_OPER: Int = 1073741985
val SDLK_CLEARAGAIN: Int = 1073741986
val SDLK_CRSEL: Int = 1073741987
val SDLK_EXSEL: Int = 1073741988
val SDLK_KP_00: Int = 1073742000
val SDLK_KP_000: Int = 1073742001
val SDLK_THOUSANDSSEPARATOR: Int = 1073742002
val SDLK_DECIMALSEPARATOR: Int = 1073742003
val SDLK_CURRENCYUNIT: Int = 1073742004
val SDLK_CURRENCYSUBUNIT: Int = 1073742005
val SDLK_KP_LEFTPAREN: Int = 1073742006
val SDLK_KP_RIGHTPAREN: Int = 1073742007
val SDLK_KP_LEFTBRACE: Int = 1073742008
val SDLK_KP_RIGHTBRACE: Int = 1073742009
val SDLK_KP_TAB: Int = 1073742010
val SDLK_KP_BACKSPACE: Int = 1073742011
val SDLK_KP_A: Int = 1073742012
val SDLK_KP_B: Int = 1073742013
val SDLK_KP_C: Int = 1073742014
val SDLK_KP_D: Int = 1073742015
val SDLK_KP_E: Int = 1073742016
val SDLK_KP_F: Int = 1073742017
val SDLK_KP_XOR: Int = 1073742018
val SDLK_KP_POWER: Int = 1073742019
val SDLK_KP_PERCENT: Int = 1073742020
val SDLK_KP_LESS: Int = 1073742021
val SDLK_KP_GREATER: Int = 1073742022
val SDLK_KP_AMPERSAND: Int = 1073742023
val SDLK_KP_DBLAMPERSAND: Int = 1073742024
val SDLK_KP_VERTICALBAR: Int = 1073742025
val SDLK_KP_DBLVERTICALBAR: Int = 1073742026
val SDLK_KP_COLON: Int = 1073742027
val SDLK_KP_HASH: Int = 1073742028
val SDLK_KP_SPACE: Int = 1073742029
val SDLK_KP_AT: Int = 1073742030
val SDLK_KP_EXCLAM: Int = 1073742031
val SDLK_KP_MEMSTORE: Int = 1073742032
val SDLK_KP_MEMRECALL: Int = 1073742033
val SDLK_KP_MEMCLEAR: Int = 1073742034
val SDLK_KP_MEMADD: Int = 1073742035
val SDLK_KP_MEMSUBTRACT: Int = 1073742036
val SDLK_KP_MEMMULTIPLY: Int = 1073742037
val SDLK_KP_MEMDIVIDE: Int = 1073742038
val SDLK_KP_PLUSMINUS: Int = 1073742039
val SDLK_KP_CLEAR: Int = 1073742040
val SDLK_KP_CLEARENTRY: Int = 1073742041
val SDLK_KP_BINARY: Int = 1073742042
val SDLK_KP_OCTAL: Int = 1073742043
val SDLK_KP_DECIMAL: Int = 1073742044
val SDLK_KP_HEXADECIMAL: Int = 1073742045
val SDLK_LCTRL: Int = 1073742048
val SDLK_LSHIFT: Int = 1073742049
val SDLK_LALT: Int = 1073742050
val SDLK_LGUI: Int = 1073742051
val SDLK_RCTRL: Int = 1073742052
val SDLK_RSHIFT: Int = 1073742053
val SDLK_RALT: Int = 1073742054
val SDLK_RGUI: Int = 1073742055
val SDLK_MODE: Int = 1073742081
val SDLK_AUDIONEXT: Int = 1073742082
val SDLK_AUDIOPREV: Int = 1073742083
val SDLK_AUDIOSTOP: Int = 1073742084
val SDLK_AUDIOPLAY: Int = 1073742085
val SDLK_AUDIOMUTE: Int = 1073742086
val SDLK_MEDIASELECT: Int = 1073742087
val SDLK_WWW: Int = 1073742088
val SDLK_MAIL: Int = 1073742089
val SDLK_CALCULATOR: Int = 1073742090
val SDLK_COMPUTER: Int = 1073742091
val SDLK_AC_SEARCH: Int = 1073742092
val SDLK_AC_HOME: Int = 1073742093
val SDLK_AC_BACK: Int = 1073742094
val SDLK_AC_FORWARD: Int = 1073742095
val SDLK_AC_STOP: Int = 1073742096
val SDLK_AC_REFRESH: Int = 1073742097
val SDLK_AC_BOOKMARKS: Int = 1073742098
val SDLK_BRIGHTNESSDOWN: Int = 1073742099
val SDLK_BRIGHTNESSUP: Int = 1073742100
val SDLK_DISPLAYSWITCH: Int = 1073742101
val SDLK_KBDILLUMTOGGLE: Int = 1073742102
val SDLK_KBDILLUMDOWN: Int = 1073742103
val SDLK_KBDILLUMUP: Int = 1073742104
val SDLK_EJECT: Int = 1073742105
val SDLK_SLEEP: Int = 1073742106
val SDLK_APP1: Int = 1073742107
val SDLK_APP2: Int = 1073742108
val SDLK_AUDIOREWIND: Int = 1073742109
val SDLK_AUDIOFASTFORWARD: Int = 1073742110

typealias SDL_KeymodVar = IntVarOf<SDL_Keymod>
typealias SDL_Keymod = Int

val KMOD_NONE: SDL_Keymod = 0
val KMOD_LSHIFT: SDL_Keymod = 1
val KMOD_RSHIFT: SDL_Keymod = 2
val KMOD_LCTRL: SDL_Keymod = 64
val KMOD_RCTRL: SDL_Keymod = 128
val KMOD_LALT: SDL_Keymod = 256
val KMOD_RALT: SDL_Keymod = 512
val KMOD_LGUI: SDL_Keymod = 1024
val KMOD_RGUI: SDL_Keymod = 2048
val KMOD_NUM: SDL_Keymod = 4096
val KMOD_CAPS: SDL_Keymod = 8192
val KMOD_MODE: SDL_Keymod = 16384
val KMOD_RESERVED: SDL_Keymod = 32768

enum class SDL_SystemCursor(override val value: Int) : CEnum {
    SDL_SYSTEM_CURSOR_ARROW(0),
    SDL_SYSTEM_CURSOR_IBEAM(1),
    SDL_SYSTEM_CURSOR_WAIT(2),
    SDL_SYSTEM_CURSOR_CROSSHAIR(3),
    SDL_SYSTEM_CURSOR_WAITARROW(4),
    SDL_SYSTEM_CURSOR_SIZENWSE(5),
    SDL_SYSTEM_CURSOR_SIZENESW(6),
    SDL_SYSTEM_CURSOR_SIZEWE(7),
    SDL_SYSTEM_CURSOR_SIZENS(8),
    SDL_SYSTEM_CURSOR_SIZEALL(9),
    SDL_SYSTEM_CURSOR_NO(10),
    SDL_SYSTEM_CURSOR_HAND(11),
    SDL_NUM_SYSTEM_CURSORS(12),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_SystemCursor.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_SystemCursor
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class SDL_MouseWheelDirection(override val value: Int) : CEnum {
    SDL_MOUSEWHEEL_NORMAL(0),
    SDL_MOUSEWHEEL_FLIPPED(1),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_MouseWheelDirection.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_MouseWheelDirection
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class SDL_JoystickType(override val value: Int) : CEnum {
    SDL_JOYSTICK_TYPE_UNKNOWN(0),
    SDL_JOYSTICK_TYPE_GAMECONTROLLER(1),
    SDL_JOYSTICK_TYPE_WHEEL(2),
    SDL_JOYSTICK_TYPE_ARCADE_STICK(3),
    SDL_JOYSTICK_TYPE_FLIGHT_STICK(4),
    SDL_JOYSTICK_TYPE_DANCE_PAD(5),
    SDL_JOYSTICK_TYPE_GUITAR(6),
    SDL_JOYSTICK_TYPE_DRUM_KIT(7),
    SDL_JOYSTICK_TYPE_ARCADE_PAD(8),
    SDL_JOYSTICK_TYPE_THROTTLE(9),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_JoystickType.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_JoystickType
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias SDL_JoystickPowerLevelVar = IntVarOf<SDL_JoystickPowerLevel>
typealias SDL_JoystickPowerLevel = Int

val SDL_JOYSTICK_POWER_UNKNOWN: SDL_JoystickPowerLevel = -1
val SDL_JOYSTICK_POWER_EMPTY: SDL_JoystickPowerLevel = 0
val SDL_JOYSTICK_POWER_LOW: SDL_JoystickPowerLevel = 1
val SDL_JOYSTICK_POWER_MEDIUM: SDL_JoystickPowerLevel = 2
val SDL_JOYSTICK_POWER_FULL: SDL_JoystickPowerLevel = 3
val SDL_JOYSTICK_POWER_WIRED: SDL_JoystickPowerLevel = 4
val SDL_JOYSTICK_POWER_MAX: SDL_JoystickPowerLevel = 5

typealias SDL_GameControllerBindTypeVar = IntVarOf<SDL_GameControllerBindType>
typealias SDL_GameControllerBindType = Int

val SDL_CONTROLLER_BINDTYPE_NONE: SDL_GameControllerBindType = 0
val SDL_CONTROLLER_BINDTYPE_BUTTON: SDL_GameControllerBindType = 1
val SDL_CONTROLLER_BINDTYPE_AXIS: SDL_GameControllerBindType = 2
val SDL_CONTROLLER_BINDTYPE_HAT: SDL_GameControllerBindType = 3

typealias SDL_GameControllerAxisVar = IntVarOf<SDL_GameControllerAxis>
typealias SDL_GameControllerAxis = Int

val SDL_CONTROLLER_AXIS_INVALID: SDL_GameControllerAxis = -1
val SDL_CONTROLLER_AXIS_LEFTX: SDL_GameControllerAxis = 0
val SDL_CONTROLLER_AXIS_LEFTY: SDL_GameControllerAxis = 1
val SDL_CONTROLLER_AXIS_RIGHTX: SDL_GameControllerAxis = 2
val SDL_CONTROLLER_AXIS_RIGHTY: SDL_GameControllerAxis = 3
val SDL_CONTROLLER_AXIS_TRIGGERLEFT: SDL_GameControllerAxis = 4
val SDL_CONTROLLER_AXIS_TRIGGERRIGHT: SDL_GameControllerAxis = 5
val SDL_CONTROLLER_AXIS_MAX: SDL_GameControllerAxis = 6

typealias SDL_GameControllerButtonVar = IntVarOf<SDL_GameControllerButton>
typealias SDL_GameControllerButton = Int

val SDL_CONTROLLER_BUTTON_INVALID: SDL_GameControllerButton = -1
val SDL_CONTROLLER_BUTTON_A: SDL_GameControllerButton = 0
val SDL_CONTROLLER_BUTTON_B: SDL_GameControllerButton = 1
val SDL_CONTROLLER_BUTTON_X: SDL_GameControllerButton = 2
val SDL_CONTROLLER_BUTTON_Y: SDL_GameControllerButton = 3
val SDL_CONTROLLER_BUTTON_BACK: SDL_GameControllerButton = 4
val SDL_CONTROLLER_BUTTON_GUIDE: SDL_GameControllerButton = 5
val SDL_CONTROLLER_BUTTON_START: SDL_GameControllerButton = 6
val SDL_CONTROLLER_BUTTON_LEFTSTICK: SDL_GameControllerButton = 7
val SDL_CONTROLLER_BUTTON_RIGHTSTICK: SDL_GameControllerButton = 8
val SDL_CONTROLLER_BUTTON_LEFTSHOULDER: SDL_GameControllerButton = 9
val SDL_CONTROLLER_BUTTON_RIGHTSHOULDER: SDL_GameControllerButton = 10
val SDL_CONTROLLER_BUTTON_DPAD_UP: SDL_GameControllerButton = 11
val SDL_CONTROLLER_BUTTON_DPAD_DOWN: SDL_GameControllerButton = 12
val SDL_CONTROLLER_BUTTON_DPAD_LEFT: SDL_GameControllerButton = 13
val SDL_CONTROLLER_BUTTON_DPAD_RIGHT: SDL_GameControllerButton = 14
val SDL_CONTROLLER_BUTTON_MAX: SDL_GameControllerButton = 15

typealias SDL_EventTypeVar = IntVarOf<SDL_EventType>
typealias SDL_EventType = Int

val SDL_FIRSTEVENT: SDL_EventType = 0
val SDL_QUIT: SDL_EventType = 256
val SDL_APP_TERMINATING: SDL_EventType = 257
val SDL_APP_LOWMEMORY: SDL_EventType = 258
val SDL_APP_WILLENTERBACKGROUND: SDL_EventType = 259
val SDL_APP_DIDENTERBACKGROUND: SDL_EventType = 260
val SDL_APP_WILLENTERFOREGROUND: SDL_EventType = 261
val SDL_APP_DIDENTERFOREGROUND: SDL_EventType = 262
val SDL_WINDOWEVENT: SDL_EventType = 512
val SDL_SYSWMEVENT: SDL_EventType = 513
val SDL_KEYDOWN: SDL_EventType = 768
val SDL_KEYUP: SDL_EventType = 769
val SDL_TEXTEDITING: SDL_EventType = 770
val SDL_TEXTINPUT: SDL_EventType = 771
val SDL_KEYMAPCHANGED: SDL_EventType = 772
val SDL_MOUSEMOTION: SDL_EventType = 1024
val SDL_MOUSEBUTTONDOWN: SDL_EventType = 1025
val SDL_MOUSEBUTTONUP: SDL_EventType = 1026
val SDL_MOUSEWHEEL: SDL_EventType = 1027
val SDL_JOYAXISMOTION: SDL_EventType = 1536
val SDL_JOYBALLMOTION: SDL_EventType = 1537
val SDL_JOYHATMOTION: SDL_EventType = 1538
val SDL_JOYBUTTONDOWN: SDL_EventType = 1539
val SDL_JOYBUTTONUP: SDL_EventType = 1540
val SDL_JOYDEVICEADDED: SDL_EventType = 1541
val SDL_JOYDEVICEREMOVED: SDL_EventType = 1542
val SDL_CONTROLLERAXISMOTION: SDL_EventType = 1616
val SDL_CONTROLLERBUTTONDOWN: SDL_EventType = 1617
val SDL_CONTROLLERBUTTONUP: SDL_EventType = 1618
val SDL_CONTROLLERDEVICEADDED: SDL_EventType = 1619
val SDL_CONTROLLERDEVICEREMOVED: SDL_EventType = 1620
val SDL_CONTROLLERDEVICEREMAPPED: SDL_EventType = 1621
val SDL_FINGERDOWN: SDL_EventType = 1792
val SDL_FINGERUP: SDL_EventType = 1793
val SDL_FINGERMOTION: SDL_EventType = 1794
val SDL_DOLLARGESTURE: SDL_EventType = 2048
val SDL_DOLLARRECORD: SDL_EventType = 2049
val SDL_MULTIGESTURE: SDL_EventType = 2050
val SDL_CLIPBOARDUPDATE: SDL_EventType = 2304
val SDL_DROPFILE: SDL_EventType = 4096
val SDL_DROPTEXT: SDL_EventType = 4097
val SDL_DROPBEGIN: SDL_EventType = 4098
val SDL_DROPCOMPLETE: SDL_EventType = 4099
val SDL_AUDIODEVICEADDED: SDL_EventType = 4352
val SDL_AUDIODEVICEREMOVED: SDL_EventType = 4353
val SDL_RENDER_TARGETS_RESET: SDL_EventType = 8192
val SDL_RENDER_DEVICE_RESET: SDL_EventType = 8193
val SDL_USEREVENT: SDL_EventType = 32768
val SDL_LASTEVENT: SDL_EventType = 65535

enum class SDL_eventaction(override val value: Int) : CEnum {
    SDL_ADDEVENT(0),
    SDL_PEEKEVENT(1),
    SDL_GETEVENT(2),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_eventaction.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_eventaction
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class SDL_HintPriority(override val value: Int) : CEnum {
    SDL_HINT_DEFAULT(0),
    SDL_HINT_NORMAL(1),
    SDL_HINT_OVERRIDE(2),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_HintPriority.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_HintPriority
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

// enum (anonymous at \msys64\mingw64\include\SDL2\SDL_log.h:64:1):
val SDL_LOG_CATEGORY_APPLICATION: Int = 0
val SDL_LOG_CATEGORY_ERROR: Int = 1
val SDL_LOG_CATEGORY_ASSERT: Int = 2
val SDL_LOG_CATEGORY_SYSTEM: Int = 3
val SDL_LOG_CATEGORY_AUDIO: Int = 4
val SDL_LOG_CATEGORY_VIDEO: Int = 5
val SDL_LOG_CATEGORY_RENDER: Int = 6
val SDL_LOG_CATEGORY_INPUT: Int = 7
val SDL_LOG_CATEGORY_TEST: Int = 8
val SDL_LOG_CATEGORY_RESERVED1: Int = 9
val SDL_LOG_CATEGORY_RESERVED2: Int = 10
val SDL_LOG_CATEGORY_RESERVED3: Int = 11
val SDL_LOG_CATEGORY_RESERVED4: Int = 12
val SDL_LOG_CATEGORY_RESERVED5: Int = 13
val SDL_LOG_CATEGORY_RESERVED6: Int = 14
val SDL_LOG_CATEGORY_RESERVED7: Int = 15
val SDL_LOG_CATEGORY_RESERVED8: Int = 16
val SDL_LOG_CATEGORY_RESERVED9: Int = 17
val SDL_LOG_CATEGORY_RESERVED10: Int = 18
val SDL_LOG_CATEGORY_CUSTOM: Int = 19

typealias SDL_LogPriorityVar = IntVarOf<SDL_LogPriority>
typealias SDL_LogPriority = Int

val SDL_LOG_PRIORITY_VERBOSE: SDL_LogPriority = 1
val SDL_LOG_PRIORITY_DEBUG: SDL_LogPriority = 2
val SDL_LOG_PRIORITY_INFO: SDL_LogPriority = 3
val SDL_LOG_PRIORITY_WARN: SDL_LogPriority = 4
val SDL_LOG_PRIORITY_ERROR: SDL_LogPriority = 5
val SDL_LOG_PRIORITY_CRITICAL: SDL_LogPriority = 6
val SDL_NUM_LOG_PRIORITIES: SDL_LogPriority = 7

typealias SDL_MessageBoxFlagsVar = IntVarOf<SDL_MessageBoxFlags>
typealias SDL_MessageBoxFlags = Int

val SDL_MESSAGEBOX_ERROR: SDL_MessageBoxFlags = 16
val SDL_MESSAGEBOX_WARNING: SDL_MessageBoxFlags = 32
val SDL_MESSAGEBOX_INFORMATION: SDL_MessageBoxFlags = 64

typealias SDL_MessageBoxButtonFlagsVar = IntVarOf<SDL_MessageBoxButtonFlags>
typealias SDL_MessageBoxButtonFlags = Int

val SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT: SDL_MessageBoxButtonFlags = 1
val SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT: SDL_MessageBoxButtonFlags = 2

enum class SDL_MessageBoxColorType(override val value: Int) : CEnum {
    SDL_MESSAGEBOX_COLOR_BACKGROUND(0),
    SDL_MESSAGEBOX_COLOR_TEXT(1),
    SDL_MESSAGEBOX_COLOR_BUTTON_BORDER(2),
    SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND(3),
    SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED(4),
    SDL_MESSAGEBOX_COLOR_MAX(5),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_MessageBoxColorType.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_MessageBoxColorType
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class SDL_PowerState(override val value: Int) : CEnum {
    SDL_POWERSTATE_UNKNOWN(0),
    SDL_POWERSTATE_ON_BATTERY(1),
    SDL_POWERSTATE_NO_BATTERY(2),
    SDL_POWERSTATE_CHARGING(3),
    SDL_POWERSTATE_CHARGED(4),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_PowerState.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_PowerState
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias SDL_RendererFlagsVar = IntVarOf<SDL_RendererFlags>
typealias SDL_RendererFlags = Int

val SDL_RENDERER_SOFTWARE: SDL_RendererFlags = 1
val SDL_RENDERER_ACCELERATED: SDL_RendererFlags = 2
val SDL_RENDERER_PRESENTVSYNC: SDL_RendererFlags = 4
val SDL_RENDERER_TARGETTEXTURE: SDL_RendererFlags = 8

enum class SDL_TextureAccess(override val value: Int) : CEnum {
    SDL_TEXTUREACCESS_STATIC(0),
    SDL_TEXTUREACCESS_STREAMING(1),
    SDL_TEXTUREACCESS_TARGET(2),
    ;
    
    companion object {
        fun byValue(value: Int) = SDL_TextureAccess.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: SDL_TextureAccess
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias SDL_TextureModulateVar = IntVarOf<SDL_TextureModulate>
typealias SDL_TextureModulate = Int

val SDL_TEXTUREMODULATE_NONE: SDL_TextureModulate = 0
val SDL_TEXTUREMODULATE_COLOR: SDL_TextureModulate = 1
val SDL_TEXTUREMODULATE_ALPHA: SDL_TextureModulate = 2

typealias SDL_RendererFlipVar = IntVarOf<SDL_RendererFlip>
typealias SDL_RendererFlip = Int

val SDL_FLIP_NONE: SDL_RendererFlip = 0
val SDL_FLIP_HORIZONTAL: SDL_RendererFlip = 1
val SDL_FLIP_VERTICAL: SDL_RendererFlip = 2

enum class WindowShapeMode(override val value: Int) : CEnum {
    ShapeModeDefault(0),
    ShapeModeBinarizeAlpha(1),
    ShapeModeReverseBinarizeAlpha(2),
    ShapeModeColorKey(3),
    ;
    
    companion object {
        fun byValue(value: Int) = WindowShapeMode.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: WindowShapeMode
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias int8_tVar = ByteVarOf<int8_t>
typealias int8_t = Byte

typealias Sint8Var = ByteVarOf<Sint8>
typealias Sint8 = int8_t

typealias uint8_tVar = ByteVarOf<uint8_t>
typealias uint8_t = Byte

typealias Uint8Var = ByteVarOf<Uint8>
typealias Uint8 = uint8_t

typealias int16_tVar = ShortVarOf<int16_t>
typealias int16_t = Short

typealias Sint16Var = ShortVarOf<Sint16>
typealias Sint16 = int16_t

typealias uint16_tVar = ShortVarOf<uint16_t>
typealias uint16_t = Short

typealias Uint16Var = ShortVarOf<Uint16>
typealias Uint16 = uint16_t

typealias int32_tVar = IntVarOf<int32_t>
typealias int32_t = Int

typealias Sint32Var = IntVarOf<Sint32>
typealias Sint32 = int32_t

typealias uint32_tVar = IntVarOf<uint32_t>
typealias uint32_t = Int

typealias Uint32Var = IntVarOf<Uint32>
typealias Uint32 = uint32_t

typealias int64_tVar = LongVarOf<int64_t>
typealias int64_t = Long

typealias Sint64Var = LongVarOf<Sint64>
typealias Sint64 = int64_t

typealias uint64_tVar = LongVarOf<uint64_t>
typealias uint64_t = Long

typealias Uint64Var = LongVarOf<Uint64>
typealias Uint64 = uint64_t

typealias SDL_compile_time_assert_uint8Var = CPointerVarOf<SDL_compile_time_assert_uint8>
typealias SDL_compile_time_assert_uint8 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_sint8Var = CPointerVarOf<SDL_compile_time_assert_sint8>
typealias SDL_compile_time_assert_sint8 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_uint16Var = CPointerVarOf<SDL_compile_time_assert_uint16>
typealias SDL_compile_time_assert_uint16 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_sint16Var = CPointerVarOf<SDL_compile_time_assert_sint16>
typealias SDL_compile_time_assert_sint16 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_uint32Var = CPointerVarOf<SDL_compile_time_assert_uint32>
typealias SDL_compile_time_assert_uint32 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_sint32Var = CPointerVarOf<SDL_compile_time_assert_sint32>
typealias SDL_compile_time_assert_sint32 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_uint64Var = CPointerVarOf<SDL_compile_time_assert_uint64>
typealias SDL_compile_time_assert_uint64 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_sint64Var = CPointerVarOf<SDL_compile_time_assert_sint64>
typealias SDL_compile_time_assert_sint64 = CArrayPointer<IntVar>

typealias SDL_compile_time_assert_enumVar = CPointerVarOf<SDL_compile_time_assert_enum>
typealias SDL_compile_time_assert_enum = CArrayPointer<IntVar>

typealias size_tVar = LongVarOf<size_t>
typealias size_t = Long

typealias wchar_tVar = ShortVarOf<wchar_t>
typealias wchar_t = Short

typealias __builtin_va_listVar = CPointerVarOf<__builtin_va_list>
typealias __builtin_va_list = CPointer<ByteVar>

typealias SDL_iconv_tVar = CPointerVarOf<SDL_iconv_t>
typealias SDL_iconv_t = CPointer<_SDL_iconv_t>

typealias SDL_AssertionHandlerVar = CPointerVarOf<SDL_AssertionHandler>
typealias SDL_AssertionHandler = CPointer<CFunction<(CPointer<SDL_AssertData>?, COpaquePointer?) -> SDL_AssertState>>

typealias SDL_SpinLockVar = IntVarOf<SDL_SpinLock>
typealias SDL_SpinLock = Int

typealias SDL_sem = SDL_semaphore

typealias SDL_threadIDVar = IntVarOf<SDL_threadID>
typealias SDL_threadID = Int

typealias SDL_TLSIDVar = IntVarOf<SDL_TLSID>
typealias SDL_TLSID = Int

typealias SDL_ThreadFunctionVar = CPointerVarOf<SDL_ThreadFunction>
typealias SDL_ThreadFunction = CPointer<CFunction<(COpaquePointer?) -> Int>>

typealias uintptr_tVar = LongVarOf<uintptr_t>
typealias uintptr_t = Long

typealias pfnSDL_CurrentBeginThreadVar = CPointerVarOf<pfnSDL_CurrentBeginThread>
typealias pfnSDL_CurrentBeginThread = CPointer<CFunction<(COpaquePointer?, Int, CPointer<CFunction<(COpaquePointer?) -> Int>>?, COpaquePointer?, Int, CPointer<IntVar>?) -> uintptr_t>>

typealias pfnSDL_CurrentEndThreadVar = CPointerVarOf<pfnSDL_CurrentEndThread>
typealias pfnSDL_CurrentEndThread = CPointer<CFunction<(Int) -> Unit>>

typealias SDL_AudioFormatVar = ShortVarOf<SDL_AudioFormat>
typealias SDL_AudioFormat = Uint16

typealias SDL_AudioCallbackVar = CPointerVarOf<SDL_AudioCallback>
typealias SDL_AudioCallback = CPointer<CFunction<(COpaquePointer?, CPointer<Uint8Var>?, Int) -> Unit>>

typealias SDL_AudioFilterVar = CPointerVarOf<SDL_AudioFilter>
typealias SDL_AudioFilter = CPointer<CFunction<(CPointer<SDL_AudioCVT>?, SDL_AudioFormat) -> Unit>>

typealias SDL_AudioDeviceIDVar = IntVarOf<SDL_AudioDeviceID>
typealias SDL_AudioDeviceID = Uint32

typealias _onexit_tVar = CPointerVarOf<_onexit_t>
typealias _onexit_t = CPointer<CFunction<() -> Int>>

typealias div_t = _div_t

typealias ldiv_t = _ldiv_t

typealias _purecall_handlerVar = CPointerVarOf<_purecall_handler>
typealias _purecall_handler = CPointer<CFunction<() -> Unit>>

typealias _invalid_parameter_handlerVar = CPointerVarOf<_invalid_parameter_handler>
typealias _invalid_parameter_handler = CPointer<CFunction<(CPointer<wchar_tVar>?, CPointer<wchar_tVar>?, CPointer<wchar_tVar>?, Int, uintptr_t) -> Unit>>

typealias errno_tVar = IntVarOf<errno_t>
typealias errno_t = Int

typealias LC_ID = tagLC_ID

typealias pthreadlocinfoVar = CPointerVarOf<pthreadlocinfo>
typealias pthreadlocinfo = CPointer<threadlocaleinfostruct>

typealias pthreadmbcinfoVar = CPointerVarOf<pthreadmbcinfo>
typealias pthreadmbcinfo = CPointer<threadmbcinfostruct>

typealias _locale_tVar = CPointerVarOf<_locale_t>
typealias _locale_t = CPointer<localeinfo_struct>

typealias SDL_blitVar = CPointerVarOf<SDL_blit>
typealias SDL_blit = CPointer<CFunction<(CPointer<SDL_Surface>?, CPointer<SDL_Rect>?, CPointer<SDL_Surface>?, CPointer<SDL_Rect>?) -> Int>>

typealias SDL_GLContextVar = CPointerVarOf<SDL_GLContext>
typealias SDL_GLContext = COpaquePointer

typealias SDL_HitTestVar = CPointerVarOf<SDL_HitTest>
typealias SDL_HitTest = CPointer<CFunction<(CPointer<SDL_Window>?, CPointer<SDL_Point>?, COpaquePointer?) -> SDL_HitTestResult>>

typealias SDL_KeycodeVar = IntVarOf<SDL_Keycode>
typealias SDL_Keycode = Sint32

typealias SDL_Joystick = _SDL_Joystick

typealias SDL_JoystickIDVar = IntVarOf<SDL_JoystickID>
typealias SDL_JoystickID = Sint32

typealias SDL_GameController = _SDL_GameController

typealias SDL_TouchIDVar = LongVarOf<SDL_TouchID>
typealias SDL_TouchID = Sint64

typealias SDL_FingerIDVar = LongVarOf<SDL_FingerID>
typealias SDL_FingerID = Sint64

typealias SDL_GestureIDVar = LongVarOf<SDL_GestureID>
typealias SDL_GestureID = Sint64

typealias SDL_EventFilterVar = CPointerVarOf<SDL_EventFilter>
typealias SDL_EventFilter = CPointer<CFunction<(COpaquePointer?, CPointer<SDL_Event>?) -> Int>>

typealias SDL_Haptic = _SDL_Haptic

typealias SDL_HintCallbackVar = CPointerVarOf<SDL_HintCallback>
typealias SDL_HintCallback = CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Unit>>

typealias SDL_LogOutputFunctionVar = CPointerVarOf<SDL_LogOutputFunction>
typealias SDL_LogOutputFunction = CPointer<CFunction<(COpaquePointer?, Int, SDL_LogPriority, CPointer<ByteVar>?) -> Unit>>

typealias SDL_WindowsMessageHookVar = CPointerVarOf<SDL_WindowsMessageHook>
typealias SDL_WindowsMessageHook = CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, Uint64, Sint64) -> Unit>>

typealias SDL_TimerCallbackVar = CPointerVarOf<SDL_TimerCallback>
typealias SDL_TimerCallback = CPointer<CFunction<(Uint32, COpaquePointer?) -> Uint32>>

typealias SDL_TimerIDVar = IntVarOf<SDL_TimerID>
typealias SDL_TimerID = Int

typealias clock_tVar = IntVarOf<clock_t>
typealias clock_t = Int

typealias __time32_tVar = IntVarOf<__time32_t>
typealias __time32_t = Int

typealias __time64_tVar = LongVarOf<__time64_t>
typealias __time64_t = Long

typealias time_tVar = LongVarOf<time_t>
typealias time_t = __time64_t

