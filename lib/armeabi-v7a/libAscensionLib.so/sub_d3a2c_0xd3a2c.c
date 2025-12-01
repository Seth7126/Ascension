// 函数: sub_d3a2c
// 地址: 0xd3a2c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t templat
__builtin_strcpy(&templat, "/tmp/lua_XXXXXX")
int32_t fd = mkstemp(&templat)
int32_t result

if (fd == 0xffffffff)
    result = luaL_error(arg1, "unable to generate a unique filename")
else
    close(fd)
    lua_pushstring(arg1, &templat)
    result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
