// 函数: _ZN17CGameStateOptions19AddSimpleUserOptionEttPKcPFvR13CStateMachineP6CStateiPjEi
// 地址: 0xb85f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r4 = arg1
int32_t r10 = *(arg1 + 0x38)
int32_t r0 = *(arg1 + 0x3c)
int32_t arg_4
int32_t r1 = arg_4
int32_t r2 = arg5
void* r5

if (r10 s>= r0)
    void* r6_1 = *(r4 + 0x40)
    *(r4 + 0x3c) = r0 << 1
    int32_t size = r0 << 5
    
    if (r6_1 == r4 + 0x4c)
        void* r0_5 = malloc(size)
        r5 = r0_5
        *(r4 + 0x40) = r0_5
        __aeabi_memcpy4(r0_5, r6_1, r10 << 4)
    else
        void* r0_3 = realloc(r6_1, size)
        r10 = *(r4 + 0x38)
        r5 = r0_3
        *(r4 + 0x40) = r0_3
    
    r1 = arg_4
    r2 = arg5
else
    r5 = *(r4 + 0x40)

uint16_t* r5_1 = r5 + (r10 << 4)
*r5_1 = arg2
r5_1[1] = arg3.w
*(r5_1 + 4) = arg4
*(r5_1 + 8) = r2
*(r5_1 + 0xc) = r1
*(r4 + 0x38) = r10 + 1
return r10 + 1
