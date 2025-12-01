// 函数: GetGameCardState
// 地址: 0x18a328
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (arg1 s>= 1)
    void* r0_1 = arg2 + 0x20
    int32_t i_2 = arg1
    int32_t i
    
    do
        *(r0_1 + 4) = 0
        i = i_2
        i_2 -= 1
        *r0_1 = 0
        *(r0_1 - 0x18) = 0
        *(r0_1 - 0x14) = 0
        *(r0_1 - 0x10) = 0
        *(r0_1 - 0xc) = 0
        r0_1 += 0x28
    while (i != 1)

uint32_t r2_1 = *s_pWorldData
int32_t result = 0

if (r2_1 != 0)
    uint32_t r5_1 = *(r2_1 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    
    if (r5_1 != 0)
        core::CCardInstance* r2_3 = *(s_InterfaceContext + 0xc)
        int32_t r8_1 = 0
        void* __offset(vtable_for_ascension::CEventQueryCardAcquireAttributes, 0x8) var_2284 =
            _vtable_for_ascension::CEventQueryCardAcquireAttributes + 8
        int32_t var_2280_1 = 6
        int32_t var_227c_1 = 0
        core::CCardInstance* var_2238_1 = r2_3
        int32_t var_2234_1 = 0
        int32_t var_222c[0x84d]
        int32_t (* var_2230_1)[0x84d] = &var_222c
        int32_t var_3cd8_1 = 8
        int32_t var_3cd4_1 = 0
        void* __offset(vtable_for_ascension::CEventQueryCardDefeatAttributes, 0x8) var_3cdc =
            _vtable_for_ascension::CEventQueryCardDefeatAttributes + 8
        core::CCardInstance* var_3c90_1 = r2_3
        int32_t var_3c8c_1 = 0
        int32_t var_3c84[0x5e3]
        int32_t (* var_3c88_1)[0x5e3] = &var_3c84
        
        if (arg1 s>= 1)
            void* r10_1 = arg2 + 4
            
            do
                *(r10_1 - 4)
                int32_t r0_4 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_4 != 0)
                    int32_t r0_5 = __dynamic_cast(r0_4, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_core::CCardInstance, 0)
                    
                    if (r0_5 != 0)
                        int32_t r0_7 = *(*(r0_5 + 0xc) + 0x88)
                        
                        if (r0_7 u<= 9)
                            if ((0x306 & 1 << (r0_7 & 0xff)) != 0)
                                ascension::CEventQueryCardAcquireAttributes::AddQueryCard(
                                    &var_2284, r0_5, *r10_1)
                            else if (r0_7 == 3)
                                *r10_1
                                ascension::CEventQueryCardDefeatAttributes::AddQueryCard(&var_3cdc, 
                                    r0_5)
                
                r8_1 += 1
                r10_1 += 0x28
            while (r8_1 s< arg1)
            
            if (var_2234_1 s> 0)
                ascension::CWorld::HandleQuery(r5_1)
            
            if (var_3c8c_1 s>= 1)
                ascension::CWorld::HandleQuery(r5_1)
        
        uint32_t var_3cf0_1 = 1
        char var_3cde
        bool var_3cdd
        ascension::CWorld::GetCenterRowDayNight(r5_1, r2_3, &var_3cdd, &var_3cde)
        void* r0_15 = *(r5_1 + 0xb20)
        
        if (r0_15 != 0)
            uint32_t r0_16 = zx.d(*(r0_15 + 8))
            uint32_t r1_6 = zx.d(*(r2_3 + 8))
            uint32_t r0_17 = r0_16 - r1_6
            
            if (r0_16 != r1_6)
                r0_17 = 1
            
            var_3cf0_1 = r0_17
        
        if (arg1 s>= 1)
            void* r8_2 = arg2 + 0x24
            int32_t var_3cec_2 = 0
            int32_t r10_2 = 0
            int32_t var_3cf4_1 = 0
            
            do
                *(r8_2 - 0x24)
                int32_t r0_19 = core::CWorldBase::GetInstanceByID(r5_1)
                
                if (r0_19 != 0)
                    void* r0_20 = __dynamic_cast(r0_19, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_core::CCardInstance, 0, 1, var_3cf4_1, var_3cf0_1, 
                        var_3cec_2, r2_3, r0)
                    
                    if (r0_20 != 0)
                        void* r7_1 = *(r0_20 + 0xc)
                        int32_t r9_1 = *(r7_1 + 0x88)
                        
                        if (r9_1 u<= 9)
                            if ((0x306 & 1 << (r9_1 & 0xff)) != 0)
                                int32_t r0_21 = var_3cec_2 * 0x11
                                var_3cec_2 += 1
                                void* r0_22 = &var_222c[r0_21]
                                *(r8_2 - 0x1c) = *(r0_22 + 8)
                                int32_t r1_10 = *(r0_22 + 0xc)
                                *(r8_2 - 0x18) = r1_10 & not.d(r1_10 s>> 0x1f)
                                *(r8_2 - 0xc) = *(r0_22 + 0x10)
                                int32_t r0_23 = *(r0_22 + 0x14)
                                *(r8_2 - 8) = r0_23 & not.d(r0_23 s>> 0x1f)
                                int32_t r0_25 = *(r7_1 + 0xa0)
                                
                                if (r0_25 != 0)
                                    *(r8_2 - 0x14) = r0_25
                                    *(r8_2 - 0x10) = r0_25
                            else if (r9_1 == 3)
                                void* r0_56 = &var_3c84 + var_3cf4_1 * 0x34
                                var_3cf4_1 += 1
                                *(r8_2 - 0x14) = *(r0_56 + 8)
                                int32_t r0_57 = *(r0_56 + 0xc)
                                *(r8_2 - 0x10) = r0_57 & not.d(r0_57 s>> 0x1f)
                        
                        if (ascension::CCard::IsCardFaction(r7_1) == 0
                                && ascension::CWorld::QueryCardFaction(r5_1, r2_3, r0_20) != 0)
                            *r8_2 |= 4
                        
                        if (ascension::CCard::IsCardFaction(r7_1) == 0
                                && ascension::CWorld::QueryCardFaction(r5_1, r2_3, r0_20) != 0)
                            *r8_2 |= 2
                        
                        if (ascension::CCard::IsCardFaction(r7_1) == 0
                                && ascension::CWorld::QueryCardFaction(r5_1, r2_3, r0_20) != 0)
                            *r8_2 |= 8
                        
                        if (ascension::CCard::IsCardFaction(r7_1) == 0
                                && ascension::CWorld::QueryCardFaction(r5_1, r2_3, r0_20) != 0)
                            *r8_2 |= 0x10
                        
                        int32_t r0_50 = *(r8_2 - 0x20)
                        uint32_t r1_21
                        
                        if (r9_1 != 3)
                            int32_t temp0_1 = 0
                            uint32_t i_1 = r0_50 - 7
                            
                            while (i_1 != 0)
                                i_1 u>>= 1
                                temp0_1 += 1
                            
                            r1_21 = (0x20 - temp0_1) u>> 5
                        else
                            r1_21 = r0_50 - 7
                            
                            if (r0_50 != 7)
                                r1_21 = 1
                        
                        if ((var_3cf0_1 | r1_21) == 0)
                            int32_t r1_25 = *(r7_1 + 0xac)
                            
                            if (r1_25 s>= 1 && r1_25 s<= *(r5_1 + 0xb4c))
                                *(r8_2 - 4) |= 1
                            
                            uint32_t r0_55
                            
                            if (r0_50 != 7)
                                if (zx.d(*(r7_1 + 0x3e0)) != 0 && zx.d(var_3cdd) != 0)
                                    *(r8_2 - 4) |= 2
                                
                                r0_55 = zx.d(*(r7_1 + 0x3f4))
                            else
                                if (zx.d(*(r7_1 + 0x408)) != 0 && zx.d(var_3cdd) != 0)
                                    *(r8_2 - 4) |= 2
                                
                                r0_55 = zx.d(*(r7_1 + 0x41c))
                            
                            if (r0_55 != 0 && zx.d(var_3cde) != 0)
                                *(r8_2 - 4) |= 4
                
                r10_2 += 1
                r8_2 += 0x28
            while (r10_2 s< arg1)
        
        ascension::CEvent::~CEvent()
        ascension::CEvent::~CEvent()
        result = arg1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
