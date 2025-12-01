// 函数: _ZN13CStateMachine13PushListStateEP9lua_State
// 地址: 0xb9aec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = lua_touserdata(arg1, 1)
int32_t r0_2 = lua_touserdata(arg1, 2)
void* r1 = *r0
void* r2_2

if (*(r1 + 0xc) == 0)
    *(r1 + 0xc) = r0_2
    r2_2 = r1 + 0x10
else
    r2_2 = r1 + 0x10
    *(*r2_2 + 0x14) = r0_2

*r2_2 = r0_2
void* r1_1

if (*(r1 + 0x30) == 0)
    *(r1 + 0x30) = r0_2
    r1_1 = r1 + 0x34
else
    r1_1 = r1 + 0x34
    *(*r1_1 + 0x18) = r0_2

*r1_1 = r0_2
return 0
