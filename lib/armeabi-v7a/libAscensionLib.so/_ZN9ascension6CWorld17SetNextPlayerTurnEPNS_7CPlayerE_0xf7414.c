// 函数: _ZN9ascension6CWorld17SetNextPlayerTurnEPNS_7CPlayerE
// 地址: 0xf7414
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r6 = 0
void* result = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_header.header_size)

if (result != 0)
    void* r1 = *(arg1 + 0xb24)
    
    if (r1 != 0)
        r6 = zx.d(*(r1 + 8))
    
    *(result + 0xc) = r6

int32_t entry_r1
*(arg1 + 0xb24) = entry_r1
return result
