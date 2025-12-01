// 函数: __cxa_current_primary_exception
// 地址: 0x19c524
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = __cxa_get_globals_fast()

if (r0 != 0)
    int32_t* r1_1 = *r0
    
    if (r1_1 != 0)
        int32_t r0_1 = r1_1[0xa]
        int32_t r2_1 = r1_1[0xb]
        int32_t i = 0x434c4e ^ r2_1 u>> 8
        
        if ((((r0_1 u>> 8 | r2_1 << 0x18) ^ 0x47432b2b) | i) == 0)
            if (zx.d(r0_1.b) == 1)
                r1_1 = *r1_1 - 0x80
            
            __dmb_ISH()
            
            do
                *r1_1
                unimplemented  {strex r3, r2, [r1]}
            while (i != 0)
            
            __dmb_ISH()
            return &r1_1[0x20]

return 0
