// 函数: CommitTemporaryMoveBuffer
// 地址: 0x188d2c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
uint32_t r4 = *s_pWorldData
int32_t* r7_1 = r4 + 0x1fc
int32_t r2 = *r7_1

if (r2 == 0)
    return 

if (*(r4 + 0xf8) == 3)
    NetworkClientManager::SubmitGameMoveBuffer(*s_pNetworkClientManager)
    r4 = *s_pWorldData
    r7_1 = r4 + 0x1fc
    r2 = *r7_1

int32_t r0_2 = *(r4 + 0x11c)
int32_t r8 = *(r4 + 0x10c)
int32_t r3 = r0_2

if (r0_2 == 0)
    r3 = 0x100

int32_t i = r3 - 0x80
int32_t r9 = 0x800 - (r3 << 4)
int32_t r10 = *(s_InterfaceContext + 0x10)

do
    i += 0x80
    r9 -= 0x800
while (r8 + r2 s>= i)

int32_t r0_3

if (r0_2 == i)
    r0_3 = *(r4 + 0x120)

void* r1_3

if (r0_2 != i || r0_3 == 0)
    uint32_t r0_4
    int32_t r1_4
    r1_4:r0_4 = mulu.dp.d(i, 0x10)
    
    if (r1_4 != 0)
        r1_4 = 1
    
    if (r1_4 != 0)
        r0_4 = 0xffffffff
    
    int32_t r0_5 = operator new[](r0_4)
    void* r6_1 = *(r4 + 0x120)
    
    if (r6_1 == 0)
        __aeabi_memclr4(r0_5, 0 - r9)
        r1_3 = r4
    else
        __aeabi_memcpy4(r0_5, r6_1, r8 << 4)
        __aeabi_memclr4(r0_5 + (r8 << 4), 0 - (r8 << 4) - r9)
        operator delete[](r6_1)
        r1_3 = *s_pWorldData
        r7_1 = r1_3 + 0x1fc
    
    *(r4 + 0x11c) = i
    *(r4 + 0x120) = r0_5
    r8 = *(r1_3 + 0x10c)
    r0_3 = *(r1_3 + 0x120)
    r2 = *r7_1
else
    r1_3 = r4

__aeabi_memcpy4(r0_3 + (r8 << 4), r1_3 + 0x204, r2 << 4)
uint32_t r4_1 = *s_pWorldData
int32_t r1_10 = *(r4_1 + 0x1f8)
*(r4_1 + 0x10c) += *(r4_1 + 0x1fc)
int32_t r0_13 = r4_1 + (r10 << 2)
*(r0_13 + 0xfc) += r1_10
__aeabi_memclr4(r4_1 + 0x204, *(r4_1 + 0x1fc) << 4)
int32_t r1_14 = *(r4_1 + 0xf8)
*(r4_1 + 0x1f8) = 0
*(r4_1 + 0x1fc) = 0
*(r4_1 + 0x200) = 0xffffffff

if (r1_14 != 3)
    *(r4_1 + 0x118) = *(r4_1 + 0x10c)

return SaveGameData() __tailcall
