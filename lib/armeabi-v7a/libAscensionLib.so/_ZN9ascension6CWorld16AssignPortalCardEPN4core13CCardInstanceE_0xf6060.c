// 函数: _ZN9ascension6CWorld16AssignPortalCardEPN4core13CCardInstanceE
// 地址: 0xf6060
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t entry_r1

if (entry_r1 == 0)
    return 0

core::CCardInstance* r0_1 = __dynamic_cast(entry_r1, _typeinfo_for_core::CCardInstance, 
    _typeinfo_for_ascension::CPortalCardInstance, 0)

if (r0_1 == 0 || *(r0_1 + 0x10) != 0)
    return 0

int32_t r6 = *(arg1 + 0xad8) - *(arg1 + 0xad4)
int32_t r5_1 = (*(arg1 + 0xae4) - *(arg1 + 0xae0)) s>> 2
int32_t r0_8 = (*(*arg1 + 0xc))(arg1, r5_1 + (r6 s>> 2))

if (r0_8 u< r6 s>> 2)
    *(*(arg1 + 0xad4) + (r0_8 << 2))
else
    r0_8 -= r6 s>> 2
    
    if (r0_8 u< r5_1)
        *(*(arg1 + 0xae0) + (r0_8 << 2))

int32_t r6_1 = ascension::CWorld::CreateCard(arg1)
void* r5_2 = *(r6_1 + 0xc)

if ((zx.d(**(arg1 + 0xa28)) & 0x30) == 0)
    while (zx.d(*(r5_2 + 0xa8)) != 0)
        int32_t r6_2 = *(arg1 + 0xad8) - *(arg1 + 0xad4)
        int32_t r5_4 = (*(arg1 + 0xae4) - *(arg1 + 0xae0)) s>> 2
        int32_t r0_19 = (*(*arg1 + 0xc))(arg1, r5_4 + (r6_2 s>> 2))
        
        if (r0_19 u< r6_2 s>> 2)
            *(*(arg1 + 0xad4) + (r0_19 << 2))
        else
            r0_19 -= r6_2 s>> 2
            
            if (r0_19 u< r5_4)
                *(*(arg1 + 0xae0) + (r0_19 << 2))
        
        int32_t r0_14 = ascension::CWorld::CreateCard(arg1)
        r6_1 = r0_14
        r5_2 = *(r0_14 + 0xc)

int32_t r0_22 = *(arg1 + 0x30)

if (r0_22 u<= 0x14)
    *(r5_2 + 0x98)
else
    int32_t* i = *(r5_2 + 0x130)
    
    if (i != *(r5_2 + 0x134))
        do
            core::CInstance* r1_14 = *i
            i = &i[1]
            ascension::CWorld::AddGlobalActiveEffect(arg1, r1_14)
        while (i != *(r5_2 + 0x134))
        
        r0_22 = *(arg1 + 0x30)
    
    *(r5_2 + 0x98)
    
    if (r0_22 u>= 0x19)
        *(r5_2 + 0xa0)

(*(*arg1 + 0x10))(arg1, 1, 3)
ascension::CPortalCardInstance::SetPortalCardInstance(r0_1, r6_1)
return 1
