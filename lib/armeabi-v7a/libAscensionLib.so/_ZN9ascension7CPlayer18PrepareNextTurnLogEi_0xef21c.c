// 函数: _ZN9ascension7CPlayer18PrepareNextTurnLogEi
// 地址: 0xef21c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int16_t r10 = 0
int32_t r0 = *__stack_chk_guard
int32_t* r6 = *(arg1 + 0x178)
int32_t entry_r1

if (*(arg1 + 0x174) != r6)
    r10 = 0
    
    if (sx.d(*(r6 - 0x1c)) == entry_r1)
        uint32_t r2_2 = zx.d(*(r6 - 0x1a))
        
        if (r2_2 == 0)
            r10 = 2
            *(r6 - 0x1a) = 1
        else
            r10 = r2_2.w + 1

int32_t var_30 = 0
int32_t r8

if (r6 == *(arg1 + 0x17c))
    std::__ndk1::vector<ascension::CPlayerTurnLog, std::__ndk1::allocator<ascension::CPlayerTurnLog> >::__push_back_slow_path<ascension::CPlayerTurnLog const&>(
        arg1 + 0x174)
    r8 = *(arg1 + 0x178)
else
    int16_t var_3c
    r6[3].w = var_3c
    int32_t var_48
    *r6 = var_48
    int32_t var_44
    r6[1] = var_44
    int32_t var_40
    r6[2] = var_40
    r6[5] = 0
    r6[6] = 0
    r6[4] = 0
    r8 = *(arg1 + 0x178) + 0x1c
    *(arg1 + 0x178) = r8

*(r8 - 0x1c) = entry_r1.w
void* r5_3 = *(r8 - 0xc)
int32_t r0_9 = *(r8 - 4)
*(r8 - 0x1a) = r10
*(r8 - 0x10) = 0
*(r8 - 0x18) = 0
*(r8 - 0x14) = 0

if ((r0_9 - r5_3) s>> 3 u<= 0xf)
    int32_t r4_1 = *(r8 - 8)
    void* r0_12 = operator new(0x80)
    void* r2_4 = r4_1 - r5_3
    
    if (r2_4 s>= 1)
        __aeabi_memcpy4(r0_12, r5_3)
    
    *(r8 - 0xc) = r0_12
    *(r8 - 8) = r0_12 + r2_4
    *(r8 - 4) = r0_12 + 0x80
    
    if (r5_3 != 0)
        operator delete(r5_3)

*(arg1 + 0x180) = r8 - 0x1c
int32_t r0_15 = *__stack_chk_guard

if (r0_15 == r0)
    return r0_15 - r0

__stack_chk_fail()
noreturn
