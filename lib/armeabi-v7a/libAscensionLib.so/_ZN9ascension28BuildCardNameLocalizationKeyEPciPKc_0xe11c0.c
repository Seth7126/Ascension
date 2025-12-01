// 函数: _ZN9ascension28BuildCardNameLocalizationKeyEPciPKc
// 地址: 0xe11c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (arg2 s>= 1 && arg1 != 0)
    char const* r7_1 = arg3
    
    if (arg3 != 0)
        uint32_t i = zx.d(*r7_1)
        void* r5_1
        
        if (i == 0)
            result = 0
            r5_1 = arg1
        else
            result = 0
            r5_1 = arg1
            
            do
                r7_1 = &r7_1[1]
                int32_t r0
                
                while (true)
                    r0 = i << 0xfffffffc s>> 0x18
                    
                    if (r0 - 0x20 u> 0xe)
                        break
                    
                    if ((0x7081 & 1 << ((r0 - 0x20) & 0xff)) == 0)
                        break
                    
                    i = zx.d(*r7_1)
                    r7_1 = &r7_1[1]
                    
                    if (i == 0)
                        goto label_e126c
                
                char r0_1 = toupper(r0.b)
                
                if (result s>= arg2)
                    r5_1 = &arg1[arg2] - 1
                    break
                
                *r5_1 = r0_1
                r5_1 += 1
                result += 1
                i = zx.d(*r7_1)
            while (i != 0)
        
    label_e126c:
        *r5_1 = 0

return result
