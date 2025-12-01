// 函数: _Z22StoreTutorialMoveEntryPvjijjj
// 地址: 0x18c6cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int16_t var_28 = arg4.w
uint32_t r5 = *s_pWorldData
CommitTemporaryMoveBuffer(s_pWorldData)
int32_t r1 = *(r5 + 0x11c)
int32_t r8 = *(r5 + 0x10c)
uint32_t r3 = arg6
int16_t lr = arg5.w
int32_t r4 = *(s_InterfaceContext + 0x10)
int32_t r2 = r1

if (r1 == 0)
    r2 = 0x100

int32_t r10 = r2 - 0x80
int32_t r6 = 0x800 - (r2 << 4)
int32_t r0_1 = r8 + 1

do
    r10 += 0x80
    r6 -= 0x800
while (r0_1 s>= r10)

int32_t r7_1

if (r1 == r10)
    r7_1 = *(r5 + 0x120)

uint32_t r1_1

if (r1 != r10 || r7_1 == 0)
    uint32_t r0_2
    int32_t r1_2
    r1_2:r0_2 = mulu.dp.d(r10, 0x10)
    
    if (r1_2 != 0)
        r1_2 = 1
    
    if (r1_2 != 0)
        r0_2 = 0xffffffff
    
    int32_t r0_3 = operator new[](r0_2)
    void* r4_1 = *(r5 + 0x120)
    r7_1 = r0_3
    
    if (r4_1 == 0)
        __aeabi_memclr4(r7_1, 0 - r6)
    else
        __aeabi_memcpy4(r7_1, r4_1, r8 << 4)
        __aeabi_memclr4(r7_1 + (r8 << 4), 0 - (r8 << 4) - r6)
        operator delete[](r4_1)
    
    r8 = *(r5 + 0x10c)
    lr = arg5.w
    r1_1 = arg2
    r3 = arg6
    r0_1 = r8 + 1
    *(r5 + 0x11c) = r10
    *(r5 + 0x120) = r7_1
else
    r1_1 = arg2

*(r5 + 0x10c) = r0_1
uint32_t* r7_2 = r7_1 + (r8 << 4)
*r7_2 = r1_1
r7_2[1].w = arg3.w
*(r7_2 + 6) = var_28
int32_t r0_9 = r5 + (r4 << 2)
r7_2[2].w = lr
r7_2[3] = r3
*(r0_9 + 0xfc) += 1
*(r5 + 0x118) = *(r5 + 0x10c)
int32_t* result = data_1f5894

if (result != 0 && &result[3] u< data_1f5898 + data_1f589c)
    *result = 0xc
    result[1] = 0x16
    data_1f5894 = &result[3]
    data_1f5890 += 1
    *(result + 0xa) = var_28
    result[2].w = lr
    result = 1
    data_1f4e48 = 1

return result
