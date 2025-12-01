// 函数: _ZN9ascension7CPlayer21ClearPayResourceStateEv
// 地址: 0xef530
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t result = *(entry_r0 + 0xac)

if (result != 0)
    void* r0_1 = core::CWorldBase::AddRollbackData(*(entry_r0 + 4), zx.d(*(entry_r0 + 8)), 
        &__elf_program_headers[7].offset:2)
    
    if (r0_1 != 0)
        *(r0_1 + 0xc) = *(entry_r0 + 0xac)
    
    result = 0
    *(entry_r0 + 0xac) = 0

return result
