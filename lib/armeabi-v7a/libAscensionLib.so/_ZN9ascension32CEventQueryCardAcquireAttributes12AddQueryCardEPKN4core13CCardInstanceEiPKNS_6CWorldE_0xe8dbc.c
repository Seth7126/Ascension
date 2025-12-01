// 函数: _ZN9ascension32CEventQueryCardAcquireAttributes12AddQueryCardEPKN4core13CCardInstanceEiPKNS_6CWorldE
// 地址: 0xe8dbc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr = *(arg1 + 0x50)
int32_t r12 = *(arg1 + 0x54)
*(arg1 + 0x50) = lr + 1
int32_t r0 = lr * 0x11
int32_t* r4_2 = r12 + (r0 << 2)
*r4_2 = arg2
r4_2[1] = arg3
void* r2 = *(arg2 + 0xc)
void* r1

if (*(r2 + 0x88) != 8)
    r1 = r2 + 0x98
    void* entry_r3
    
    if (*(entry_r3 + 0x30) u< 0x14)
        r1 = r2 + 0x9c
else
    r1 = arg2 + 0x14

void* r4_4 = r12 + (r0 << 2)
int32_t r1_1 = *r1
*(r4_4 + 0xc) = r1_1
*(r4_4 + 8) = r1_1
int32_t r0_1 = *(r2 + 0xb0)
*(r4_4 + 0x14) = r0_1
*(r4_4 + 0x10) = r0_1
*(r4_4 + 0x18) = 0
__aeabi_memclr4(r4_4 + 0x1c, 0x24)
*(r4_4 + 0x40) = 0xffffffff
return 0xffffffff
