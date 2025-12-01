// 函数: _ZN4core10CWorldBaseD1Ev
// 地址: 0xb7a7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
void* r0 = entry_r0[0x286]
*entry_r0 = _vtable_for_core::CWorldBase + 8

if (r0 != 0)
    operator delete(r0)

while (true)
    int32_t r1_3 = entry_r0[6]
    int32_t* r2_1 = entry_r0[7]
    int32_t* i
    
    do
        if (r1_3 == r2_1)
            void* r0_1 = entry_r0[3]
            
            if (r0_1 != 0)
                operator delete[](r0_1)
            
            void* r0_2 = entry_r0[9]
            
            if (r0_2 != 0)
                entry_r0[0xa] = r0_2
                operator delete(r0_2)
            
            void* r0_3 = entry_r0[6]
            
            if (r0_3 != 0)
                entry_r0[7] = r0_3
                operator delete(r0_3)
            
            return 
        
        r2_1 -= 4
        i = *r2_1
        entry_r0[7] = r2_1
    while (i == 0)
    
    (*(*i + 4))()
