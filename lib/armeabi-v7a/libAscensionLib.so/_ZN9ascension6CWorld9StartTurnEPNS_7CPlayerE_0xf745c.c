// 函数: _ZN9ascension6CWorld9StartTurnEPNS_7CPlayerE
// 地址: 0xf745c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (zx.d(*(arg1 + 0xa14)) != 0)
    void* r0_2
    int32_t r1
    r0_2, r1 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.flags:1)
    
    if (r0_2 != 0)
        r1 = *(arg1 + 0xb6c)
    
    if (r0_2 != 0)
        *(r0_2 + 0xc) = r1
    
    void* r0_4 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.section_header_offset)
    
    if (r0_4 != 0)
        *(r0_4 + 0xc) = *(arg1 + 0xb58)

*(arg1 + 0xb3c) = 0
*(arg1 + 0xb30) = 0
int32_t entry_r1
*(arg1 + 0xb20) = entry_r1
*(arg1 + 0xb34) = 0
*(arg1 + 0xb38) = 0
*(arg1 + 0xb2c) = 0
*(arg1 + 0xb28) = 0
__builtin_memset(arg1 + 0xb40, 0, 0x1c)
*(arg1 + 0xb5c) = 1
*(arg1 + 0xb7c) = 0
*(arg1 + 0xb60) = 0
*(arg1 + 0xb64) = 0
*(arg1 + 0xb68) = 0
*(arg1 + 0xb6c) = 0
*(arg1 + 0xb74) = *(arg1 + 0xb70)
*(arg1 + 0xbac) = *(arg1 + 0xba8)
*(arg1 + 0xbb8) = *(arg1 + 0xbb4)
*(arg1 + 0xbc4) = *(arg1 + 0xbc0)
*(arg1 + 0xbd0) = *(arg1 + 0xbcc)
uint32_t result = zx.d(*(arg1 + 0xa2e))

if (result == 0)
    result = zx.d(*(arg1 + 0xa14))
    
    if (result == 0 && *(arg1 + 0xb18) s>= 1)
        return ascension::CPlayer::PrepareNextTurnLog(entry_r1) __tailcall

return result
