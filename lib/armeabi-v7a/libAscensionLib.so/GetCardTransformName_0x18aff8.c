// 函数: GetCardTransformName
// 地址: 0x18aff8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *s_pWorldData

if (r0 != 0)
    uint32_t r0_2 = *(r0 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    
    if (r0_2 != 0)
        int32_t r0_3 = core::CWorldBase::GetInstanceByID(r0_2)
        
        if (r0_3 != 0)
            void* r0_4 = __dynamic_cast(r0_3, _typeinfo_for_core::CInstance, 
                _typeinfo_for_core::CCardInstance, 0)
            
            if (r0_4 != 0)
                void* r6_1 = *(r0_4 + 0xc)
                void* r0_5 = *(r6_1 + 0x150)
                
                if (r0_5 != 0)
                    strcpy(arg2, r0_5 + 4)
                    
                    if (*(r6_1 + 0x88) == 7)
                        return 2
                    
                    return 1

return 0
