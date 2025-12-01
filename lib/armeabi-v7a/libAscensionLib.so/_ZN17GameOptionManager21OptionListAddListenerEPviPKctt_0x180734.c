// 函数: _ZN17GameOptionManager21OptionListAddListenerEPviPKctt
// 地址: 0x180734
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg1 == 0)
    return 

void* r3 = *(arg1 + 0x3f8)

if (r3 == 0)
    return 

int32_t* r1_1 = r3 + 0x98
int32_t r2 = *r1_1
int32_t r4 = r1_1[1]
void* r0

if (r2 s>= r4)
    void* r0_1 = *(r3 + 0xa0)
    int32_t r1_2 = r4 << 1
    
    if (r4 == 0)
        r1_2 = 0x20
    
    *(r3 + 0x9c) = r1_2
    r0 = realloc(r0_1, r1_2 << 6)
    r1_1 = *(arg1 + 0x3f8) + 0x98
    r2 = *r1_1
    r1_1[2] = r0
else
    r0 = *(r3 + 0xa0)

*r1_1 = r2 + 1
int32_t* r0_2 = r0 + (r2 << 6)
*r0_2 = arg2
r0_2[2].b = 0
r0_2[1].w = arg4
*(r0_2 + 6) = arg5
return strcpy(r0_2 + 9, arg3) __tailcall
