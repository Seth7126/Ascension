// 函数: _ZN9ascension18CCenterRowInstance19RemoveActiveEffectsEv
// 地址: 0xeaec8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t result = *(entry_r0 + 0x18)
int32_t* r6 = *(entry_r0 + 0x1c)

if (r6 != result)
    uint32_t r5_1 = *(entry_r0 + 4)
    
    do
        r6 -= 4
        void* r7_1 = *r6
        void* r0_1 = core::CWorldBase::AddRollbackData(r5_1, zx.d(*(entry_r0 + 8)), 
            &__elf_symbol_table[0x23].st_name:1)
        
        if (r0_1 != 0)
            *(r0_1 + 0xc) = zx.d(*(r7_1 + 8))
        
        ascension::CWorld::RemoveActiveEffect(r5_1)
        result = *(entry_r0 + 0x18)
    while (r6 != result)

*(entry_r0 + 0x1c) = result
return result
