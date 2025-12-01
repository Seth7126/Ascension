// 函数: _Z14StoreMoveEntryPvjijjj
// 地址: 0x18c3e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t lr = arg6
int16_t r4 = arg5.w
uint32_t r5 = *s_pWorldData
int32_t r6 = *(r5 + 0x11c)
int32_t r8 = *(r5 + 0x10c)
int32_t r12 = *(s_InterfaceContext + 0x10)
int32_t r0 = r6

if (r6 == 0)
    r0 = 0x100

int32_t r9 = r0 - 0x80
int32_t r10 = 0x800 - (r0 << 4)
int32_t r0_1 = r8 + 1

do
    r9 += 0x80
    r10 -= 0x800
while (r0_1 s>= r9)

int32_t r7_1

if (r6 == r9)
    r7_1 = *(r5 + 0x120)

if (r6 != r9 || r7_1 == 0)
    uint32_t r0_2
    int32_t r1
    r1:r0_2 = mulu.dp.d(r9, 0x10)
    
    if (r1 != 0)
        r1 = 1
    
    if (r1 != 0)
        r0_2 = 0xffffffff
    
    int32_t r0_3 = operator new[](r0_2)
    void* r4_1 = *(r5 + 0x120)
    r7_1 = r0_3
    
    if (r4_1 == 0)
        __aeabi_memclr4(r7_1, 0 - r10)
    else
        __aeabi_memcpy4(r7_1, r4_1, r8 << 4)
        __aeabi_memclr4(r7_1 + (r8 << 4), 0 - (r8 << 4) - r10)
        operator delete[](r4_1)
    
    r8 = *(r5 + 0x10c)
    *(r5 + 0x11c) = r9
    *(r5 + 0x120) = r7_1
    lr = arg6
    r0_1 = r8 + 1
    r4 = arg5.w

*(r5 + 0x10c) = r0_1
int32_t r0_8 = r5 + (r12 << 2)
uint32_t* r7_2 = r7_1 + (r8 << 4)
*r7_2 = arg2
r7_2[1].w = arg3.w
*(r7_2 + 6) = arg4.w
r7_2[2].w = r4
r7_2[3] = lr
*(r0_8 + 0xfc) += 1
int32_t result = *(r5 + 0x10c)
*(r5 + 0x118) = result
return result
