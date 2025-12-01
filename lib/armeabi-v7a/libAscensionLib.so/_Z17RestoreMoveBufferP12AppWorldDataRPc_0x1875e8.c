// 函数: _Z17RestoreMoveBufferP12AppWorldDataRPc
// 地址: 0x1875e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(arg1 + 0x11c) = 0
int32_t r5 = *(arg1 + 0x10c)
int32_t r6 = 0x800
int32_t r7 = 0x80
*(arg1 + 0x10c) = 0

do
    r7 += 0x80
    r6 += 0x800
while (r5 s>= r7)

int32_t r10_1

if (r7 == 0)
    r10_1 = *(arg1 + 0x120)

if (r7 != 0 || r10_1 == 0)
    uint32_t r0
    int32_t r1
    r1:r0 = mulu.dp.d(r7, 0x10)
    
    if (r1 != 0)
        r1 = 1
    
    if (r1 != 0)
        r0 = 0xffffffff
    
    int32_t r0_1 = operator new[](r0)
    void* r9_1 = *(arg1 + 0x120)
    r10_1 = r0_1
    
    if (r9_1 == 0)
        __aeabi_memclr4(r0_1, r6)
    else
        __aeabi_memclr4(r0_1, r6)
        operator delete[](r9_1)
    
    *(arg1 + 0x11c) = r7
    *(arg1 + 0x120) = r10_1

__aeabi_memcpy(r10_1, *arg2, r5 << 4)
char* result = &(*arg2)[r5 << 4]
*arg2 = result
*(arg1 + 0x10c) = r5
return result
