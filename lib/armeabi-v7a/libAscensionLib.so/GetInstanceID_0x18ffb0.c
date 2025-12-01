// 函数: GetInstanceID
// 地址: 0x18ffb0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2 = *s_pWorldData

if (r2 != 0)
    uint32_t r5_1 = *(r2 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    
    if (r5_1 != 0)
        int32_t r9_1
        
        if (arg1 == 1)
            r9_1 = 0x2b0
        label_190024:
            int32_t r4_1 = *(r5_1 + 4)
            
            if (r4_1 s>= 1)
                int32_t r6_1 = 0
                
                do
                    int32_t* r0_2 = core::CWorldBase::GetInstanceByID(r5_1)
                    
                    if (r0_2 != 0 && (*(*r0_2 + 8))(r0_2) == r9_1
                            && strcasecmp((*(*r0_2 + 0xc))(r0_2), arg2) == 0)
                        return zx.d(r0_2[2].w)
                    
                    r6_1 += 1
                while (r6_1 s< r4_1)
        else
            if (arg1 == 8)
                r9_1 = 0xa36
                goto label_190024
            
            if (arg1 == 2)
                r9_1 = 0x4f2
                goto label_190024

return 0
