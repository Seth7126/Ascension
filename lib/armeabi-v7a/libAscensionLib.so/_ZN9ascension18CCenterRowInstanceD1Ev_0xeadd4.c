// 函数: _ZN9ascension18CCenterRowInstanceD1Ev
// 地址: 0xeadd4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
uint32_t r6 = entry_r0[1]
int32_t r0 = entry_r0[6]
int32_t* r5 = entry_r0[7]
*entry_r0 = _vtable_for_ascension::CCenterRowInstance + 8

if (r5 == r0)
    entry_r0[7] = r0
    
    if (r5 != 0)
        entry_r0[7] = r5
        operator delete(r5)
else
    int32_t r0_4
    
    do
        r5 -= 4
        void* r7_1 = *r5
        void* r0_2 = core::CWorldBase::AddRollbackData(r6, zx.d(entry_r0[2].w), 
            &__elf_symbol_table[0x23].st_name:1)
        
        if (r0_2 != 0)
            *(r0_2 + 0xc) = zx.d(*(r7_1 + 8))
        
        ascension::CWorld::RemoveActiveEffect(r6)
        r0_4 = entry_r0[6]
    while (r5 != r0_4)
    
    entry_r0[7] = r0_4
    entry_r0[7] = r5
    operator delete(r5)

void* r0_6 = entry_r0[3]

if (r0_6 != 0)
    entry_r0[4] = r0_6
    operator delete(r0_6)

return core::CInstance::~CInstance() __tailcall
